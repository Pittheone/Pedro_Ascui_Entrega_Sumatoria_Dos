/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import model.Guia;
import service.GestorGuias;
import util.LectorArchivo;
import java.util.List;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n==============================================");
        System.out.println("Llanquihue Tour - Sistema de gestión.");
        System.out.println("\n==============================================");
        //Creamos el objeto gestor de guias.
        GestorGuias gestor = new GestorGuias(); 
        String rutaArchivo = "src/resources/guias.txt";
        
        //Carga de datos desde archivo
        System.out.println("1.Cargando datos desde archivo externo: ");
        List<Guia> guias = LectorArchivo.cargarDesdeArchivo(rutaArchivo);
        gestor.setListaGuias(guias);
        
        //listado completo.
        System.out.println("Catálogo");
        gestor.mostrarTodos();
        

        // 3. Filtrado por ciudad
        String ciudadFiltro = "Santiago";
        System.out.println("\n Busqueda por ciudad de Santiago: '" + ciudadFiltro.toUpperCase() + "'");
        System.out.println("----------------------------------------------");
        List<Guia> porCiudad = gestor.buscarPorCiudad(ciudadFiltro);
        for (Guia g : porCiudad) {
        System.out.println(g);
        }
      // 4. Filtrado por lugar
        String lugarFiltro = "Volcan";
        System.out.println("\n4. BÚSQUEDA Y FILTRADO POR LUGAR: '" + lugarFiltro.toUpperCase() + "'");
        System.out.println("----------------------------------------------");
        List<Guia> porLugar = gestor.buscarPorLugar(lugarFiltro);
        for (Guia g : porLugar) {
        System.out.println(g);
    }  
    }
    
}
