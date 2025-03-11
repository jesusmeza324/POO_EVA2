/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_polimorfismo;

/**
 *
 * @author jesus
 */
public class Persona {
   private String nombre;
   private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
    }

    public Persona(String nombre, String aepllido, int edad) {
        this.nombre = nombre;
        this.apellido = aepllido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String aepllido) {
        this.apellido = aepllido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
    }
    
}
