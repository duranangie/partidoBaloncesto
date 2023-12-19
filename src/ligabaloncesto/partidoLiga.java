/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author ANGIE DURAN
 */
public class partidoLiga extends Partido {
    protected int numjornada;

    public partidoLiga(int numjornada, String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitante, boolean partidoFinalizado, String fecha) {
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, partidoFinalizado, fecha);
        this.numjornada = numjornada;
    }

    public int getNumjornada() {
        return numjornada;
    }
    
}
