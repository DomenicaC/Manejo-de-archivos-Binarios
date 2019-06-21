/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.excepciones.ValidarApellido;
import ec.edu.ups.excepciones.ValidarCedula;
import ec.edu.ups.excepciones.ValidarCelular;
import ec.edu.ups.excepciones.ValidarEdad;
import ec.edu.ups.excepciones.ValidarFechaNac;
import ec.edu.ups.excepciones.ValidarNombre;
import ec.edu.ups.excepciones.ValidarSueldo;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public void setNombre(String nombre) throws ValidarNombre {

        boolean v = false;

        if (v != true) {

            while (nombre.length() < 50) {

                nombre = nombre + "a";
                //v = false;
                
            }

            this.nombre = nombre;
            v = true;

        } else {

            //v = true;
            throw new ValidarNombre();

        }

        System.out.println("Nombre " + nombre);

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ValidarApellido {

        boolean v = false;

        if (v != true) {

            while (apellido.length() < 50) {

                apellido = apellido + "a";
                //v = false;

            }

            this.apellido = apellido;
            v = true;

        } else {

            //v = true;
            throw new ValidarApellido();

        }

        System.out.println("Apellido " + apellido);

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

        System.out.println("Cedula " + cedula);

    }

    public String getFechaNac() {

        return fechaNac;

    }

    public void setFechaNac(String fechaNac) throws ValidarFechaNac {

        String resp = "/";
        boolean corr = false;

        if (fechaNac.length() == 10) {
            /*if (String.valueOf(fechaNac.charAt(2)).equals(resp) && String.valueOf(fechaNac.charAt(5)).equals(resp)) {
             //dia
             if (fechaNac.charAt(0) > 0 && fechaNac.charAt(0) < 4) {
             if (fechaNac.charAt(1) > 0 && fechaNac.charAt(1) < 9) {
             //mes
             if (fechaNac.charAt(3) == 1) {
             if (fechaNac.charAt(4) > 0 && fechaNac.charAt(4) < 3) {
             //año
             if (fechaNac.charAt(6) > 0 && fechaNac.charAt(6) < 3) {
             if (fechaNac.charAt(6) == 1) {
             if (fechaNac.charAt(7) >= 0 && fechaNac.charAt(7) <= 9) {
             if (fechaNac.charAt(8) >= 0 && fechaNac.charAt(8) <= 9) {
             if (fechaNac.charAt(9) >= 0 && fechaNac.charAt(9) <= 9) {
             this.fechaNac = fechaNac;
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             ///
             } else if (fechaNac.charAt(6) == 2) {
             if (fechaNac.charAt(7) == 0) {
             if (fechaNac.charAt(8) >= 0 && fechaNac.charAt(8) <= 9) {
             if (fechaNac.charAt(9) >= 0 && fechaNac.charAt(9) <= 9) {
             this.fechaNac = fechaNac;
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }

             } else {
             throw new ValidarFechaNac();
             }

             } else {
             throw new ValidarFechaNac();
             }

             } else {
             throw new ValidarFechaNac();
             }

             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();
             }
             } else {
             throw new ValidarFechaNac();*/
        }
        System.out.println("Fecha Nacimiento " + fechaNac);
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

        System.out.println("Edad " + edad);

    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws ValidarCelular {

        if (celular.length() == 10) {

            /*if (celular.charAt(0) == 0) {

             if (celular.charAt(1) == 9) {

             this.celular = celular;

             }

             } else {

             throw new ValidarCelular();

             }*/
        } else {

            throw new ValidarCelular();

        }

        System.out.println("Celular " + celular);

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

        System.out.println("Sueldo " + sueldo);

    }

}
