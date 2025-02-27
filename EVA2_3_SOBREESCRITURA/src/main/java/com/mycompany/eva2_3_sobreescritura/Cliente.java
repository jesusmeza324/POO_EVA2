/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_sobreescritura;

/**
 *
 * @author jesus
 */
public class Cliente extends Persona {
    private String rfc;
    public Cliente(){
        super();
        rfc="-";
    }
    public Cliente(String nombre,String apellido,int edad, String rfc){
        super(nombre,apellido,edad);
        this.rfc=rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Rfc: "+rfc);
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"Rfc: "+rfc;
    }
}
