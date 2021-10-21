/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_tarjetas;

/**
 *
 * @author edgar
 */
public class DatosMinoria {
   public String nombre;
   public String dueño;
   public int precio;
   public int paso;
   public int alquiler;

    public DatosMinoria() {
    }

    public DatosMinoria(String nombre, String dueño, int precio, int paso, int alquiler) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.precio = precio;
        this.paso = paso;
        this.alquiler = alquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

      
   
}
