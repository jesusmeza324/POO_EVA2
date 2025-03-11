/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_has;

/**
 *
 * @author jesus
 */
public class Cliente  {
    private String nombre;
    private String apellido;
    private String rfc;
    private int edad;
    private Direccion direccion;

    public Cliente() {
        this.nombre = "---";
        this.apellido = "---";
        this.rfc = "---";
        this.edad = 0;
        
    }

    public Cliente(String nombre, String apellido, String rfc, int edad,String calle, int numero, String colonia, String cp, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
        this.edad = edad;
        this.direccion=new Direccion( calle,numero,colonia,cp,ciudad);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String toString(){
        String cade="\n"+"datos del cliente:"+"\n"+"nombre: "+nombre+"\n"+
                "apellidos: "+apellido+"\n"+"edad: "+edad+"\n"+"direccion: "+
                direccion;
        return cade;
    }
    
    
}
