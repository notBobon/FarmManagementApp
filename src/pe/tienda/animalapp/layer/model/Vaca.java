/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.layer.model;

/**
 *
 * @author AntOniO
 */
public class Vaca extends Animal{

    public Vaca() {
        super.precioUnidad=14.5;
    }

    @Override
    public double calcularTotal(int total) {
        return total*precioUnidad;
    }
    
}
