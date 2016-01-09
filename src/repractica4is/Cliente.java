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
public class Cliente extends Usuario{
    private String nombre;
    private String contraseña;
    private String correo;
    private Busqueda busqueda;
    private HistorialReserva historial;
    public Cliente(String correo){
        this.correo=correo;
        this.historial=new HistorialReserva();
    }
    
    public void identificarse(){

    }
    public void realizarBusqueda(String fechaIni,String fechaFin, Filtro filtro){
        busqueda=new Busqueda(fechaIni,fechaFin,filtro);
    }
        
}
