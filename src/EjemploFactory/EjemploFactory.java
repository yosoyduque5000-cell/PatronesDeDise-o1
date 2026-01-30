/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploFactory;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double monto = 0;
        do {
            System.out.println("===PAGOS===");
            System.out.println("1. Pago en efectivo");
            System.out.println("2. Pago transferencia");
            System.out.println("3. Pago Tarjeta");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el monto: ");
            monto = sc.nextDouble();
            sc.nextLine();
            
            Pagos pagos = PagosFactory.realizarPago(opcion);
            
            if(pagos != null) {
                pagos.procesarPago(monto);
            }else {
                System.out.println("No se a podido crear un juguete");
            }
        } while (opcion != 4);
    }
    
}
