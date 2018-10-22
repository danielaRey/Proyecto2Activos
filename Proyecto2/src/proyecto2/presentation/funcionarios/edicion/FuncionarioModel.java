/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.funcionarios.edicion;

import proyecto2.logic.Funcionario;

/**
 *
 * @author oscar
 */
public class FuncionarioModel extends java.util.Observable {
    Funcionario current;
    int modo;    

//    public PersonaModel() {
//        this.reset();
//    }

    public void reset(){      
        setCurrent(new Funcionario());
    }
    
//    public void reset(int modo, Persona current){
//        this.setModo(modo);
//        this.setCurrent(current);
//        this.commit();
//    }
    
//    public void reset(){
//        this.reset(Application.MODO_AGREGAR,new Persona());     
//    }    

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public Funcionario getCurrent() {
        return current;
    }

    public void setCurrent(Funcionario current) {
        this.current = current;   
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit(){
        setChanged();
        notifyObservers();       
    }    
    
}
