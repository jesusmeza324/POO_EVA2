/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_sobreescritura;

/**
 *
 * @author jesus
 */
public class Persona {
    private String nombre;
     private String apellido;
     private int edad;
     public Persona(){
    this.nombre="sin nombre";
    this.apellido="sin apellido";
    this.edad=0;
}
    public Persona(String nombre,String apellido,int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void imprimirDatos(){
         System.out.println("Nombre: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+"Edad: "+edad);
         
     }
     @Override
     public String toString(){
         return "Nombre: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+"Edad: "+edad;
     }
    
}
