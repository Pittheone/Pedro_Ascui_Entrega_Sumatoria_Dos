/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Direccion {
    private String lugar;
    private String ciudad;
    private int precio;

    public Direccion() {
    }

    public Direccion(String lugar, String ciudad, int precio) {
        this.lugar = lugar;
        this.ciudad = ciudad;
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "lugar=" + lugar + ", ciudad=" + ciudad + ", precio=" + precio + '}';
    }
    
    
    
}
