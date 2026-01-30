/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploFactory;

/**
 *
 * @author Usuario
 */
public class PagosFactory {
       public static Pagos realizarPago(int tipo) {
        switch (tipo) {
            case 1: 
                return new PagoEfectivo();
            case 2:
                return new PagoTransferencia();
            case 3:
                return new PagoTarjeta();
            default:
                System.out.println("Pago no disponible");
                   return null;
            }
        }
       
}
