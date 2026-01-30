/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton1;

/**
 *
 * @author Usuario
 */
public class Singleton1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Impresora usuario1 = Impresora.getInstancia();
        Impresora usuario2 = Impresora.getInstancia();
        Impresora usuario3 = Impresora.getInstancia();
        
        usuario1.imprimir("Deber de POO");
        usuario1.imprimir("Deber de Fisica");
        usuario2.imprimir("Deber Ejercicios de fisica");
        usuario3.imprimir("Reporte de los Ceros");
        
        System.out.println("Toltal de Impreciones: " + usuario1.getTotalImpresiones());
        System.out.println("Toltal de Impreciones: " + usuario2.getTotalImpresiones());
    }
    
}
