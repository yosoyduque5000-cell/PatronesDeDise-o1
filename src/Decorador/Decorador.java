/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorador;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("CAFETERIA ESPE");
            System.out.println("1. Cafe simple");
            System.out.println("2. Agregar leche");
            System.out.println("3. Agregar azucar");
            System.out.println("4. Agregar espuma de canela");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            Bebida cafe = new CafeSimple();
            switch (opcion) {
                case 1: 
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto()); break;
                case 2:
                    cafe = new Azucar(cafe);
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto()); break;
                case 3:
                    cafe = new Leche(cafe);
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto()); break;
                case 4:
                    cafe = new Crema(cafe);
                    System.out.println(cafe.getDescripcion() + " = $" + cafe.getCosto()); break;
                case 5:
                    break;
                default: System.out.println("Opcion no disponible!");
            }
                    
        } while (opcion != 5);
    }
    
}
