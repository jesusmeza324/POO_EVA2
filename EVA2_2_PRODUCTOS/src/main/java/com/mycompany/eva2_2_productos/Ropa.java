/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_productos;

/**
 *
 * @author jesus
 */
public class Ropa extends Productos {
    private String talla;
    private String color;
    public Ropa(){
        super();
        color="sin color";
        talla="sin talla";
        
    }
    public Ropa(double precio,String clave,String marca,String tipo,String talla,String color){
        super(precio, clave, marca, tipo);
        this.color=color;
        this.talla=talla;
        
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void imprimirDatos(){
        System.out.println("Clave: "+ getClave());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Talla: "+ talla);
        System.out.println("Color: "+ color);
    }
    
}
