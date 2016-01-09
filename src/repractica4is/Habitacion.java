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
public class Habitacion {
    private Disponibilidad disp;
    private int numeroCamas;
    private String tipo;
    private Reserva reserva;
    private Hotel hotel;
    public Habitacion(int numeroCamas,String tipo,Disponibilidad disp,Reserva reserva,Hotel hotel){
        this.disp=disp;
        this.numeroCamas=numeroCamas;
        this.tipo=tipo;
        this.reserva=reserva;
    }
    
    public int getNumero(){
        return numeroCamas;
    }
    public String getTipo(){
        return tipo;
    }
    public Disponibilidad Disponibilidad(){
        return disp;
    }
}
