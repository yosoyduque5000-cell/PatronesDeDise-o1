/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploAdapter;

/**
 *
 * @author Usuario
 */
public class PagoAdapter implements Pago{
    private int op;
    private PagoEuro pagoEuro;
    private PagoPesoColombiano pagoPesoColombiano;
    private PagoReales PagoReales;

    public PagoAdapter(int op) {
        this.op = op;
        this.pagoEuro = new PagoEuro();
        this.pagoPesoColombiano = new PagoPesoColombiano();
        this.PagoReales = new PagoReales();
    }

    @Override
    public void pagar(double monto) {
        switch (op) {
            case 1: 
                double euros = monto * 0.84;
                pagoEuro.pagarenEuros(euros); 
                break;
            case 2:
                double pesoColombiano = monto * 3664.50;
                pagoPesoColombiano.pagarenPesoColombiano(pesoColombiano); 
                break;
            case 3:
                double Reales = monto * 5.17;
                PagoReales.pagarenReales(Reales); 
                break;
            default : System.out.println("Opcion no valida");
        }
    }
    
}
