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
        int opciones = -1;
        int opc = -1;

        partidoLiga partidoliga = new partidoLiga(1, "equipo Local", "Equipo Visitante", 0, 0, false, "2023-01-01");
        PartidoPlayOff partidoPlay = new PartidoPlayOff("octavos", "equipo Local", "Equipo Visitante", 0, 0, false, "2023-01-01");

        do {
            try {
                System.out.println("----------------------------------------------------------");
                System.out.println("BIENVENIDOS A SUS PARTIDOS FAVORITOS");
                System.out.println("-----------------------------------------------------------");
                System.out.println("¿Que partido deseas seleccionar?");
                System.out.println("-----------------------------------------------------------");

                System.out.println("1. Partido liga");
                System.out.println("2. Partido play Off");
                System.out.println("0. Salir");
                System.out.println("Ingresa la opcion de tu preferencia (0-2)");
                System.out.println("-----------------------------------------------------------");

                if (scanner.hasNextLine()) {
                    String i = scanner.nextLine().trim();

                    if (i.isEmpty()) {
                        System.out.println("Error");
                    }
                    if (i.matches("\\d+")) {
                        opciones = Integer.parseInt(i);
                    } else {
                        System.out.println("Error");
                        continue;
                    }
                    switch (opciones) {
                        case 1:
                            do {

                                try {
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Bienvenido al partido");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("1. obtener el resultado");
                                    System.out.println("2. registrar puntos para los locales");
                                    System.out.println("3. registrar puntos para los visitantes");
                                    System.out.println("4.obtener el ganador");
                                    System.out.println("0.Salir");
                                    System.out.println("------------------------------------------");

                                    if (scanner.hasNextLine()) {
                                        String input = scanner.nextLine().trim(); //Leer espacios en blanco

                                        if (input.isEmpty()) {
                                            System.err.println("Verifica nuevamene!");
                                        }

                                        if (input.matches("\\d+")) {
                                            opcion = Integer.parseInt(input);
                                        } else {
                                            System.err.println("Error");
                                            continue; // Se reinicia el ciclo 
                                        }

                                        switch (opcion) {
                                            case 1:
                                                System.out.println("el partido quedo " + partidoliga.getCestasLocal() + "-" + partidoliga.getCestasVisitante());
                                                break;

                                            case 2:
                                                System.out.println("Ingresa los puntos para los locales ");

                                                if (scanner.hasNextLine()) {
                                                    String inputs = scanner.nextLine().trim(); // Leer espacios en blanco

                                                    if (input.isEmpty()) {
                                                        System.err.println("Error");
                                                        continue; // Reiniciar el bucle
                                                    }

                                                    if (inputs.matches("\\d+")) {
                                                        int puntoLocales = Integer.parseInt(inputs);

                                                        if (puntoLocales > 0) {
                                                            partidoliga.setCestasLocal(partidoliga.getCestasLocal() + puntoLocales);
                                                        } else {
                                                            System.out.println("Error");
                                                        }
                                                    } else {
                                                        System.err.println("Error");
                                                        continue; // Reiniciar el bucle
                                                    }
                                                } else {
                                                    System.err.println("Error");
                                                    continue; // Reiniciar el bucle
                                                }

                                                break;

                                            case 3:
                                                System.out.println("Ingresa punto para los visitantes: ");
                                                if (scanner.hasNextLine()) {
                                                    String inp = scanner.nextLine().trim();

                                                    if (input.isEmpty()) {
                                                        System.err.println("Error ");
                                                        continue;
                                                    }
                                                    if (inp.matches("\\d+")) {
                                                        int puntoVisitante = Integer.parseInt(inp);

                                                        if (puntoVisitante > 0) {
                                                            partidoliga.setCestasVisitante(partidoliga.getCestasVisitante() + puntoVisitante);

                                                        } else {
                                                            System.err.println("Error");
                                                        }
                                                    } else {
                                                        System.err.println("Error ");
                                                        continue;
                                                    }
                                                } else {
                                                    System.err.println("Error ");

                                                    continue;
                                                }
                                                break;

                                            case 4:

                                                int cestasLocal = partidoliga.getCestasLocal();
                                                int cestasVisitante = partidoliga.getCestasVisitante();

                                                String ganador;
                                                if (cestasLocal > cestasVisitante) {
                                                    ganador = partidoliga.getEquipoLocal();
                                                    System.out.println("El ganador del partido es " + ganador);
                                                } else if (cestasLocal < cestasVisitante) {
                                                    ganador = partidoliga.getEquipoVisitante();
                                                    System.out.println(ganador);
                                                } else {
                                                    ganador = "Empate";
                                                    System.out.println("¡El partido terminó en empate!");
                                                }

                                                partidoliga.cestasLocal = 0;
                                                partidoliga.cestasVisitante = 0;
                                                System.err.println("Gracias por haber jugado!");

                                                break;

                                            case 0:
                                                System.out.println("Gracias por ingresar");
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                    } else {
                                        System.err.println("Error");
                                        scanner.next();
                                        opcion = -1;

                                    }

                                } catch (Exception e) {
                                    System.err.println("Error");
                                    opcion = -1;
                                    continue;
                                }

                            } while (opcion != 0);

                            break;

                        case 2:

                            do {
                                try {
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("BIENVENIDO AL PARTIDO");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("1. Ingresa la ronda");
                                    System.out.println("2. registrar puntos para los locales");
                                    System.out.println("3. registrar puntos para los visitantes");
                                    System.out.println("4. Obtener resultado");
                                    System.out.println("5. Obtener ganador");
                                    System.out.println("0. Salir");
                                    System.out.println("-----------------------------------------------------------");

                                    if (scanner.hasNextLine()) {
                                        String inp = scanner.nextLine().trim();

                                        if (inp.isEmpty()) {
                                            System.err.println("Error");
                                        }
                                        if (inp.matches("\\d")) {
                                            opc = Integer.parseInt(inp);

                                        } else {
                                            System.err.println("Error");
                                            continue;
                                        }

                                        switch (opc) {
                                            case 1:
                                                System.out.println("---------------------------------");
                                                System.out.println("Ingresa la ronda que deseas:");
                                                System.out.println("---------------------------------");
                                                System.out.println("1.Octavos de finales");
                                                System.out.println("2.Cuartos de finales");
                                                System.out.println("3.Final");
                                                System.out.println("---------------------------------");
                                                int IngresoRonda = scanner.nextInt();
                                                scanner.nextLine();
                                                if (IngresoRonda == 1) {
                                                    partidoPlay.ronda = "Octavos de finales";

                                                } else if (IngresoRonda == 2) {
                                                    partidoPlay.ronda = "Cuartos de final";
                                                } else if (IngresoRonda == 3) {
                                                    partidoPlay.ronda = "Final";

                                                } else {
                                                    System.out.println("Error");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Ingresa los puntos para los locales ");

                                                if (scanner.hasNextLine()) {
                                                    String inpt = scanner.nextLine().trim(); // Leer espacios en blanco

                                                    if (inpt.isEmpty()) {
                                                        System.err.println("Error");
                                                        continue; // Reiniciar el bucle
                                                    }

                                                    if (inpt.matches("\\d+")) {
                                                        int puntosLocales = Integer.parseInt(inpt);

                                                        if (puntosLocales > 0) {
                                                            partidoPlay.setCestasLocal(partidoPlay.getCestasLocal() + puntosLocales);
                                                        } else {
                                                            System.out.println("Error");
                                                        }
                                                    } else {
                                                        System.err.println("Error");
                                                        continue; // Reiniciar el bucle
                                                    }
                                                } else {
                                                    System.err.println("Error");
                                                    continue; // Reiniciar el bucle
                                                }

                                                break;

                                            case 3:

                                                System.out.println("Ingresa punto para los visitantes: ");
                                                if (scanner.hasNextLine()) {
                                                    String inpu = scanner.nextLine().trim();

                                                    if (inpu.isEmpty()) {
                                                        System.err.println("Error");
                                                        continue;
                                                    }
                                                    if (inpu.matches("\\d+")) {
                                                        int puntosVisitante = Integer.parseInt(inpu);

                                                        if (puntosVisitante > 0) {
                                                            partidoPlay.setCestasVisitante(partidoPlay.getCestasVisitante() + puntosVisitante);

                                                        } else {
                                                            System.err.println("Error");
                                                        }
                                                    } else {
                                                        System.err.println("Error");
                                                        continue;
                                                    }
                                                } else {
                                                    System.err.println("Error");

                                                    continue;
                                                }
                                                break;
                                            case 4:
                                                System.out.println("el partido quedo " + partidoPlay.getCestasLocal() + "-" + partidoPlay.getCestasVisitante() + " En la ronda " + partidoPlay.getRonda());

                                                break;
                                            case 5:
                                                int cestasLocal = partidoPlay.getCestasLocal();
                                                int cestasVisitante = partidoPlay.getCestasVisitante();

                                                String ganador;
                                                if (cestasLocal > cestasVisitante) {
                                                    ganador = partidoPlay.getEquipoLocal();
                                                    System.out.println("El ganador del partido es " + ganador);
                                                    partidoPlay.ronda = null;
                                                    partidoPlay.cestasLocal = 0;
                                                    partidoPlay.cestasVisitante = 0;
                                                    System.err.println("Gracias por haber jugado!");
                                                } else if (cestasLocal < cestasVisitante) {
                                                    ganador = partidoPlay.getEquipoVisitante();
                                                    System.out.println(ganador);
                                                    partidoPlay.ronda = null;
                                                    partidoPlay.cestasLocal = 0;
                                                    partidoPlay.cestasVisitante = 0;
                                                    System.err.println("Gracias por haber jugado!");
                                                } else {
                                                    ganador = "Empate";
                                                    System.out.println("¡El partido no ha acabado!");
                                                }

                                                break;

                                            case 0:
                                                System.err.println("Gracias por ingresar");
                                                break;
                                            default:
                                                System.err.println("Error");

                                        }

                                    } else {
                                        System.err.println("Error!");

                                    }
                                } catch (Exception e) {
                                    System.err.println("Error: " + e.getMessage());
                                    scanner.nextLine(); // Limpiar el búfer del scanner para evitar un bucle infinito
                                }
                            } while (opc != 0);

                            break;

                        case 0:
                            System.out.println("Gracias por ingresar");
                            break;
                        default:
                            System.out.println("Error");
                    }

                }

            } catch (Exception e) {
                System.err.println("Error");
                opciones = -1;
                continue;
            }

        } while (opciones != 0);

        scanner.close();

    }

}
