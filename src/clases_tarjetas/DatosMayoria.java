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
public class DatosMayoria {
   public String nombre="";
   public String dueño;
   public int precio; 
   public int paso;
   public int CantCasas=0;
   public int CantManciones=0;
   public int Pcasa1;
   public int Pcasa2;
   public int Pcasa3;
   public int Pcasa4;
   public int Pmansion1;
   public int ValorCasa;
   public int ValorMansion;
   public int alquiler;
   
   
    public DatosMayoria() {
    }
 public DatosMayoria(String nombre, String dueño, int precio, int paso, int CantCasas, int CantManciones, int Pcasa1, int Pcasa2, int Pcasa3, int Pcasa4, int Pmansion1, int ValorCasa, int ValorMansion, int alquiler) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.precio = precio;
        this.paso = paso;
        this.CantCasas = CantCasas;
        this.CantManciones = CantManciones;
        this.Pcasa1 = Pcasa1;
        this.Pcasa2 = Pcasa2;
        this.Pcasa3 = Pcasa3;
        this.Pcasa4 = Pcasa4;
        this.Pmansion1 = Pmansion1;
        this.ValorCasa = ValorCasa;
        this.ValorMansion = ValorMansion;
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

    public int getCantCasas() {
        return CantCasas;
    }

    public void setCantCasas(int CantCasas) {
        this.CantCasas = CantCasas;
    }

    public int getCantManciones() {
        return CantManciones;
    }

    public void setCantManciones(int CantManciones) {
        this.CantManciones = CantManciones;
    }

    public int getPcasa1() {
        return Pcasa1;
    }

    public void setPcasa1(int Pcasa1) {
        this.Pcasa1 = Pcasa1;
    }

    public int getPcasa2() {
        return Pcasa2;
    }

    public void setPcasa2(int Pcasa2) {
        this.Pcasa2 = Pcasa2;
    }

    public int getPcasa3() {
        return Pcasa3;
    }

    public void setPcasa3(int Pcasa3) {
        this.Pcasa3 = Pcasa3;
    }

    public int getPcasa4() {
        return Pcasa4;
    }

    public void setPcasa4(int Pcasa4) {
        this.Pcasa4 = Pcasa4;
    }

    public int getPmansion1() {
        return Pmansion1;
    }

    public void setPmansion1(int Pmansion1) {
        this.Pmansion1 = Pmansion1;
    }

    public int getValorCasa() {
        return ValorCasa;
    }

    public void setValorCasa(int ValorCasa) {
        this.ValorCasa = ValorCasa;
    }

    public int getValorMansion() {
        return ValorMansion;
    }

    public void setValorMansion(int ValorMansion) {
        this.ValorMansion = ValorMansion;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }
    
   
    

   
   
      
}
