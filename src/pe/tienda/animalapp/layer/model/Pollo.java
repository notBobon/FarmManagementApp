/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author AntOniO
 */
public class Pollo extends Animal{

    public Pollo() {
        super.precioUnidad=6.5;
    }

    @Override
    public double calcularTotal(int total) {
        return total*precioUnidad;
    }
    
}
