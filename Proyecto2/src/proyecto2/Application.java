/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
<<<<<<< HEAD
=======
import java.sql.ResultSet;
>>>>>>> 078a2deb96165665b9d858065389d42356e34e9a
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto2.logic.Bien;
import proyecto2.logic.Categoria;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.HibernateUtil;
import proyecto2.logic.Solicitud;
import proyecto2.presentation.funcionarios.edicion.FuncionarioController;
import proyecto2.presentation.funcionarios.edicion.FuncionarioModel;
import proyecto2.presentation.funcionarios.edicion.FuncionarioView;

/**
 *
 * @author Dani
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Funcionario f = new Funcionario("001");
//        Categoria c;
//        Dependencia d = new Dependencia("EIF-201");
//        Solicitud s = new Solicitud(d,f, new Date(),4,"Compra",20000.0,"recibida","256",null);
//        s.getBiens().add(new Bien());

        Session session = HibernateUtil.getSessionFactory().openSession();
      
<<<<<<< HEAD
        Transaction t = ses.beginTransaction();
       // Funcionario f = new Funcionario("005");
        //Dependencia d= new Dependencia("EIF201"); ->no se puede duplicar
        // Crea Solicitud y sus Bienes
        //ses.save(d); -> no se hace si no se agrega nada
        t.commit();
=======
//        Transaction t = ses.beginTransaction();
//        Funcionario f = new Funcionario("005");
//        ses.save(f);
//        t.commit();
       
//        String filtro="5";
         String sql="select * from "+
                    "funcionario"+
                    "where id like '%%%s%%'";
          sql=String.format(sql);
//            ResultSet rs =  session;
//            System.out.println(sql);
//            while (rs.next()) {
//                resultado.add(persona(rs));
//            }
//        } catch (SQLException ex) { }
//        List<Funcionario> rows = domainModel.searchPersonas(model.getFilter());
//        model.setPersonas(rows);
//        model.commit();
//        if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
                 
                 
        FuncionarioModel funcionarioModel = new FuncionarioModel();
        FuncionarioView funcionarioView = new FuncionarioView(/*applicationView, true*/);
        FuncionarioController funcionarioController = new FuncionarioController(funcionarioView, funcionarioModel, session);
        FUNCIONARIO_CONTROLLER = funcionarioController;
        funcionarioView.setVisible(true);
        
        
>>>>>>> 078a2deb96165665b9d858065389d42356e34e9a
    }
    
    public static FuncionarioController FUNCIONARIO_CONTROLLER;
//        Transaction t = ses.beginTransaction();
//        Funcionario f = new Funcionario("005");
//        Dependencia d= new Dependencia("EIF200");
//        // Crea Solicitud y sus Bienes
//        ses.save(f);
//        t.commit();
    public static final int MODO_AGREGAR = 0;
    public static final int MODO_EDITAR = 1;
    public static final int MODO_CONSULTAR = 2;
<<<<<<< HEAD
    
    public static final Color COLOR_ERROR = Color.red;
    public static final Color COLOR_OK=Color.black; 
}
=======
    public static final Color COLOR_ERROR = Color.red;
    public static final Color COLOR_OK = Color.black;
    }
    
    
  
   
>>>>>>> 078a2deb96165665b9d858065389d42356e34e9a
