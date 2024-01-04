/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tienda.animalapp.controller;

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
    public static final String TIPO_VACA ="Vaca";
    public static final String TIPO_CABALLO = "Caballo";
    public static final String TIPO_GALLINA ="Gallina";
    public static final String TIPO_POLLO = "Pollo";
    
    public static int CANTIDAD_VENDIDO_VACA=0;
    public static int CANTIDAD_VENDIDO_CABALLO=0;
    public static int CANTIDAD_VENDIDO_GALLINA=0;
    public static int CANTIDAD_VENDIDO_POLLO=0;
    
            
    public AnimalController() {
    }
 
    public Map<String, Double> procesar(String tipoAnimal, int cantidad){
        Map<String,Double> totalSoles=new HashMap<String,Double>();
        //Animal
        Animal animal=null; 
        switch (tipoAnimal){
            case TIPO_CABALLO:
                animal=new Caballo();
                CANTIDAD_VENDIDO_CABALLO=CANTIDAD_VENDIDO_CABALLO+cantidad;
                break;
            case TIPO_VACA:
                animal=new Vaca();
                CANTIDAD_VENDIDO_VACA=CANTIDAD_VENDIDO_VACA+cantidad;
                break;
            case TIPO_GALLINA:
                CANTIDAD_VENDIDO_GALLINA=CANTIDAD_VENDIDO_GALLINA+cantidad;
                animal=new Gallina();
                break;
            case TIPO_POLLO:
                animal=new Pollo();
                CANTIDAD_VENDIDO_POLLO=CANTIDAD_VENDIDO_POLLO+cantidad;
                break;
            default:
                System.out.println("No encontré");
                break;
        }
       //Proceso
        totalSoles.put("Total", animal.calcularTotal(cantidad));
        return totalSoles;
    }
    
    public Map<String, Double> procesarCierreDinero(){
        Map<String,Double> totalSoles=new HashMap<String,Double>();
        totalSoles.put("Caballo", new Caballo().calcularTotal(CANTIDAD_VENDIDO_CABALLO));
        totalSoles.put("Vaca", new Vaca().calcularTotal(CANTIDAD_VENDIDO_VACA));
        totalSoles.put("Gallina", new Gallina().calcularTotal(CANTIDAD_VENDIDO_GALLINA));
        totalSoles.put("Pollo", new Pollo().calcularTotal(CANTIDAD_VENDIDO_POLLO));
        totalSoles.put("Todo", new Pollo().calcularTotal(CANTIDAD_VENDIDO_POLLO)+
                new Gallina().calcularTotal(CANTIDAD_VENDIDO_GALLINA)+
                new Vaca().calcularTotal(CANTIDAD_VENDIDO_VACA)+
                new Caballo().calcularTotal(CANTIDAD_VENDIDO_CABALLO));
        return totalSoles;
    }
    
    public Map<String, Integer> procesarCierreAnimales(){
        Map<String,Integer> totalAnimales=new HashMap<String,Integer>();
        totalAnimales.put("Caballo", CANTIDAD_VENDIDO_CABALLO);
        totalAnimales.put("Vaca", CANTIDAD_VENDIDO_VACA);
        totalAnimales.put("Gallina", CANTIDAD_VENDIDO_GALLINA);
        totalAnimales.put("Pollo", CANTIDAD_VENDIDO_POLLO);
        totalAnimales.put("Todo", CANTIDAD_VENDIDO_POLLO+CANTIDAD_VENDIDO_GALLINA+
                CANTIDAD_VENDIDO_VACA+CANTIDAD_VENDIDO_CABALLO);
        return totalAnimales;
    }
}
