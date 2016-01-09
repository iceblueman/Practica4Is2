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
public class Disponibilidad {
    private boolean disp;
    private String fechaIni;
    private String fechaFin;
    private Habitacion habitacion;
    
    
    public Disponibilidad(String fechaIni,String fechaFin,boolean disp,Habitacion habitacion){
        this.disp=disp;
        this.fechaFin=fechaFin;
        this.fechaIni=fechaIni;
        this.habitacion=habitacion;
    }
}
