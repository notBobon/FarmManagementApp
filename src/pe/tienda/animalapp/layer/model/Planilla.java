/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author Alumno-CT
 */
public class Planilla {
    public double calcularBono(Itrabajador trabajador){
        double bono = 0.0;
        if(trabajador instanceof Empleado){
            bono = trabajador.getSueldo();
        }else if(trabajador instanceof Docente){
            bono = trabajador.getSueldo()*0.60;
        }
        return bono;
    }
}
