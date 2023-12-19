/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ligabaloncesto;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

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
                    System.out.println("Ingresa los puntos para los locales ");
                    int puntosLocales = scanner.nextInt();
                    partidoliga.setCestasLocal(partidoliga.getCestasLocal() + puntosLocales);
                    break;
                case 3:
                    System.out.println("Ingresa punto para los visitantes: ");
                    int puntoVisitante = scanner.nextInt();
                    partidoliga.setCestasVisitante(partidoliga.getCestasVisitante() + puntoVisitante);
                    break;

                case 4:
                    System.out.println("El ganador del partido es: ");

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
