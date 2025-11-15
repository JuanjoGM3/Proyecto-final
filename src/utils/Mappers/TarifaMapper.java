package utils.Mappers;

import model.Tarifa;
import model.DTO.TarifaDTO;

public class TarifaMapper {

	public static TarifaDTO toDTO(Tarifa tarifa) {
		if (tarifa == null) return null;
		return new TarifaDTO(
				tarifa.getDistancia(),
				tarifa.getPeso(),
				tarifa.getVolumen(),
				tarifa.getPrioridad(),
				tarifa.getRecargosAdicionales()
				);
	}

	public static Tarifa toEntity(TarifaDTO dto) {
		if (dto == null) return null;
		return new Tarifa(
				dto.getDistancia(),
				dto.getPeso(),
				dto.getVolumen(),
				dto.getPrioridad(),
				dto.getRecargosAdicionales()
				);
	}
}





