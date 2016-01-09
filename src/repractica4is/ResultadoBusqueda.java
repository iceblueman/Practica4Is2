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
public class ResultadoBusqueda {
    private boolean habDisp;
    private Busqueda busqueda;
    private String fechaIni,fechaFin;
    private List<Habitacion> habitaciones;
    public ResultadoBusqueda(String fechaIni,String fechaFin,Busqueda busqueda){
        this.fechaFin=fechaFin;
        this.fechaIni=fechaIni;
        this.busqueda=busqueda;
        habitaciones=new ArrayList<>();
    }
    public boolean estaDisp(List<Habitacion> habitaciones){
        return habDisp;
    }
    public void añadir(Habitacion habitacion){
        habitaciones.add(habitacion);
    }
}
