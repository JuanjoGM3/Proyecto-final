package sercice;

import java.util.ArrayList;
import java.util.List;

import model.EmpresaEnvios;
import model.Usuario;
import model.DTO.UsuarioDTO;
import utils.Mappers.UsuarioMapper;

public class UsuarioService {
	
	EmpresaEnvios empresa;

	public UsuarioService() {
		this.empresa= EmpresaEnvios.getInstancia();
	}

	public List<UsuarioDTO> obtenerTodosLosUsuarios() {
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		for (Usuario usuario : empresa.getUsuarios()) {
			usuariosDTO.add(UsuarioMapper.toDTO(usuario));
		}
		return usuariosDTO;
	}


	public UsuarioDTO buscarUsuarioPorId(String id) {
		Usuario usuario = buscarUsuarioEntity(id);
		if (usuario != null) {
			return UsuarioMapper.toDTO(usuario);
		}
		return null;
	}


	public boolean agregarUsuario(UsuarioDTO usuarioDTO) {
		if (buscarUsuarioEntity(usuarioDTO.getId()) != null) {
			return false; 

		}
		Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);
		empresa.addUsuarios(usuario);
		return true;
	}


	public boolean actualizarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = buscarUsuarioEntity(usuarioDTO.getId());
		if (usuario == null) {
			return false; 
		}


		UsuarioMapper.updateEntityFromDTO(usuario, usuarioDTO);
		return true;
	}


	public boolean eliminarUsuario(String id) {
		for (int i = 0; i < empresa.getUsuarios().size(); i++) {
			Usuario u = empresa.getUsuarios().get(i);
			if (u.getId().equals(id)) {
				empresa.getUsuarios().remove(i);
				return true;
			}
		}
		return false; 
	}

	public boolean existeUsuario(String id) {
		return buscarUsuarioEntity(id) != null;
	}


	private Usuario buscarUsuarioEntity(String id) {
		for (Usuario usuario : empresa.getUsuarios()) {
			if (usuario.getId().equals(id)) {
				return usuario;
			}
		}
		return null;
	}
}




