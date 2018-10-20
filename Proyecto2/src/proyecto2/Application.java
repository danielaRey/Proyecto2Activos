/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import proyecto2.logic.Dependencia;
import proyecto2.logic.Funcionario;
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
        Funcionario f = new Funcionario("001");
        Dependencia d = new Dependencia("EIF-201");
        Solicitud s = new Solicitud();
    }

}
