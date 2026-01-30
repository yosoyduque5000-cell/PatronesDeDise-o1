/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author Usuario
 */
public class Espada extends PersonajeDecorador{

    public Espada(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Espada";
    }

    @Override
    public int getDefenza() {
        return personaje.getDefenza();
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque() + 10;
    }
    
}
