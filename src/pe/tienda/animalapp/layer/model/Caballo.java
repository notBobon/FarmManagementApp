/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author AntOniO
 */
public class Caballo extends Animal{

    public Caballo() {
        super.precioUnidad=13.5;
    }
    
    @Override
    public double calcularTotal(int total) {
        return total*precioUnidad;
    }
    
}
