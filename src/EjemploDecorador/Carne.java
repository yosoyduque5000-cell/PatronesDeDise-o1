/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploDecorador;

/**
 *
 * @author Usuario
 */
public class Carne extends PizzaDecorador{

    public Carne(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Carne";
    }

    @Override
    public int getPrecio() {
        return pizza.getPrecio() + 5;
    }
    
}
