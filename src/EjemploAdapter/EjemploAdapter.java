/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploAdapter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. pago en Euros");
        System.out.println("2. pago en Pesos Colombianos");
        System.out.println("3. pago en Reales");
        System.out.print("Ingrese una opcion: ");
        int op = sc.nextInt();
        
        System.out.print("Cuanto desea transferir: ");
        double dinero = sc.nextDouble();
        
        Pago pago = new PagoAdapter(op);
        pago.pagar(dinero);
    }
    
}
