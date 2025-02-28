/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_interfaces;

/**
 *
 * @author jesus
 */
public class Television implements Datos{
    private boolean encendida;
    private int volumen;
    private int canal;

    public Television(boolean encendida, int volumen, int canal) {
        this.encendida = encendida;
        this.volumen = volumen;
        this.canal = canal;
    }
    
    
    public void botonPower(){
        if(encendida==true)
            encendida = false;
        else
            encendida = true;
    }
    
    public void bajarVolumen(){
          if(volumen>=5&&encendida==true){
           volumen -=5;
        }
       
}
       public void subirVolumen(){
        if(volumen<=95&&encendida==true){
            volumen +=5;
        }
}
         public void subirCanal(){
        if(encendida==true){
            if(canal==10)
                canal=0;
            else
                canal+=1;
        }
           
        
        }
         public void bajarCanal(){
        if(encendida==true){
            if(canal==0)
                canal=10;
            else
                canal-=1;
        }
        }
         public void setCanal(int valor){
             if(encendida==true)
             canal=valor;
         }

    @Override
    public void mostrarDatos() {
        if(encendida== true){
            System.out.println("prendida");
            System.out.println("volumen es:"+volumen);
            System.out.println("El canal es: "+ canal);
            

        }
        else{
            System.out.println("apagada");
        }
        
         }
         

    
}
