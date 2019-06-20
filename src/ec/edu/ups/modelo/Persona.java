/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.excepciones.ValidarCedula;
import ec.edu.ups.excepciones.ValidarCelular;
import ec.edu.ups.excepciones.ValidarEdad;
import ec.edu.ups.excepciones.ValidarSueldo;

/**
 *
 * @author Domenica Cañizares
 */
public class Persona {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String nombre;
    private String apellido;
    private String cedula;
    private String fechaNac;
    private int edad;
    private String celular;
    private double sueldo;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ValidarCedula {

        if (cedula.length() == 10) {

            int pos = Integer.parseInt(cedula.substring(2, 3));
            if (pos <= 6) {

                int[] Validacion = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int cedu = Integer.parseInt(cedula.substring(9, 10));
                int a = 0;
                int d = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {

                    d = Integer.parseInt(cedula.substring(i, i + 1)) * Validacion[i];
                    a += ((d % 10) + (d / 10));

                }

                if ((a % 10 == 0) && (a % 10 == cedu)) {

                    this.cedula = cedula;

                } else if ((10 - (a % 10)) == cedu) {

                    this.cedula = cedula;

                } else {

                    throw new ValidarCedula();

                }
            } else {

                throw new ValidarCedula();

            }
        } else {

            throw new ValidarCedula();

        }

    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValidarEdad {

        if (edad >= 20 && edad <= 35) {
            this.edad = edad;
        } else {
            throw new ValidarEdad();
        }

    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws ValidarCelular {

        if (celular.length() == 10) {

            this.celular = celular;

        } else {

            throw new ValidarCelular();

        }

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) throws ValidarSueldo {

        if (sueldo != 0) {

            this.sueldo = sueldo;

        } else {

            throw new ValidarSueldo();

        }

    }

}
