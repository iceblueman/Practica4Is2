/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repractica4is;

/**
 *
 * @author javier
 */
public class Reserva {
    private int codigoReserva;
    private Pension pension;
    private HistorialReserva historial;
    private Pago pago;
    private Habitacion habitacion;
    
    public Reserva(int codigoReserva,Pension pension,HistorialReserva historial,Pago pago,Habitacion habitacion){
        this.codigoReserva=codigoReserva;
        this.pension=pension;
        this.historial=historial;
        this.pago=pago;
        this.habitacion=habitacion;
    }
    public void modRserva(){
    
    }
    public void añadir(CodigoPromocional cod){
    
    }
    public void reservarHabitacion(){
    
    }
    public void añadirPension(){
    
    }
    public void calcularPago(){
    
    }
}
