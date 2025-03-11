/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_polimorfismo_int;

/**
 *
 * @author jesus
 */
public class EVA2_12_POLIMORFISMO_INT {

    public static void main(String[] args) {
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
            reporte(empleados);
            
            reporte(clie);
            //otroMetodo(clie);
    }
    public static void reporte(MostrarDatos[] datos){
        if(datos instanceof Empleado[]){
            System.out.println("Datos de los empleados: ");
        }else{
            System.out.println("Datos de los clientes: ");
        }
        for (int i = 0; i < datos.length; i++) {
            datos[i].imprimirDatos();
        }
    }
    public static void otroMetodo(Object[] objetos){
        System.out.println(objetos);
    }
}
