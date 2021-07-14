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
public class TransporteMaritimo extends Transporte {
    private String cooperativaMar;

    public void establecerCooperativaMar(String n) {
        cooperativaMar = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 9.00 + 0.90;
    }

    public String obtenerCooperativaBus() {
        return cooperativaMar;
    }

    
}
