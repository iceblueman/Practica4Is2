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
public class ListaHoteles {
    private List<Hotel>hoteles;
    private Administrador admin;
    private Filtro filtro;
    public ListaHoteles(Administrador admin,Filtro filtro){
        hoteles=new ArrayList();
        this.admin=admin;
        this.filtro=filtro;
    }
    public void añadir(String localizacion,String nombre,int numHabitaciones,int calificacion){
        hoteles.add(new Hotel( localizacion, nombre, numHabitaciones, calificacion));
    }
    public List getLista(){
        return hoteles;
    }
}
