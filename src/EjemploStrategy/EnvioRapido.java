/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploStrategy;

/**
 *
 * @author Usuario
 */
public class EnvioRapido implements Envio {

    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }
}
