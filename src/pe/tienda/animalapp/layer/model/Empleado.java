/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author Alumno-CT
 */
public class Empleado implements Itrabajador{
    private String cargo;

    public Empleado(){
    
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public double getSueldo() {
        double sueldo = 0.0;
        if(this.cargo.equals(CARGO_COORDINADOR)){
            sueldo = CARGO_COORDINADOR_SUELDO;
        }else if(this.cargo.equals(CARGO_ASISTENTE)){
            sueldo = CARGO_ASISTENTE_SUELDO;            
        }else if(this.cargo.equals(CARGO_SECRETARIA)){
            sueldo = CARGO_SECRETARIA_SUELDO;
        }
        return sueldo;
    }
    
}
