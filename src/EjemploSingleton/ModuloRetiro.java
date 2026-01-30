/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploSingleton;

/**
 *
 * @author Usuario
 */
public class ModuloRetiro {
    public void retirar(double monto){
        Cajero cajero = Cajero.getInstancia();
        cajero.retiro(monto);
    }
}
