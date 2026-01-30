/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author Usuario
 */
public class Escudo extends PersonajeDecorador{

    public Escudo(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Escudo";
    }

    @Override
    public int getDefenza() {
        return personaje.getDefenza() + 10;
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque();
    }
    
}
