/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Horse extends Animal{

    public Horse() {
        super.unitPrice = 13.5;
    }
    
    @Override
    public double calculateTotal(int quantity) {
        return quantity * unitPrice;
    }
}
