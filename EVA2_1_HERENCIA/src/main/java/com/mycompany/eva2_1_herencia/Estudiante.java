/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_1_herencia;

/**
 *
 * @author jesus
 */
public class Estudiante extends Persona {
   private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
     public void imprimirDatos(){
    System.out.println("Nombre proveedor: "+ getNombre());
    System.out.println("Apellido proveedor: "+ getApellido());
    System.out.println("Edad proveedor: "+ getEdad());
    System.out.println("RFC proveedor: "+ noControl);
}
   
 }
