/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author Alumno-CT
 */
public class Docente implements Itrabajador{
    private int horas;

    public Docente() {
    }

    public Docente(int horas) {
        this.horas = horas;
    }

    @Override
    public double getSueldo() {
        double sueldo;
        sueldo = this.horas * PAGO_HORA;
        return sueldo;
    }
    
    
}
