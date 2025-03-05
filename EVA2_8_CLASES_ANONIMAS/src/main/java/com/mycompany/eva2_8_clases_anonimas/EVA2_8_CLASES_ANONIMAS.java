/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_clases_anonimas;

/**
 *
 * @author jesus
 */
public class EVA2_8_CLASES_ANONIMAS {

    public static void main(String[] args) {
        //clases anonimas
        Persona perso=new Persona() {
            @Override
            public void imprimirDatos() {
                System.out.println("Nombre: "+getNombre());
                System.out.println("Apellidos: "+getApellido());
            }
        };
        perso.setNombre("jesus");
        perso.setApellido("meza");
        perso.imprimirDatos();
        MostrarMensaje mostrar=new MostrarMensaje() {
            @Override
            public void mostrarMensaje(String mensaje) {
                System.out.println("tu mensaje: "+mensaje);            }
        };
        mostrar.mostrarMensaje("hola mundo");
    }
}
