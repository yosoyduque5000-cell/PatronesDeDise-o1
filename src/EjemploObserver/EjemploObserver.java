/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploObserver;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Periodico periodico = new Periodico();

        int op;
        String noticia = "";

        do {
            System.out.println("\n=== PERIODICO DIGITAL ===");
            System.out.println("1. Suscribirse");
            System.out.println("2. Publicar noticia");
            System.out.println("3. Enviar notificaciones");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese nombre del lector: ");
                    String nombre = sc.nextLine();
                    periodico.suscribir(new Lector(nombre));
                    break;

                case 2:
                    System.out.print("Ingrese titulo de la noticia: ");
                    noticia = sc.nextLine();
                    periodico.publicar(noticia);
                    break;

                case 3:
                    periodico.notificar(noticia);
                    break;

                case 4:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (op != 4);

        sc.close();
    }
    
}
