/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Guia;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
//Rol de la clase: administrar la lista de guías (mostrarlos y filtrarlos)
public class GestorGuias  {
    // Atributo privado: la lista donde se guardan los guías (encapsulamiento)
    private List<Guia> listaGuias;
    
    // Constructor: se ejecuta al crear el gestor y deja la lista vacía
    public GestorGuias() {
      this.listaGuias = new ArrayList<>();  
    }
       // Setter: guarda en el gestor la lista que leyó el archivo
    public void setListaGuias(List<Guia> guias){
        this.listaGuias = guias;
    }
    // Getter: devuelve la lista guardada para que otra clase pueda leerla
    public List<Guia>getListaGuias() {
        return listaGuias;
    }
    
    //listamos todos los registros
    public void mostrarTodos() {
        if(listaGuias.isEmpty()) {
            System.out.println("No hay guias registrados en el sistema");
            return;
        }
        // Recorre la lista
        for (Guia g : listaGuias) {
            System.out.println(g);
        }
        
    }
    //Filtrar por ciudad
    public List<Guia> buscarPorCiudad(String ciudad) {
       List<Guia> resultado = new ArrayList<>();
       for (Guia g : listaGuias) {
       if (g.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
                resultado.add(g);
            }    
       }
       return resultado;
    }
    //Filtrar por lugar.
       public List<Guia> buscarPorLugar(String lugar) {
       List<Guia> resultado = new ArrayList<>();
       for (Guia g : listaGuias) {
       if (g.getDireccion().getLugar().equalsIgnoreCase(lugar)) {
                resultado.add(g);
            }    
       }
       return resultado;
    }
}
