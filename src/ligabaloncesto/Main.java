/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligabaloncesto;

import java.util.Scanner;

/**
 *
 * @author ANGIE DURAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        
        partidoLiga partidoliga = new partidoLiga(1, "Equipo A", "Equipo B", 5, 0, false, "2023-01-01");

        do {
            System.out.println("Bienvenido al partido");
            System.out.println("1. obtener el resultado");
            System.out.println("2. registrar puntos para los locales");
            System.out.println("3. registrar puntos para los visitantes");
            System.out.println("4.obtener el ganador");
            System.out.println("0.Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                        System.out.println("el partido quedo " +partidoliga.getCestasLocal()+ "-" + partidoliga.getCestasVisitante());
                    break;

                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 0:
                    System.out.println("Gracias por ingresar");
                    break;
                default:
                    System.out.println("ERROR EN EL SISTEMA VERFICA NUEVAMENTE!");
            }

        } while (opcion != 0);

    }

}
