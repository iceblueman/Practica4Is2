/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repractica4is;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author javier
 */
public class Hotel {
    private String localizacion;
    private String nombre;
    private int numHabitaciones;
    private int calificacion;
    private List<Habitacion> habitaciones;
    private List<Servicio> servicios;
    public Hotel(String localizacion,String nombre,int numHabitaciones,int calificacion){
        this.localizacion=localizacion;
        this.nombre=nombre;
        this.numHabitaciones=numHabitaciones;
        this.calificacion=calificacion;
        habitaciones=new ArrayList();
        servicios=new ArrayList();
    }
    public void añadir(TipoServicio tipoS,Reserva reserva,Hotel hotel){
        servicios.add(new Servicio(tipoS,hotel, reserva));
    }
    public String getLocalizacion(){
        return localizacion;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNumHab(){
        return numHabitaciones;
    }
    public int getCalificaciones(){
        return calificacion;
    }
    public void añadir(int numeroCamas,String tipo,Disponibilidad disp,Reserva reserva,Hotel hotel){
        habitaciones.add(new Habitacion( numeroCamas, tipo, disp,reserva, hotel));
    }
}
