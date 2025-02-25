/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_1_herencia;

/**
 *
 * @author jesus
 */
public class Proveedor extends Persona {
     private String rfc;
     public Proveedor(){
         super();
         this.rfc="SIN RFC";
     }
     public Proveedor(String nombre,String apellido,int edad,String rfc){
         super(nombre,apellido,edad);
         this.rfc=rfc;
     }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
        public void imprimirDatos(){
    System.out.println("Nombre proveedor: "+ getNombre());
    System.out.println("Apellido proveedor: "+ getApellido());
    System.out.println("Edad proveedor: "+ getEdad());
    System.out.println("RFC proveedor: "+ rfc);
}
    
}
