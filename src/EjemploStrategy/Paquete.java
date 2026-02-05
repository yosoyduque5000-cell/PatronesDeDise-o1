/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploStrategy;

/**
 *
 * @author Usuario
 */
public class Paquete {

    private Envio envio;

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public double calcularCosto(double peso) {
        return envio.calcular(peso);
    }
}
