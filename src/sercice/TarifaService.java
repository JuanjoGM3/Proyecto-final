package sercice;

import model.DTO.TarifaDTO;
import utills.convertirCadenaACoordenadas;

public class TarifaService {
	
	private static final double RADIO_TIERRA_KM = 6371.0;
	private envioService envioService;

    public TarifaService() {
		this.envioService = new envioService();
	}

    public double calcularDistancia(String idEnvio) {
    	
    	String origen = envioService.buscarEnvioEntity(idEnvio).getOrigen().getCooedenadas();
    	String destino = envioService.buscarEnvioEntity(idEnvio).getDestino().getCooedenadas();
    	
    	double[] cordenada1 = convertirCadenaACoordenadas.convertirCadenaACoordenadas(origen);
    	double[] cordenada2 = convertirCadenaACoordenadas.convertirCadenaACoordenadas(destino);

        double lat1Rad = Math.toRadians(cordenada1[0]);
        double lon1Rad = Math.toRadians(cordenada1[1]);
        double lat2Rad = Math.toRadians(cordenada2[0]);
        double lon2Rad = Math.toRadians(cordenada2[1]);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        double a = Math.pow(Math.sin(dLat / 2), 2) + 
                   Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(dLon / 2), 2);
        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distanciaKm = RADIO_TIERRA_KM * c;
        return distanciaKm;
    }

    public double desglosarComponentes(TarifaDTO tarifa, String idEnvio) {

    	double distancia = calcularDistancia(idEnvio);
    	
        double Distancia =(distancia * tarifa.getDistancia());
        double costoPeso = tarifa.getPeso() * envioService.buscarEnvioEntity(idEnvio).getPeso();
        double costoVolumen = tarifa.getVolumen() * envioService.buscarEnvioEntity(idEnvio).getDimenciones();
        double recargoPrioridad = tarifa.getPrioridad();
        double recargosAdicionales = tarifa.getRecargosAdicionales();

       return Distancia +
              costoPeso + 
              costoVolumen +
              recargoPrioridad +
              recargosAdicionales;
    }
}
