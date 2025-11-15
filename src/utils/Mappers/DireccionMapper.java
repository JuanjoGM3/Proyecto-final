package utils.Mappers;

import model.Direccion;
import model.DTO.DireccionDTO;

public class DireccionMapper {
	
	public static DireccionDTO toDTO(Direccion direccion) {
        if (direccion == null) return null;
        return new DireccionDTO(
        		direccion.getId(),
        		direccion.getAlias(),
        		direccion.getCalle(),
        		direccion.getCiudad(),
        		direccion.getCordenadas());
    }
    
    public static Direccion toEntity(DireccionDTO dto) {
        if (dto == null) return null;
        return new Direccion(
        		dto.getId(),
        		dto.getAlias(),
        		dto.getCalle(),
        		dto.getCiudad(),
        		dto.getCordenadas());
    }
    
    public static void updateEntityFromDTO(Direccion entity, DireccionDTO dto) {
        if (entity == null || dto == null)
		        entity.setId(dto.getId());
		        entity.setAlias(dto.getAlias());
		        entity.setCalle(dto.getCalle());
		        entity.setCiudad(dto.getCiudad());
		        entity.setCordenadas(dto.getCordenadas());
    }
}
