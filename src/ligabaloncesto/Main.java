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
        int opcion = -1;
        partidoLiga partidoliga = new partidoLiga(1, "Equipo A", "Equipo B", 0, 0, false, "2023-01-01");

        do {
            System.out.println("Bienvenido al partido");
            System.out.println("1. obtener el resultado");
            System.out.println("2. registrar puntos para los locales");
            System.out.println("3. registrar puntos para los visitantes");
            System.out.println("4.obtener el ganador");
            System.out.println("0.Salir");

                if (scanner.hasNextLine()) {
                String input = scanner.nextLine().trim(); //Leer espacios en blanco
               
                if (input.isEmpty()) {
                    System.err.println("Verifica nuevamene!");
                }

                if (input.matches("\\d+")) {
                    opcion = Integer.parseInt(input);
                } else {
                    System.err.println("Error ingresa solo numeros enteros");
                    continue; // Se reinicia el ciclo 
                }

                switch (opcion) {
                    case 1:
                        System.out.println("el partido quedo " + partidoliga.getCestasLocal() + "-" + partidoliga.getCestasVisitante());
                        break;

                    case 2:

                        System.out.println("Ingresa los puntos para los locales ");
                        scanner.nextLine();
                        if (scanner.hasNextInt()) {
                            int puntoLocales = scanner.nextInt();

                            if (puntoLocales > 0) {
                                partidoliga.setCestasLocal(partidoliga.getCestasLocal() + puntoLocales);
                            } else {
                                System.out.println("Error en el sistema verifica nuevamente");
                            }

                        } else {
                            System.err.println("Error recuerda que solo puedes ingresar numeros");
                            scanner.next(); //esto es pra los bucles infinitos para que vuelva otra vez
                        }

                        break;
                    case 3:
                        System.out.println("Ingresa punto para los visitantes: ");
                        if (scanner.hasNextInt()) {
                            int puntoVisitante = scanner.nextInt();
                            if (puntoVisitante > 0) {
                                partidoliga.setCestasVisitante(partidoliga.getCestasVisitante() + puntoVisitante);

                            } else {
                                System.err.println("ERROR EN LOS NUMEROS INGRESADOS");
                            }
                        } else {
                            System.err.println("Recuerda que solo podes ingresar numeros al sistema!");
                            scanner.next();
                        }
                        break;

                    case 4:
                        System.out.println("El ganador del partido es: ");
                        String ganador = (partidoliga.getCestasLocal() > partidoliga.getCestasVisitante()) ? partidoliga.getEquipoLocal() : partidoliga.getEquipoVisitante();
                        System.out.println("El ganador de partido es " + ganador);
                        break;

                    case 0:
                        System.out.println("Gracias por ingresar");
                        break;
                    default:
                        System.out.println("ERROR EN EL SISTEMA VERFICA NUEVAMENTE!");
                }
            } else {
                System.err.println("ERROR recuerda que solo puedes ingresar numeros !");
                scanner.next();
                opcion = -1;
            }

        } while (opcion != 0);

        scanner.close();

    }

}

