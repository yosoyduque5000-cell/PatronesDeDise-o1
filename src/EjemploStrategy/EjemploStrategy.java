/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploStrategy;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Paquete paquete = new Paquete();

        System.out.println("TIPO DE ENVIO");
        System.out.println("1. ECONOMICO");
        System.out.println("2. RAPIDO");
        System.out.println("3. EXPRESS");
        System.out.print("Elija una opcion: ");
        int op = sc.nextInt();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();

        switch (op) {
            case 1:
                paquete.setEnvio(new EnvioEconomico());
                break;
            case 2:
                paquete.setEnvio(new EnvioRapido());
                break;
            case 3:
                paquete.setEnvio(new EnvioExpress());
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        double total = paquete.calcularCosto(peso);
        System.out.println("Costo de envio: $" + total);
    }
    
}
