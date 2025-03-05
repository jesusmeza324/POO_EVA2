/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_publicacion;

/**
 *
 * @author jesus
 */
public class EVA2_7_PUBLICACION {

    public static void main(String[] args) {
        Publicacion pub=new Publicacion("IT",1234,78);
        pub.mostrarDatos();
        pub.venderCopias();
        System.out.println("");
        pub.mostrarDatos();
        System.out.println("");
        System.out.println("Revistas:");
        Revista rev=new Revista("20-3-25","Muy interesante",1234,90);
        rev.mostrarDatos();
        System.out.println("");
        rev.recibirEdicion("23-4-25");
        rev.hacerEdiciones(10);
        rev.mostrarDatos();
        System.out.println("");
        System.out.println("Libros:");
        Libro lib=new Libro("Juan","el principito",1234,90);
        lib.mostrarDatos();
        lib.guardarCopias(10);
        System.out.println("");
        lib.mostrarDatos();
        
       
        
    }
}
