/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rodrigo Meléndez
 */
public class ModelGeneral {
    Session ses;
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        ModelGeneral.connection = connection;
    }
     
    private static ModelGeneral uniqueInstance;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING = "jdbc:mysql://localhost/activos";
    
    public static ModelGeneral instance(){
        if (uniqueInstance == null){
            try{
                connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            }catch(SQLException e){}
            uniqueInstance = new ModelGeneral();
        }
        return uniqueInstance; 
    }
    private ModelGeneral(){
        ses = HibernateUtil.getSessionFactory().openSession();
    }
            
    public  Usuario getUsuario(String id, String password) throws Exception{
        Usuario u = (Usuario) ses.get(Usuario.class, id);
        if(u==null)  throw new Exception ("Usuario no existe");
        if (u.getPassword().equals(password)){
            Hibernate.initialize( u.getFuncionario());
            Hibernate.initialize( u.getFuncionario().getLabors());
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
    
    public  Solicitud getSolicitud(int codigo) throws Exception{
        Solicitud s = (Solicitud) ses.get(Solicitud.class, codigo);
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
    
    public void close() throws SQLException{
        ses.close();
        connection.close();
        HibernateUtil.stop();
    }
}
