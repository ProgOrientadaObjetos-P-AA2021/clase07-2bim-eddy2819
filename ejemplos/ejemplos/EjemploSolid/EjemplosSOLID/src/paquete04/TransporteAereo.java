/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author DELL
 */
public class TransporteAereo extends Transporte {
    private String cooperativaAirlen;

    public void establecerCooperativaAirlen(String n) {
        cooperativaAirlen = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 8.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return cooperativaAirlen;
    }

    
}
