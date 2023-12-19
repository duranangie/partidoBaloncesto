/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author ANGIE DURAN
 */
public class PartidoPlayOff  extends Partido{
    protected String ronda;

    public PartidoPlayOff(String ronda, String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitante, boolean partidoFinalizado, String fecha) {
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, partidoFinalizado, fecha);
        this.ronda = ronda;
    }

    public String getRonda() {
        return ronda;
    }
    
    
}
