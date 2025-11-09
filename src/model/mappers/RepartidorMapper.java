package model.mappers;

import model.Repartidor;
import model.DTO.RepartidorDTO;

public class RepartidorMapper {
	
	public static RepartidorDTO toDTO(Repartidor repartidor) {
		if(repartidor==null) {
			return null;
		}
		return new RepartidorDTO(
				repartidor.getId(),
				repartidor.getNombre(),
				repartidor.getCorreo(),
				repartidor.getTelefono(),
				repartidor.getCobertura()
				);
	}
		 
		public static Repartidor toEntity (RepartidorDTO dto) {
			if(dto==null) {
				return null;
			}
			Repartidor repartidor = new Repartidor (
					dto.getId(),
					dto.getNombre(),
					dto.getCorreo(),
					dto.getTelefono()
					
					);
		
					
			public static void updateEntityFromDTO(Repartidor Entity, RepartidorDTO dto) {
				if (entity == null || dto == null)
					return;
				entity.setNombre(dto.getNombre());
				entity.setCorreo(dto.getCorreo());
				entity.setTelefono(dto.getTelefono());
			}
		
	}


}
