/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetas;

/**
 *
 * @author edgar
 */
public class Datos {
   private String nombre;
   private String dueño;
   private int paso;
   private int chosas;
   private int manciones;
   private int valor_chosa;
   private int valor_mansion;
   private int alquiler;

    public Datos() {
    }

    public Datos(String nombre, String dueño, int paso, int chosas, int manciones, int valor_chosa, int valor_mansion, int alquiler) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.paso = paso;
        this.chosas = chosas;
        this.manciones = manciones;
        this.valor_chosa = valor_chosa;
        this.valor_mansion = valor_mansion;
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

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public int getChosas() {
        return chosas;
    }

    public void setChosas(int chosas) {
        this.chosas = chosas;
    }

    public int getManciones() {
        return manciones;
    }

    public void setManciones(int manciones) {
        this.manciones = manciones;
    }

    public int getValor_chosa() {
        return valor_chosa;
    }

    public void setValor_chosa(int valor_chosa) {
        this.valor_chosa = valor_chosa;
    }

    public int getValor_mansion() {
        return valor_mansion;
    }

    public void setValor_mansion(int valor_mansion) {
        this.valor_mansion = valor_mansion;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }
   
   
      
}
