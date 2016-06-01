/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea1consumer;

/**
 *
 * @author Lichita
 */
public class Aerolinea1WSConsumer {

    public static Boolean registrarBoleto(java.lang.String persona, java.lang.String paquete, java.lang.String numPersonas, java.lang.Integer idVuelo) {
        aerolinea1consumer.AerolineaTamews service = new aerolinea1consumer.AerolineaTamews();
        aerolinea1consumer.Aerolineaws port = service.getAerolineawsPort();
        return port.registrarBoleto(persona, paquete, numPersonas, idVuelo);
    }

    public static java.util.List<aerolinea1consumer.Vuelo> retrieveVuelosByPara(java.lang.String inicio, java.lang.String fin, java.lang.String origen, java.lang.String destino, java.lang.String numPer) {
        aerolinea1consumer.AerolineaTamews service = new aerolinea1consumer.AerolineaTamews();
        aerolinea1consumer.Aerolineaws port = service.getAerolineawsPort();
        return port.retrieveVuelosByPara(inicio, fin, origen, destino, numPer);
    }
    
}
