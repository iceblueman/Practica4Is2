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
public class Busqueda {
    private Filtro filtro;
    private String fechaIni;
    private String fechaFin;
    private ListaHoteles lista;
    private List<ResultadoBusqueda> resultados;
    
    public Busqueda(String fechaIni,String fechaFin,Filtro filtro){
        this.filtro=filtro;
        this.fechaFin=fechaFin;
        this.fechaIni=fechaIni;
        resultados=new ArrayList<ResultadoBusqueda>();
    }
    
    public void getListaHoteles(ListaHoteles lista){
        
    }
    public void buscar(){
        
    }
    public void añadir(String fecha1,String fecha2,Busqueda busqueda){
        resultados.add(new ResultadoBusqueda(fecha1,fecha2, busqueda));
    }
}
