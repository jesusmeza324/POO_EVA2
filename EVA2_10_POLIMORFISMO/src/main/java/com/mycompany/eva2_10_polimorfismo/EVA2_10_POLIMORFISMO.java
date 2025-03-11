/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_polimorfismo;

/**
 *
 * @author jesus
 */
public class EVA2_10_POLIMORFISMO {

    public static void main(String[] args) {
        //polimorfismo-->multiples formas
            Empleado[] empleados=new Empleado[5];
            empleados[0]=new Empleado();
            empleados[1]=new Empleado("23","juan","perez",18);
            empleados[2]=new Empleado("40","juan","perez",19);
            empleados[3]=new Empleado("60","juan","perez",20);
            empleados[4]=new Empleado("50","juan","perez",78);
            Cliente[] clie=new Cliente[5];
            clie[0]=new Cliente("23","juan","perez",18);
            clie[1]=new Cliente("23","juan","perez",18);
            clie[2]=new Cliente("23","juan","perez",18);
            clie[3]=new Cliente("23","juan","perez",18);
            clie[4]=new Cliente("23","juan","perez",18);
           // for (int i = 0; i < empleados.length; i++) {
            //empleados[i].imprimirDatos();
       // }
            //System.out.println("---------------------");
            //for (int i = 0; i < clie.length; i++) {
            //clie[i].imprimirDatos();
       // }
       reporte(empleados);
        System.out.println("---------------");
       reporte(clie);
            
            
    }
    public static void reporte(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            personas[i].imprimirDatos();
        }
    }
}
