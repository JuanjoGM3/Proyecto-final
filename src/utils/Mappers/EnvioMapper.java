package utils.Mappers;

import model.Envio;
import model.DTO.EnvioDTO;
import sercice.DireccionService;

public class EnvioMapper {
	
	public static EnvioDTO toDTO(Envio envio) {
        if (envio == null) return null;
        return new EnvioDTO(envio.getId(),
        		envio.getOrigen().getId(),
        		envio.getDestino().getId(),
        		envio.getPeso(),
        		envio.getDimenciones(),
        		envio.getCosto(),
        		envio.getEstado());
	}    
    
    public static Envio toEntity(EnvioDTO dto) {
    	
    	DireccionService direccionService = new DireccionService();
    	
        if (dto == null) return null;
        return new Envio(
        		dto.getId(),
        		direccionService.buscarDireccionEntity(dto.getIdOrigen()),
        		direccionService.buscarDireccionEntity(dto.getIdDestino()),
        		dto.getPeso(),
        		dto.getDimenciones(),
        		dto.getCosto(),
        		dto.getEstado());
    }
    
    public static void updateEntityFromDTO(Envio entity, EnvioDTO dto) {
    	
    	DireccionService direccionService = new DireccionService();
    	
        if (entity == null || dto == null)
		        entity.setId(dto.getId());
		        entity.setOrigen(direccionService.buscarDireccionEntity(dto.getIdOrigen()));
		        entity.setDestino(direccionService.buscarDireccionEntity(dto.getIdDestino()));
		        entity.setPeso(dto.getPeso());
		        entity.setDimenciones(dto.getDimenciones());
		        entity.setCosto(dto.getCosto());
		        entity.setEstado(dto.getEstado());
    }
}
