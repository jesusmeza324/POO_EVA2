/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_extends_interfaz;

/**
 *
 * @author jesus
 */
public class Automovil implements MostrarMensaje {
    private String marca;
    private String modelo;

    public Automovil() {
        this.marca = "---";
        this.modelo = "---";
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
    

    @Override
    public void mostrarMensaje() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
