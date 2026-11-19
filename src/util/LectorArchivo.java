/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import model.Direccion;
import model.Guia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class LectorArchivo {

   public static List<Guia> cargarDesdeArchivo(String rutaArchivo) {

 List<Guia> lista = new ArrayList<>(); //Crea nuevo ArrayList
    //va leer el buffered, va a pasarlo a la variable br y que cargue el archivo de acuerdo de acuerdo a esa ruta(rutaArchivo)
    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea; //defino una varible String llamada línea
        while ((linea = br.readLine()) != null) { //mientas lee una línea y no sea nulo, sigue este while
            if (linea.trim().isEmpty()) { //si la línea está vacía, la salta y sigue con la siguiente.
                continue;
            }

            // Tenemos un arreglo que se llama partes, toma la línea con el split que es el punto y coma linea.split(";")
            String[] partes = linea.split(";");
            //Si el arreglo partes tiene 5 datos...
            if (partes.length == 5) {
                try {
                    String lugar = partes[0].trim(); //se guarda en 0
                    String ciudad = partes[1].trim(); //se guarda en 1
                    int precio = Integer.parseInt(partes[2].trim()); //se guarda en 2 y lo paso a int (parseInt)
                    String nombre = partes[3].trim(); //se guarda en 3
                    String rut = partes[4].trim(); //se guarda en 4

                    // Se crea la dirección y luego el guía que la contiene (composición).
                    Direccion d = new Direccion(lugar, ciudad, precio);
                    Guia g = new Guia(nombre, rut, d);
                    lista.add(g); //lo agrego a la lista. No agrego dirección porque dirección está dentro de la guia.

                } catch (NumberFormatException e) {
                    System.err.println("Error formato numérico en la linea " + linea);
                }
            }
        }

        System.out.println("Éxito: Se cargaron " + lista.size() + " Guias desde archivo");

    } catch (IOException e) {
        System.err.println("Error al leer el archivo: " + e.getMessage());
    }
    return lista;
}
}
