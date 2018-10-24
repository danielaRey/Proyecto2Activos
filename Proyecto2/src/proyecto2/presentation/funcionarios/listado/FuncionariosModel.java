/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.presentation.funcionarios.listado;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import proyecto2.logic.Funcionario;

/**
 *
 * @author oscar
 */
public class FuncionariosModel extends java.util.Observable{

    Funcionario filter; 
    FuncionarioTableModel funcionarios;
    Funcionario seleccionado;

    public FuncionariosModel() {
        this.reset();
    }

    public void reset(){ 
        filter = new Funcionario();
        List<Funcionario> rows = new ArrayList<>();        
        seleccionado=null;  
        this.setFuncionarios(rows);
        this.commit();  
    }
    
    public void setFuncionarios(List<Funcionario> personas){
        int[] cols={FuncionarioTableModel.ID,FuncionarioTableModel.NOMBRE};
        this.funcionarios =new FuncionarioTableModel(cols,personas);    
    }
    
    public Funcionario getFilter() {
        return filter;
    }
    
    public void setFilter(Funcionario filter) {
        this.filter = filter;
    }
    
     public FuncionarioTableModel getFuncionarios() {
        return funcionarios;
    }

    public Funcionario getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Funcionario seleccionado) {
        this.seleccionado = seleccionado;
    }
  
    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        this.commit();   
    }

    public void commit(){
        setChanged();
        notifyObservers();       
    }
}
