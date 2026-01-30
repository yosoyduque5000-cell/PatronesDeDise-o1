/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploSingleton;

/**
 *
 * @author Usuario
 */
public class ModuloDeposito {
    public void depositar(double monto) {
        Cajero cajero = Cajero.getInstancia();
        cajero.deposito(monto);
    }
}