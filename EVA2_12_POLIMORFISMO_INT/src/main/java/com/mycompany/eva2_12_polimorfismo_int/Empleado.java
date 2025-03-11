/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_12_polimorfismo_int;

/**
 *
 * @author jesus
 */
public class Empleado extends Persona {
    private String clave;

    public Empleado() {
        super();
        this.clave="---";
        
    }

    public Empleado(String clave,String nombre, String aepllido, int edad) {
        super(nombre, aepllido, edad);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    @Override
   public void imprimirDatos(){
       System.out.println("Clave: "+ clave);
       super.imprimirDatos();
   }
    
    
}
