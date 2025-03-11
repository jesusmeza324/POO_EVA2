/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_has;

/**
 *
 * @author jesus
 */
public class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;

    public Direccion() {
        this.calle = "---";
        this.numero = 0;
        this.colonia = "---";
        this.cp = "---";
        this.ciudad = "---";
    }
    

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String toString(){
        String cade="\n"+"calle: "+calle+"\n"+"numero: "+numero
                +"\n"+"colonia: "+colonia+"\n"+"cp: "+cp+"\n"+
                "ciudad: "+ciudad+"\n";
        return cade;
    }
    
    
}
