/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_productos;

/**
 *
 * @author jesus
 */
public class Productos {
    private double precio;
    private String clave;
    private String Marca;
    private String tipo;
    public Productos(){
        precio=0;
        clave="sin clave";
        Marca="sin marca";
        tipo="sin tipo";
        }
    public Productos(double precio,String clave,String marca,String tipo){
        this.precio=precio;
        this.clave=clave;
        this.Marca=marca;
        this.tipo=tipo;
        }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimirDatos(){
        System.out.println("Clave: "+ getClave());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Tipo: "+ getTipo());
    }
    
    
}
