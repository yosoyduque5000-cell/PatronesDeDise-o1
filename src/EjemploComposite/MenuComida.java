/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploComposite;

/**
 *
 * @author Usuario
 */
public class MenuComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Platos
        Plato p1 = new Plato("Hamburguesa", 5.50);
        Plato p2 = new Plato("Pizza", 8.00);
        Plato p3 = new Plato("Papas Fritas", 3.00);
        Plato p4 = new Plato("Gaseosa", 1.50);
        Plato p5 = new Plato("Jugo Natural", 2.00);

        // Categorías
        CategoriaMenu menuPrincipal = new CategoriaMenu("Menu Principal");
        CategoriaMenu comidas = new CategoriaMenu("Comidas");
        CategoriaMenu bebidas = new CategoriaMenu("Bebidas");

        // Construcción del menú
        comidas.agregar(p1);
        comidas.agregar(p2);
        comidas.agregar(p3);

        bebidas.agregar(p4);
        bebidas.agregar(p5);

        menuPrincipal.agregar(comidas);
        menuPrincipal.agregar(bebidas);

        // Mostrar menú
        menuPrincipal.mostrar();

        System.out.println("\nPrecio total del menú: $" + menuPrincipal.getPrecio());
    }
    
}
