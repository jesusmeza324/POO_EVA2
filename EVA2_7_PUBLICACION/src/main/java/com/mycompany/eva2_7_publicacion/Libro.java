/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_publicacion;

/**
 *
 * @author jesus
 */
public class Libro extends Publicacion implements Datos {
    private String autor;

    public Libro() {
        super();
        autor="sin autor";
    }
    public Libro(String autor,String titulo,double precio,int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void guardarCopias(int cantidad){
        this.copias+=cantidad;
       
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+autor);
        System.out.println("Precio: "+getPrecio());
        System.out.println("Copias: "+getCopias());
        
        
        }
        
    
        
    
    
    
    
}
