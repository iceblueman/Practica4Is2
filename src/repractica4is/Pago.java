/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repractica4is;
import java.util.List;
/**
 *
 * @author javier
 */
public class Pago {
    private int costeTotal;
    private Comprobante comprobante;
    private List<Reserva> reservas;
    public Pago(Comprobante comprobante){
        this.costeTotal=calcularPago();
        this.comprobante=comprobante;
    }
    private int calcularPago(){
        int costeDeReservas=0;
        //Calculo de coste de resevas
        return costeDeReservas;
    }
    public void generarComprobante(){
    
    }
    public void añadirReserva(){
        
    }
    public void pagarCredito(){
    
    }
    public void pagarPaypal(){
    
    }
}
