/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_interfaces;

/**
 *
 * @author jesus
 */
public class Vehiculo implements Datos {
    private String marca;
    private String modelo;
    private String color;
    private int year;
    private double precio;
    public Vehiculo(){
        marca="sin marca";
        modelo="sin modelo";
        color="sin color";
        year=0;
        precio=0;
    }
    public Vehiculo(String marca,String modelo, String color,int year,int precio){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.year=year;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Anio: "+year);
        System.out.println("precio: "+precio);
    }
    
    
}
