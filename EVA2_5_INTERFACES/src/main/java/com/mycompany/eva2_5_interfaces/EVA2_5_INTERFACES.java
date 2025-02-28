/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_interfaces;

/**
 *
 * @author jesus
 */
public class EVA2_5_INTERFACES {

    public static void main(String[] args) {
        //interfaces-->tipo de dato abtracto
        //no se pueden instanciar solo tiene metodos abstractos
        //-->metodo sin implementacion
        //son para obligar a una clase que se comporte de cierta manera
        //tener ciertos metodos e implementarlos
        Vehiculo vehi=new Vehiculo("Ford","focus","cafe",2012,1234);
        vehi.mostrarDatos();
        Cliente clie=new Cliente("juan","perez","kasnda");
        clie.mostrarDatos();
        Television tv=new Television(true,100,100);
        tv.mostrarDatos();
        
    }
}
