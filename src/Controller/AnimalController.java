/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import pe.tienda.animalapp.layer.model.Animal;
import pe.tienda.animalapp.layer.model.Gallina;
import pe.tienda.animalapp.layer.model.Caballo;
import pe.tienda.animalapp.layer.model.Vaca;
import pe.tienda.animalapp.layer.model.Pollo;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author AntOniO
 */
public class AnimalController {
    public static final String COW_TYPE = "Cow";
    public static final String HORSE_TYPE = "Horse";
    public static final String CHICKEN_TYPE = "Chicken";
    public static final String ROOSTER_TYPE = "Rooster";
    
    public static int SOLD_COW_COUNT = 0;
    public static int SOLD_HORSE_COUNT = 0;
    public static int SOLD_CHICKEN_COUNT = 0;
    public static int SOLD_ROOSTER_COUNT = 0;
    
    public AnimalController() {
    }
 
    public Map<String, Double> process(String animalType, int quantity){
        Map<String, Double> totalSales = new HashMap<String, Double>();
        //Animal
        Animal animal = null; 
        switch (animalType){
            case HORSE_TYPE:
                animal = new Caballo();
                SOLD_HORSE_COUNT += quantity;
                break;
            case COW_TYPE:
                animal = new Vaca();
                SOLD_COW_COUNT += quantity;
                break;
            case CHICKEN_TYPE:
                SOLD_CHICKEN_COUNT += quantity;
                animal = new Gallina();
                break;
            case ROOSTER_TYPE:
                animal = new Pollo();
                SOLD_ROOSTER_COUNT += quantity;
                break;
            default:
                System.out.println("Not found");
                break;
        }
       //Process
        totalSales.put("Total", animal.calculateTotal(quantity));
        return totalSales;
    }
    
    public Map<String, Double> processClosingMoney(){
        Map<String, Double> totalSoles = new HashMap<String, Double>();
        totalSoles.put("Horse", new Caballo().calculateTotal(SOLD_HORSE_COUNT));
        totalSoles.put("Cow", new Vaca().calculateTotal(SOLD_COW_COUNT));
        totalSoles.put("Chicken", new Gallina().calculateTotal(SOLD_CHICKEN_COUNT));
        totalSoles.put("Rooster", new Pollo().calculateTotal(SOLD_ROOSTER_COUNT));
        totalSoles.put("Total", new Pollo().calculateTotal(SOLD_ROOSTER_COUNT) +
                new Gallina().calculateTotal(SOLD_CHICKEN_COUNT) +
                new Vaca().calculateTotal(SOLD_COW_COUNT) +
                new Caballo().calculateTotal(SOLD_HORSE_COUNT));
        return totalSoles;
    }
    
    public Map<String, Integer> processClosingAnimals(){
        Map<String, Integer> totalAnimals = new HashMap<String, Integer>();
        totalAnimals.put("Horse", SOLD_HORSE_COUNT);
        totalAnimals.put("Cow", SOLD_COW_COUNT);
        totalAnimals.put("Chicken", SOLD_CHICKEN_COUNT);
        totalAnimals.put("Rooster", SOLD_ROOSTER_COUNT);
        totalAnimals.put("Total", SOLD_ROOSTER_COUNT + SOLD_CHICKEN_COUNT +
                SOLD_COW_COUNT + SOLD_HORSE_COUNT);
        return totalAnimals;
    }
}

