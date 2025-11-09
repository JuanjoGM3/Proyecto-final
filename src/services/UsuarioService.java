package services;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;
import model.DTO.UsuarioDTO;
import utils.UsuarioMapper;

public class UsuarioService {
	  private List<Usuario> listaUsuarios;

	    
	    public UsuarioService() {
	        this.listaUsuarios = new ArrayList<>();
	    }

	  
	    public List<UsuarioDTO> obtenerTodosLosUsuarios() {
	        List<UsuarioDTO> usuariosDTO = new ArrayList<>();
	        for (Usuario usuario : listaUsuarios) {
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
	        listaUsuarios.add(usuario);
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
	        for (int i = 0; i < listaUsuarios.size(); i++) {
	            Usuario u = listaUsuarios.get(i);
	            if (u.getId().equals(id)) {
	                listaUsuarios.remove(i);
	                return true;
	            }
	        }
	        return false; 
	    }

	    public boolean existeUsuario(String id) {
	        return buscarUsuarioEntity(id) != null;
	    }

	    
	    private Usuario buscarUsuarioEntity(String id) {
	        for (Usuario usuario : listaUsuarios) {
	            if (usuario.getId().equals(id)) {
	                return usuario;
	            }
	        }
	        return null;
	    }
	}




