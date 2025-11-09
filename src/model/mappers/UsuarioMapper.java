package model.mappers;

import model.Usuario;
import model.DTO.UsuarioDTO;

public class UsuarioMapper {

	 public static UsuarioDTO toDTO(Usuario usuario) {
		 if (usuario==null) {
			 return null;
			 
		 }
		 return new UsuarioDTO(
				 usuario.getId(),
				 usuario.getNombre(),
				 usuario.getCorreo(),
				 usuario.getTelefono()
				 );
	}
	 public static Usuario toEntity(UsuarioDTO dto) {
		 if(dto==null) {
			 return null;
		 
		 }
		 return new Usuario(
				 dto.getId(),
				 dto.getNombre(),
				 dto.getCorreo(),
				 dto.getTelefono()
				 );
				 
		 
	 }
	 public static void updateEntityFromDTO(Usuario entity, UsuarioDTO dto) {
			if (entity == null || dto == null)
				return;
			entity.setNombre(dto.getNombre());
			entity.setCorreo(dto.getCorreo());
			entity.setTelefono(dto.getTelefono());
		}
	}
	 


