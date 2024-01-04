
package pe.tienda.animalapp.layer.model;

public interface Itrabajador {
    //Cargos
    String CARGO_COORDINADOR = "COORDINADOR";
    String CARGO_ASISTENTE = "ASISTENTE";
    String CARGO_SECRETARIA = "SECRETARIA";
    
    String CARGO_JEFE_VENTAS = "JEFE VENTAS";
    String CARGO_EMPLEADO_VENTAS = "EMPLEADO VENTAS";
    String CARGO_ASISTENTE_VENTAS = "ASISTENTE VENTAS";
    //Sueldo
    double CARGO_COORDINADOR_SUELDO = 3000.0;
    double CARGO_ASISTENTE_SUELDO = 2500.0;
    double CARGO_SECRETARIA_SUELDO = 1800.0;
    //Pago por hora
    double PAGO_HORA = 70.0;    
    //Operaciones
    double getSueldo();
    
}
