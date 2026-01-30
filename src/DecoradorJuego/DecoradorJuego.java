/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecoradorJuego;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecoradorJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("CAFETERIA ESPE");
            System.out.println("1. Personaje Base");
            System.out.println("2. Agregar espada");
            System.out.println("3. Agregar escudo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            Personaje personaje = new PersonajeBase();
            switch (opcion) {
                case 1: 
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Aataque " + personaje.getAtaque());
                    System.out.println("Defenza " + personaje.getDefenza());
                    break;
                case 2:
                    personaje = new Espada(personaje);
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Aataque " + personaje.getAtaque());
                    System.out.println("Defenza " + personaje.getDefenza());
                    break;
                case 3:
                    personaje = new Escudo(personaje);
                    System.out.println(personaje.getDescripcion());
                    System.out.println("Aataque " + personaje.getAtaque());
                    System.out.println("Defenza " + personaje.getDefenza());
                    break;
                case 4:
                    break;
                default: System.out.println("Opcion no disponible!");
            }
                    
        } while (opcion != 4);
    }
    
}
