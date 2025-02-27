/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_productos;

/**
 *
 * @author jesus
 */
public class Electronica extends Productos {
   private int tamaño;
    private int voltaje;
    public Electronica(){
        super();
        this.tamaño=0;
        this.voltaje=0;
        
    }
    public Electronica(double precio,String clave,String marca,String tipo,int tamaño,int voltaje){
        super(precio, clave, marca, tipo);
        this.tamaño=tamaño;
        this.voltaje=voltaje;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }
    public void imprimirDatos(){
        System.out.println("Clave: "+ getClave());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Tamaño: "+ tamaño);
        System.out.println("Voltaje: "+ voltaje);
    }
}
