/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author jesus
 */
public class Circulo extends Figura implements Datos{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*radio*2;
        }

    @Override
    public void mostrarDatos() {
        System.out.println("Area circulo: "+calcularArea());
        System.out.println("Perimetro circulo: "+calcularPerimetro());    }
    
}
