/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_publicacion;

/**
 *
 * @author jesus
 */
public class Publicacion implements Datos {
    private  String titulo;
    private double precio;
    protected int copias;

    public Publicacion() {
        titulo="sin titulo";
        precio=0;
        copias=0;
    }

    public Publicacion(String titulo, double precio, int copias) {
        this.titulo = titulo;
        this.precio = precio;
        this.copias = copias;
    }
   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    protected int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }
    
   public void venderCopias(){
        if(copias>0){
            copias--;
            
        }else{
            System.out.println("Sin copias disponibles");
        }
        
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Copias: "+getCopias());
    }
    
    
    
    
}
