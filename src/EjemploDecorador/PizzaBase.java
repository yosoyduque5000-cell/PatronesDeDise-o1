/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploDecorador;

/**
 *
 * @author Usuario
 */
public class PizzaBase implements Pizza{

    @Override
    public String getDescripcion() {
        return "Pizza con Tomate + Queso Mozzarella";
    }

    @Override
    public int getPrecio() {
        return 10;
    }
    
}
