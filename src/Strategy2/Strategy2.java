/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Venta venta = new Venta();
        System.out.println("1. DESCUENTO ESTUDIANTIL");
        System.out.println("2. DESCUENTO NORMAL");
        System.out.println("3. DESCUENTO VIP");
        System.out.print("Ingrese una opcion: ");
        int op = sc.nextInt();
        System.out.print("Ingrese el monto: ");
        double monto = sc.nextDouble();
        switch (op) {
            case 1:
                venta.setDescuento(new DescuentoEstudiantil());
                System.out.println(monto - venta.calcularTotal(monto));
                break;
            case 2:
                venta.setDescuento(new DescuentoNormal());
                System.out.println(monto - venta.calcularTotal(monto));
                break;
            case 3:
                venta.setDescuento(new DescuentoVIP());
                System.out.println(monto - venta.calcularTotal(monto));
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
