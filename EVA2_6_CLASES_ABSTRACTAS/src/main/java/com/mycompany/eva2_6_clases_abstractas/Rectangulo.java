/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author jesus
 */
public class Rectangulo extends Figura implements Datos {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base+altura)*(2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Area rectangulo: "+calcularArea());
        System.out.println("Perimetro rectangulo: "+calcularPerimetro());
    }
    
}
