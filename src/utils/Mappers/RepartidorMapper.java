package utils.Mappers;

import model.Repartidor;
import model.DTO.RepartidorDTO;

public class RepartidorMapper {

	public static RepartidorDTO toDTO(Repartidor repartidor) {
		if(repartidor == null) return null;
		return new RepartidorDTO(
				repartidor.getId(),
				repartidor.getNombre(),
				repartidor.getCorreo(),
				repartidor.getTelefono(),
				repartidor.getCobertura()
				);
	}

	public static Repartidor toEntity (RepartidorDTO dto) {
		if(dto == null) return null;
		return new Repartidor(
				dto.getId(),
				dto.getNombre(),
				dto.getCorreo(),
				dto.getTelefono()
				);
	}

	public static void updateEntityFromDTO(Repartidor Entity, RepartidorDTO dto) {
		if (Entity == null || dto == null) {
			Entity.setNombre(dto.getNombre());
			Entity.setCorreo(dto.getCorreo());
			Entity.setTelefono(dto.getTelefono());
		}
	}
}

