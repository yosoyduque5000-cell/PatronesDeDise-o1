/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploDecorador;

/**
 *
 * @author Usuario
 */
public class Champiniones extends PizzaDecorador{

    public Champiniones(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Champiniones";
    }

    @Override
    public int getPrecio() {
        return pizza.getPrecio() + 3;
    }
    
}
