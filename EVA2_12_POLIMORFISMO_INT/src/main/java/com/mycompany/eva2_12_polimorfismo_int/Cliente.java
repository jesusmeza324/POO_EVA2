/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_12_polimorfismo_int;

/**
 *
 * @author jesus
 */
public class Cliente extends Persona {
    private String rfc;

    public Cliente() {
        super();
        this.rfc="----";
    }
    

    public Cliente(String rfc,String nombre, String aepllido, int edad) {
        super(nombre, aepllido, edad);
        this.rfc = rfc;
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
       System.out.println("RFC: "+ rfc);
       
   }
   
    
}
