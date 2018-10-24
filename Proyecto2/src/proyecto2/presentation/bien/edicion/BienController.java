/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.bien.edicion;

import java.awt.Point;
import org.hibernate.Session;
import proyecto2.logic.Bien;

/**
 *
 * @author Rodrigo Meléndez
 */
public class BienController {
    BienView view;
    BienModel model;
    Session session;
    
    public BienController(BienView view, BienModel model, Session session) {
        this.view = view;
        this.model = model;
        this.session = session;
//        view.setController(this);
//        view.setModel(model);
    }
    
    public void reset(){
        model.reset();
    }
    
//    public void reset(int modo, Bien current){
//        model.reset(modo, current);
//    }    
    
    public void show(){
        view.setVisible(true);
    }
    
    public void hide(){
        view.setVisible(false);
    } 

    public void show(Point position){
        view.setLocation(position);
        this.show();
    } 
    
    public void guardar(Bien bien) throws Exception{ 
//        Transaction t = session.beginTransaction();
//        switch(model.getModo()){
//            case Application.MODO_AGREGAR:
//                session.save(funcionario);
//                t.commit();
//                //Application.FUNCIONARIOS_CONTROLLER.refrescarBusqueda();                   
//                model.setCurrent(new Funcionario());
//                model.commit();   
//                break;
//            case Application.MODO_EDITAR:
//                session.update(funcionario);
//                 t.commit();
//                //Application.FUNCIONARIOS_CONTROLLER.refrescarBusqueda();               
//                break;
    }   
}
