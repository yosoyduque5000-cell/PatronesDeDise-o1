/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploSingleton;

/**
 *
 * @author Usuario
 */
public class Cajero {
    
    private double saldo;
    //Definir una variable estatica
    private static Cajero instancia;
    
    //Crear un constructor privada
    private Cajero() {
        saldo = 1000;
        System.out.println("Cajero Iniciado");
    }
    
    //Agregar un metodo publico estatico
    public static Cajero getInstancia() {
        if (instancia == null) {
            instancia = new Cajero();
        }
        return instancia;
    }
    
    //Metodos a utilizar
    public void retiro(double monto) {
        if (saldo >= monto) {
        saldo -= monto;
        System.out.println("Retiro Registrado con exito");   
        }else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void deposito(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito Registrado con exito");
        }else
            System.out.println("No se permite numeros negativos");
    }
    
    public void getConsultarSaldo() {
        System.out.println("El saldo actual es de: " + saldo);
    }
}
