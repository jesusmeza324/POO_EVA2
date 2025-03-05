/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_publicacion;

/**
 *
 * @author jesus
 */
public class Revista extends Publicacion implements Datos {
    private String numeroActual;

    public Revista() {
        super();
        numeroActual="sin numero actual";
    }

    public Revista(String numeroActual, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.numeroActual = numeroActual;
    }
   public void recibirEdicion(String nuevaEdicion){
       this.numeroActual=nuevaEdicion;
       
   }
   public void hacerEdiciones(int cantidad){
       this.copias+=cantidad;
       
   }

    public String getNumeroActual() {
        return numeroActual;
    }

    public void setNumeroActual(String numeroActual) {
        this.numeroActual = numeroActual;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Copias: "+getCopias());
        System.out.println("Edicion: "+numeroActual);
        
        }
}
