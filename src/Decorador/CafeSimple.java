/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorador;

/**
 *
 * @author Usuario
 */
public class CafeSimple implements Bebida{

    @Override
    public String getDescripcion() {
        return "Cafe simple";
    }

    @Override
    public double getCosto() {
        return 1;
    }
    
}
