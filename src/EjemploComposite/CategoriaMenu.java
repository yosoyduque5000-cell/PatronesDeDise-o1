/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploComposite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class CategoriaMenu implements ComponenteMenu {

    private String nombre;
    private List<ComponenteMenu> elementos = new ArrayList<>();

    public CategoriaMenu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("\nCategoria: " + nombre);
        for (ComponenteMenu e : elementos) {
            e.mostrar();
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ComponenteMenu e : elementos) {
            total += e.getPrecio();
        }
        return total;
    }
}