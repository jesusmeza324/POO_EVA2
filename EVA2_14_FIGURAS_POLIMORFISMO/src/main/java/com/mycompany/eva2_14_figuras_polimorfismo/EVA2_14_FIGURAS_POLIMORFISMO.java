/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_figuras_polimorfismo;

/**
 *
 * @author jesus
 */
public class EVA2_14_FIGURAS_POLIMORFISMO {

    public static void main(String[] args) {
        Figura[] figura=new Figura[10];
        figura[0]=new Rectangulo(6,5);
        figura[1]=new Rectangulo(7,6);
        figura[2]=new Rectangulo(8,7);
        figura[3]=new Rectangulo(9,8);
        figura[4]=new Rectangulo(10,9);
        figura[5]=new Circulo(3);
        figura[6]=new Circulo(4);
        figura[7]=new Circulo(5);
        figura[8]=new Circulo(6);
        figura[9]=new Circulo(7);
        imprimirAreasPerimetros(figura);
        
    }
   public static void imprimirAreasPerimetros(Figura[] figura){
       for (int i = 0; i < figura.length; i++) {
                  if(figura[i] instanceof Rectangulo){
           System.out.println("Rectangulo: "+i);
       }else{
           System.out.println("Circulo: "+i);
       }
           figura[i].mostrarDatos();
       }
       
       
} 
   
}
