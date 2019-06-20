/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorPersona {

    private List<Persona> lista;
    private int codigo;

    public ControladorPersona() {
        lista = new ArrayList<>();
        codigo = 0;
    }

    //crear un num=evo objeto en la lista
    public void create(Persona objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    //leer un objeto en la lista por medio del codigo
    public Persona read(String cedula) {
        for (Persona per : lista) {
            if (per.getCedula() == cedula) {
                return per;
            }
        }
        return null;
    }

    //modificar un objeto en la lista por medio del codigo
    public void update(Persona objeto) {

        for (int i = 0; i < lista.size(); i++) {
            Persona elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
                break;
            }
        }

    }

    //eliminar un objeto por medio del codigo
    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Persona elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }

    //imprime todos los objetos de la lista
    public void print() {
        System.out.println("Lista \n");

        for (Persona per : lista) {
            System.out.println(per.getNombre());
        }
    }

}
