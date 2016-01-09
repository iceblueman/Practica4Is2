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
public class Servicio {
    private TipoServicio tipoS;
    private Hotel hotel;
    private Reserva reserva;
    public Servicio(TipoServicio tipoS,Hotel hotel,Reserva reserva){
        this.tipoS=tipoS;
        this.hotel=hotel;
        this.reserva=reserva;
    }
    
}
