/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.dependencias.edicion;

import proyecto2.logic.Dependencia;

/**
 *
 * @author oscar
 */
public class DependenciaModel extends java.util.Observable{
    Dependencia current;

    public Dependencia getCurrent() {
        return current;
    }

    public void setCurrent(Dependencia current) {
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
