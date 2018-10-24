/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto2.logic.Bien;
import proyecto2.logic.Categoria;
import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
import proyecto2.logic.HibernateUtil;
import proyecto2.logic.ModelGeneral;
import proyecto2.logic.Solicitud;
import proyecto2.presentation.application.ApplicationController;
import proyecto2.presentation.application.ApplicationModel;
import proyecto2.presentation.application.ApplicationView;
import proyecto2.presentation.bien.edicion.BienController;
import proyecto2.presentation.bien.edicion.BienModel;
import proyecto2.presentation.bien.edicion.BienView;
import proyecto2.presentation.dependencias.edicion.DependenciaController;
import proyecto2.presentation.dependencias.edicion.DependenciaModel;
import proyecto2.presentation.dependencias.edicion.DependenciaView;
import proyecto2.presentation.dependencias.listado.DependenciasController;
import proyecto2.presentation.dependencias.listado.DependenciasModel;
import proyecto2.presentation.dependencias.listado.DependenciasView;
import proyecto2.presentation.funcionarios.edicion.FuncionarioController;
import proyecto2.presentation.funcionarios.edicion.FuncionarioModel;
import proyecto2.presentation.funcionarios.edicion.FuncionarioView;
import proyecto2.presentation.funcionarios.listado.FuncionariosController;
import proyecto2.presentation.funcionarios.listado.FuncionariosModel;
import proyecto2.presentation.funcionarios.listado.FuncionariosView;

/**
 *
 * @author Dani
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        // Transaction t = session.beginTransaction();
        // Funcionario f = new Funcionario("005");
        //Dependencia d= new Dependencia("EIF201"); ->no se puede duplicar
        // Crea Solicitud y sus Bienes
        //ses.save(d); -> no se hace si no se agrega nada
        // t.commit();
//        Transaction t = ses.beginTransaction();
        Transaction t = session.beginTransaction();
        ModelGeneral model = proyecto2.logic.ModelGeneral.instance();
//        try (Statement stm = proyecto2.logic.ModelGeneral.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//                ResultSet rs = stm.executeQuery("select * from funcionario where id like '%0%'");) {
//            List<Funcionario> resultado = new ArrayList<Funcionario>();
//            while (rs.next()) {
//                resultado.add(new Funcionario(rs.getString("id"), rs.getString("nombre")));
//            }
//            for (int i = 0; i < resultado.size(); i++) {
//                System.out.println(resultado.get(i).toString());
//            }
//
//        } catch (SQLException e) {
//        }

//        Funcionario f = new Funcionario("005");
//        ses.save(f);
//        t.commit();
//        String filtro="5";
        //probando
        //---------------------------
        //String sql="select * from "+
        //         "funcionario"+
        //       "where id like '%%%s%%'";
        //sql=String.format(sql);
        //-------------------------
//            ResultSet rs =  session;
//        String s="5";
//         String sql="select * from funcionario where id like '%"+s+"'";
//            ResultSet rs = session.createQuery(sql);
//            System.out.println(sql);
//        } catch (SQLException ex) { }
//        List<Funcionario> rows = domainModel.searchPersonas(model.getFilter());
//        model.setPersonas(rows);
//        model.commit();
//        if (rows.isEmpty()) throw new Exception("Ningún dato coincide");
        //probando
//        FuncionarioModel funcionarioModel = new FuncionarioModel();
//        FuncionarioView funcionarioView = new FuncionarioView(/*applicationView, true*/);
//        FuncionarioController funcionarioController = new FuncionarioController(funcionarioView, funcionarioModel, session);
//        FUNCIONARIO_CONTROLLER = funcionarioController;
//        funcionarioView.setVisible(true);
//                 
          //probando
//        FuncionarioModel funcionarioModel = new FuncionarioModel();
//        FuncionarioView funcionarioView = new FuncionarioView(/*applicationView, true*/);
//        FuncionarioController funcionarioController = new FuncionarioController(funcionarioView, funcionarioModel, session);
//        FUNCIONARIO_CONTROLLER = funcionarioController;
//        funcionarioView.setVisible(true);
//
//        DependenciaModel dependenciaModel = new DependenciaModel();
//        DependenciaView dependenciaView = new DependenciaView();
//        DependenciaController dependenciaController = new DependenciaController(dependenciaView, dependenciaModel, session);
//        DEPENDENCIA_CONTROLLER = dependenciaController;
//        dependenciaView.setVisible(true);
        ApplicationModel applicationModel = new ApplicationModel();
        ApplicationView applicationView= new ApplicationView();
        ApplicationController applicationController = new ApplicationController(applicationView,applicationModel,session);
        APPLICATION_CONTROLLER = applicationController;
        
     
        
//        DependenciasModel dependenciasModel=new DependenciasModel();
//        DependenciasView dependenciasView=new DependenciasView();
//        applicationView.addInternalFrame(dependenciasView);
//        DependenciasController dependenciasController=new DependenciasController(dependenciasView,dependenciasModel,session);
//        DEPENDENCIAS_CONTROLLER=dependenciasController;
//        //dependenciasView.setVisible(true);
        
            FuncionariosModel funcionariosModel = new FuncionariosModel();
        FuncionariosView funcionariosView = new FuncionariosView();
        applicationView.addInternalFrame(funcionariosView);
        FuncionariosController funcionariosController = new FuncionariosController(funcionariosView, funcionariosModel, session);
        FUNCIONARIOS_CONTROLLER = funcionariosController;
        applicationView.setVisible(true);
    }

    public static FuncionarioController FUNCIONARIO_CONTROLLER;
    public static FuncionariosController FUNCIONARIOS_CONTROLLER;
    public static DependenciaController DEPENDENCIA_CONTROLLER;
    public static DependenciasController DEPENDENCIAS_CONTROLLER;
    public static ApplicationController APPLICATION_CONTROLLER; 
//        Transaction t = ses.beginTransaction();
//        Funcionario f = new Funcionario("005");
//        Dependencia d= new Dependencia("EIF200");
//        // Crea Solicitud y sus Bienes
//        ses.save(f);
//        t.commit();

    // public static FuncionarioController FUNCIONARIO_CONTROLLER;
    public static final int MODO_AGREGAR = 0;
    public static final int MODO_EDITAR = 1;
    public static final int MODO_CONSULTAR = 2;

    public static final Color COLOR_ERROR = Color.red;

    public static final Color COLOR_OK = Color.black;
}

// public static final Color COLOR_OK = Color.black;

