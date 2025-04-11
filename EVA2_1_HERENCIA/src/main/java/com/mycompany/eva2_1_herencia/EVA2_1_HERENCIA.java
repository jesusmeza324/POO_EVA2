/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_herencia;

/**
 *
 * @author jesus
 */
public class EVA2_1_HERENCIA {

    public static void main(String[] args) {
        Persona perso=new Persona("juan","perez",18);
        System.out.println("Nombre:"+perso.getNombre());
        System.out.println("Apellido:"+perso.getApellido());
        System.out.println("Edad:"+perso.getEdad());
        
        Estudiante estu= new Estudiante();
        estu.setNombre("jesus");
        estu.setApellido("meza");
        estu.setEdad(18);
        estu.setNoControl("24550235");
        estu.imprimirDatos();
        
        Proveedor prov=new Proveedor();
        prov.setNombre("raul");
        prov.setApellido("allende");
        prov.setEdad(50);
        prov.setRfc("asasfafda");
        prov.imprimirDatos();
        Proveedor prov2=new Proveedor();
        prov2.imprimirDatos();
        
        Proveedor prov3=new Proveedor("XXX","YYY",18,"VSFGBSFS");
        prov3.imprimirDatos();
    }
}
