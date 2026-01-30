/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class Carpeta implements ComponenteArchivo{
    private String nombre;
    private List<ComponenteArchivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteArchivo archivo) {
        archivos.add(archivo);
    }
    
    @Override
    public void mostrar() {
        System.out.println("Carpeta: " + nombre); 
                for(ComponenteArchivo e : archivos) {
                    e.mostrar();
                }
    }

    @Override
    public int getTamano() {
        int total = 0;
        for(ComponenteArchivo e : archivos) {
            total = total + e.getTamano();
        }
        return total;
    }
    
}
