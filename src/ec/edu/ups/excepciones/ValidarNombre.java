/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author Domenica Cañizares
 */
public class ValidarNombre extends Exception {

    public ValidarNombre() {

        super("El nombre es menor a 50 caracteres");

    }

}
