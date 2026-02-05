/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Straetgy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        int op;
        double monto;
        do{
        System.out.println("1. Pago con tarjeta");
        System.out.println("2. Pago con PayPal");
        System.out.println("3. Pago con Transferencia");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();
                    compra.setMetodoPago(new PagoTarjeta());
                    compra.realizarPago(monto);
                    break;
                case 2:
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();
                    compra.setMetodoPago(new PagoPayPal());
                    compra.realizarPago(monto);
                    break;
                case 3:
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();
                    compra.setMetodoPago(new PagoTrasferencia());
                    compra.realizarPago(monto);
                    break;
                case 4:
                    break;     
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 4);
    }
    
}
