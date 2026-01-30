/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author Usuario
 */
public class CajaRegistradora {
    private double totalVentas;
    private double totalFacturas;
    private static CajaRegistradora instancia;

    private CajaRegistradora() {
        totalVentas = 0.0;
        totalFacturas = 0.0;
        System.out.println("Caja registradora lista");
    }
    
    public static CajaRegistradora getInstancia() {
        if(instancia == null) {
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    
    public void registrarVenta(double monto) {
        totalVentas =+ monto;
        System.out.println("Venta registrada! " + monto);
    }
    
        public void registrarFactura(double montof) {
        totalFacturas =+ montof;
        System.out.println("Factura registrada! " + montof);
    }
    
    public double getTotalVentas() {
        return totalVentas;
    }
    
    public double getTotalFacturas() {
        return totalFacturas;
    }
    
    public double getTotal() {
        return totalFacturas + totalVentas;
    }
}
