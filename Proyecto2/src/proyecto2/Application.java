/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto2.logic.Bien;
import proyecto2.logic.Categoria;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.HibernateUtil;
import proyecto2.logic.Solicitud;

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

        Session ses = HibernateUtil.getSessionFactory().openSession();
      
        Transaction t = ses.beginTransaction();
          Funcionario f = new Funcionario("005");
        
        // Crea Solicitud y sus Bienes
        ses.save(f);
        t.commit();
    }
    
    public static final int MODO_AGREGAR = 0;
    public static final int MODO_EDITAR = 1;
    public static final int MODO_CONSULTAR = 2;
}
