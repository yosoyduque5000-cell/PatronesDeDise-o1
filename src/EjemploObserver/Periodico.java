/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploObserver;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Periodico {

    private List<Observador> lectores = new ArrayList<>();

    public void suscribir(Observador o) {
        lectores.add(o);
    }

    public void publicar(String titulo) {
        System.out.println("Nueva noticia publicada: " + titulo);
        notificar(titulo);
    }

    public void notificar(String noticia) {
        for (Observador o : lectores) {
            o.actualizar(noticia);
        }
    }
}
