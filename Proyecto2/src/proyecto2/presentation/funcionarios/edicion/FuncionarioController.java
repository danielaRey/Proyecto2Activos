/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.funcionarios.edicion;

import java.awt.Point;
import org.hibernate.Session;
import proyecto2.Application;
import proyecto2.logic.Funcionario;

/**
 *
 * @author oscar
 */
public class FuncionarioController {
    //Model domainModel;  
    FuncionarioView view;
    FuncionarioModel model;
    Session session; 
    public FuncionarioController(FuncionarioView view, FuncionarioModel model, Session session) {
        this.view = view;
        this.model = model;
        this.session = session;
        
        view.setController(this);
        view.setModel(model);
    }
    
     public void reset(){
        model.reset();
    }
    
    public void reset(int modo, Funcionario current){
//        model.reset(modo, current);
    }    
    
    public void show(){
        view.setVisible(true);
    }

    public void show(Point position){
        view.setLocation(position);
        this.show();
    }   
    
    public void hide(){
        view.setVisible(false);
    }  
    
     public void guardar(Funcionario funcionario) throws Exception{  
//        switch(model.getModo()){
//            case Application.MODO_AGREGAR:
//                session.save(funcionario);
//                domainModel.addPersona(funcionario);
//                Application.PERSONAS_CONTROLLER.refrescarBusqueda();                   
//                model.setCurrent(new Funcionario());
//                model.commit();   
//                break;
//            case Application.MODO_EDITAR:
//                domainModel.updatePersona(funcionario);
//                Application.PERSONAS_CONTROLLER.refrescarBusqueda();               
//                break;
//        }   
    } 
  
      
}
