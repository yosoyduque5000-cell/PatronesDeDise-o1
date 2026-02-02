/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploComposite;

/**
 *
 * @author Usuario
 */
public class Plato implements ComponenteMenu {

    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Plato: " + nombre + " - Precio: $" + precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}