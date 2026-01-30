/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploSingleton;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ModuloRetiro retiro = new ModuloRetiro();
        ModuloDeposito deposito = new ModuloDeposito();
        double monto;
        int op;
        do {
            System.out.println("Sistema de Cajero Automatico");
            System.out.println("1. Retirar");
            System.out.println("2. Deposito");
            System.out.println("3. Consultar saldo");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el monto a retirar: ");
                    monto = sc.nextDouble();
                    retiro.retirar(monto);
                    break;
                case 2:
                    System.out.print("Ingresar el monto a depositar: ");
                    monto = sc.nextDouble();
                    deposito.depositar(monto);
                    break;
                case 3:
                    Cajero cajero = Cajero.getInstancia();
                    cajero.getConsultarSaldo();
                    break;
                case 4:
                    break;
            }
        } while (op != 4);
    }
    
}
