/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composite;

/**
 *
 * @author Usuario
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo a1 = new Archivo("Titi me pregunto.mp3", 4000);
        Archivo a2 = new Archivo("Amor prohibido.mp3", 5000);
        Archivo a3 = new Archivo("Mi Foto.jpg", 1000);
        
        //Carpeta principal
        Carpeta raiz = new Carpeta("Mi PlayList");
        
        // Sub carpeta
        Carpeta imagenes = new Carpeta("Imagenes");
        
        //Construccion del Arbol de Archivos
        raiz.agregar(a1);
        raiz.agregar(imagenes);
        raiz.agregar(a2);
        imagenes.agregar(a3);
        
        raiz.mostrar();
        System.out.println("\nTamanio Total: " + raiz.getTamano() + " Kb");
    }
    
}
