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
        partidoLiga partidoliga = new partidoLiga(1, "equipo Local", "Equipo Visitante", 0, 0, false, "2023-01-01");
        PartidoPlayOff partidoPlay = new PartidoPlayOff("octavos", "equipo Local", "Equipo Visitante", 0, 0, false, "2023-01-01");
       
        do{
            try{
                System.out.println("------------------------------------------");
                System.out.println("BIENVENIDOS A SUS PARTIDOS FAVORITOS");
                System.out.println("------------------------------------------");
                System.out.println("¿Que partido deseas seleccionar?");
                System.out.println("1. Partido play Off");
                System.out.println("2. Partido liga");
                System.out.println("0. Salir");
                System.out.println("Ingresa la opcion de tu preferencia (0-2)");
                
                if(opciones == 1){
                    
                }
                else if(opciones ==2){
                
                
            }catch(Exception e){
                System.err.println("Error");
                opciones = -1;
                continue;
            }
            
            
        }while(opciones !=0);
        
        
        
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
                        System.err.println("Error ingresa solo numeros enteros");
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
                                    System.err.println("Error: Debes ingresar un valor.");
                                    continue; // Reiniciar el bucle
                                }

                                if (inputs.matches("\\d+")) {
                                    int puntoLocales = Integer.parseInt(inputs);

                                    if (puntoLocales > 0) {
                                        partidoliga.setCestasLocal(partidoliga.getCestasLocal() + puntoLocales);
                                    } else {
                                        System.out.println("Error en el sistema, verifica nuevamente");
                                    }
                                } else {
                                    System.err.println("Error: Recuerda que solo puedes ingresar números.");
                                    continue; // Reiniciar el bucle
                                }
                            } else {
                                System.err.println("Error: Recuerda que solo puedes ingresar números.");
                                continue; // Reiniciar el bucle
                            }

                            break;

                        case 3:
                            System.out.println("Ingresa punto para los visitantes: ");
                            if (scanner.hasNextLine()) {
                                String inp = scanner.nextLine().trim();

                                if (input.isEmpty()) {
                                    System.err.println("Error debes ingresar un valor");
                                    continue;
                                }
                                if (inp.matches("\\d+")) {
                                    int puntoVisitante = Integer.parseInt(inp);

                                    if (puntoVisitante > 0) {
                                        partidoliga.setCestasVisitante(partidoliga.getCestasVisitante() + puntoVisitante);

                                    } else {
                                        System.err.println("ERROR EN LOS NUMEROS INGRESADOS");
                                    }
                                } else {
                                    System.err.println("Recuerda que solo podes ingresar numeros al sistema!");
                                    continue;
                                }
                            } else {
                                System.err.println("Error en los datos verificaNuevamente");

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

            } catch (Exception e) {
                System.err.println("ERROR: Ocurrió un error inesperado, ingresa un enter para volver al menu: " );
                opcion = -1;
                continue;
            }
       

        
    
        }while (opcion!= 0);

        scanner.close ();

}

}

