/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.logic;

//import activos.data.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author jsanchez
 */
public class Model {  
    Session ses;
     
    private static Model uniqueInstance;
    
    public static Model instance(){
        if (uniqueInstance == null){
            uniqueInstance = new Model();
        }
        return uniqueInstance; 
    }
    private Model(){
        ses = HibernateUtil.getSessionFactory().openSession();
    }
            
    public  Usuario getUsuario(String id, String clave) throws Exception{
        Usuario u = (Usuario) ses.get(Usuario.class, id);
        if(u==null)  throw new Exception ("Usuario no existe");
        if (u.getClave().equals(clave)){
            Hibernate.initialize( u.getFuncionario());
            Hibernate.initialize( u.getFuncionario().getDependencias());
            ses.evict(u);
            return u;
        }
        else{
            throw new Exception ("Clave incorrecta");
        }
    }

    public  Dependencia getDependencia(int codigo) throws Exception{
        Dependencia d = (Dependencia) ses.get(Dependencia.class, codigo);
        Hibernate.initialize(d.getSolicituds());
        ses.evict(d);
        return d;
    }
    
    public  Solicitud getSolicitud(int numero) throws Exception{
        Solicitud s = (Solicitud) ses.get(Solicitud.class, numero);
        Hibernate.initialize(s.getBiens());
        ses.evict(s);
        return s;
    }    
    
    public void agregarSolicitud(Solicitud solicitud){
        Transaction t = ses.beginTransaction();
        ses.persist(solicitud);
        t.commit();        
    }

    public void actualizarSolicitud(Solicitud solicitud){
        Transaction t = ses.beginTransaction();
        ses.merge(solicitud);
        t.commit();        
    }
    
    public void close(){
        ses.close();
        HibernateUtil.stop();
    }
}
