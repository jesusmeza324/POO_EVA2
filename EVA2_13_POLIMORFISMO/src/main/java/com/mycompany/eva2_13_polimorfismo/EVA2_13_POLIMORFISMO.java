/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_polimorfismo;

/**
 *
 * @author jesus
 */
public class EVA2_13_POLIMORFISMO {

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.respiraOxigeno();
        System.out.println("------------------");
        Mamifero mamifero= new Mamifero();
        mamifero.tienePelo();
        mamifero.tieneSangreCaliente();
        mamifero.respiraOxigeno();
        System.out.println("------------------");
        Reptil reptil=new Reptil();
        reptil.tieneSangreFria();
        reptil.respiraOxigeno();
        System.out.println("------------------");
        GatoDomestico garu=new GatoDomestico();
        garu.esMascota();
        garu.respiraOxigeno();
        garu.tienePelo();
        garu.tieneSangreCaliente();
        garu.tieneGarrasRetractiles();
        System.out.println("------------------");
        Serpiente serpiente=new Serpiente();
        serpiente.seArrastra();
        serpiente.respiraOxigeno();
        serpiente.tieneSangreFria();
        System.out.println("------------------");
        Animal puka=new GatoDomestico();
        //CASTING
        GatoDomestico nuevaPuka=(GatoDomestico)puka;
        nuevaPuka.esMascota();
        nuevaPuka.tieneGarrasRetractiles();
        System.out.println("----------------");
        Object obj = puka;
        //GatoDomestico garfield=new Animal();//no aplica polimorfismo hacia adelante
       // Mamifero unMamifero=new Serpiente();//no aplica entre clases no relacionadas entre si mismas
        
    }
}
class Animal{

    public Animal() {
        System.out.println("Animal");
    }
    
    public void respiraOxigeno(){
        System.out.println("Respirar oxigeno");
    }
}
class Mamifero extends Animal{

    public Mamifero() {
        super();
        System.out.println("Mamifero");
    }
    
    public void tienePelo(){
        System.out.println("Tiene pelo");
    }
    public void tieneSangreCaliente(){
        System.out.println("Tiene sangre caliente");
    }
}
class Reptil extends Animal{

    public Reptil() {
        super();
        System.out.println("Reptil");
    }
    
    public void tieneSangreFria(){
        System.out.println("Tiene sangre fria");
    }
    
}
class GatoDomestico extends Mamifero{

    public GatoDomestico() {
        super();
        System.out.println("Gato domestico");
    }
    
    public void esMascota(){
        System.out.println("Es domestico");
} 
    public void tieneGarrasRetractiles(){
        System.out.println("Tiene garras rectractiles");
    }
}
class Serpiente extends Reptil{

    public Serpiente() {
        super();
        System.out.println("Serpiente");
    }
    
    public void seArrastra(){
        System.out.println("Se arrastra");
    }
}