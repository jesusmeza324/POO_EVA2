/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_interfaces;

/**
 *
 * @author jesus
 */
public class Cliente implements Datos{
    private String nombre;
    private String apellido;
    private String rfc;
    public Cliente(){
        nombre="sin nombre";
        apellido="sin apellido";
        rfc="-";
    }
    public Cliente(String nombre, String apellido,String rfc){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rfc=rfc;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido);
        System.out.println("RFC: "+rfc);
        }
    
}
