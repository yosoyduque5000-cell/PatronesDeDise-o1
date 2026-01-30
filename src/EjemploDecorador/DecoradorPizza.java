/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploDecorador;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DecoradorPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===PIZZA-HUT===");
            System.out.println("1. PIZZA Base");
            System.out.println("2. Agregar Pepperoni");
            System.out.println("3. Agregar Champiniones");
            System.out.println("4. Agregar Carne");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            Pizza pizza = new PizzaBase();
            switch (opcion) {
                case 1: 
                    System.out.println(pizza.getDescripcion());
                    System.out.println("Precio: " + pizza.getPrecio());
                    break;
                case 2:
                    pizza = new Pepperoni(pizza);
                    System.out.println(pizza.getDescripcion());
                    System.out.println("Precio: " + pizza.getPrecio());
                    break;
                case 3:
                    pizza = new Champiniones(pizza);
                    System.out.println(pizza.getDescripcion());
                    System.out.println("Precio: " + pizza.getPrecio());
                    break;
                case 4:
                    pizza = new Carne(pizza);
                    System.out.println(pizza.getDescripcion());
                    System.out.println("Precio: " + pizza.getPrecio());
                    break;
                case 5:
                    break;
                default: System.out.println("Opcion no disponible!");
            }
                    
        } while (opcion != 5);
    }
    
}

