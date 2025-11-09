package model.Services;

public class TarifaService {
	 public double calcularCostoEnvio(Tarifa tarifa) {
	        if (tarifa == null) {
	            return 0.0;
	        }
	        double costoBase = calcularCostoBase(tarifa.getDistancia());
	        double costoPeso = calcularCostoPorPeso(tarifa.getPeso());
	        double costoVolumen = calcularCostoPorVolumen(tarifa.getVolumen());
	        double costoPrioridad = calcularRecargoPorPrioridad(tarifa.getPrioridad());
	        double recargos = tarifa.getRecargosAdicionales();

	       
	        return costoBase + costoPeso + costoVolumen + costoPrioridad + recargos;
	    }


}
