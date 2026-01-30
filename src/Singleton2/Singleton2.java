/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Singleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ModuloVentas ventas = new ModuloVentas();
        ModuloFacturacion facturacion = new ModuloFacturacion();
        
        int op;
        double monto, montof;
        do {
            System.out.println("Sistema de caja Registradora");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Registrar Factura");
            System.out.println("3. Ver total ventas");
            System.out.println("4. Ver total facturas");
            System.out.println("5. Ver Total de la caja registradora");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op) {
                case 1: 
                    System.out.print("Ingrese el monto de la venta: ");
                    monto = sc.nextDouble();
                    ventas.vender(monto);
                    facturacion.facturar(monto);
                    break;
                case 2:
                    System.out.print("Ingrese el monto de la venta: ");
                    montof = sc.nextDouble();
                    facturacion.facturar(montof);
                    break;
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado en cajas: " + caja.getTotalVentas());
                    break;
                case 4:
                    CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado en cajas: " + cajaf.getTotalFacturas());
                    break;
                case 5: 
                    CajaRegistradora cajat = CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado en cajas: " + cajat.getTotal());
                    break;
                case 6: break;
                default: System.out.println("Opcion no valida");
            }
        } while (op != 6);
        sc.close();
    }
    
}
