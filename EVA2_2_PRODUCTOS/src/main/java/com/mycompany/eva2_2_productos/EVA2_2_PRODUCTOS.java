/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_productos;

/**
 *
 * @author jesus
 */
public class EVA2_2_PRODUCTOS {

    public static void main(String[] args) {
        Productos produ=new Productos();
        System.out.println("Datos default:");
        System.out.println("");
        produ.imprimirDatos();
        System.out.println("");
        System.out.println("Datos ropa:");
        System.out.println("");
        Ropa rop=new Ropa(1234,"AB500","CK","PANTALON","34","AZUL");
        rop.imprimirDatos();
        System.out.println("");
        System.out.println("Datos electronica:");
        System.out.println("");
        Electronica ele=new Electronica(1234,"2207","Samsung","television",22,120);
        ele.imprimirDatos();
    }
}
