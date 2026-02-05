/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploObserver;

/**
 *
 * @author Usuario
 */
public class Lector implements Observador {

    private String nombre;

    public Lector(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println(nombre + " ha recibido la noticia: " + noticia);
    }
}
