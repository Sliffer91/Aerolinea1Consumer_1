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
        ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews service = new ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews();
        ec.edu.espe.ecutravel.aerolinea.ws.Aerolineaws port = service.getAerolineawsPort();
        return port.registrarBoleto(persona, paquete, numPersonas, idVuelo);
    }

    public static java.util.List<ec.edu.espe.ecutravel.aerolinea.ws.Vuelo> retrieveVuelosByPara(java.lang.String inicio, java.lang.String fin, java.lang.String origen, java.lang.String destino, java.lang.String numPer) {
        ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews service = new ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews();
        ec.edu.espe.ecutravel.aerolinea.ws.Aerolineaws port = service.getAerolineawsPort();
        return port.retrieveVuelosByPara(inicio, fin, origen, destino, numPer);
    }

    public static java.util.List<ec.edu.espe.ecutravel.aerolinea.ws.Boleto> traerBoletosPorPersona(java.lang.String persona) {
        ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews service = new ec.edu.espe.ecutravel.aerolinea.ws.AerolineaTamews();
        ec.edu.espe.ecutravel.aerolinea.ws.Aerolineaws port = service.getAerolineawsPort();
        return port.traerBoletosPorPersona(persona);
    }
}
