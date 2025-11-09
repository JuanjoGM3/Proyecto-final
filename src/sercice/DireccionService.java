package sercice;

import java.util.ArrayList;
import java.util.List;

import model.Direccion;
import model.EmpresaEnvios;
import model.DTO.DireccionDTO;
import utils.Mappers.DireccionMapper;

public class DireccionService {
	
	EmpresaEnvios empresaEnvios;
	
	public DireccionService() {
		this.empresaEnvios = EmpresaEnvios.getInstancia();
	}

    public List<DireccionDTO> obtenerTodosLasDirecciones() {
        List<DireccionDTO> direccionesDTO = new ArrayList<>();
        for (Direccion direccion : empresaEnvios.getDirecciones()) {
        	direccionesDTO.add(DireccionMapper.toDTO(direccion));
        }
        return direccionesDTO;
    }

    public DireccionDTO buscarClientePorCedula(String id) {
    	Direccion direccion = buscarDireccionEntity(id);
        return direccion != null ? DireccionMapper.toDTO(direccion) : null;
    }

    public boolean agregarDireccion(DireccionDTO dto) {
        if (buscarDireccionEntity(dto.getId()) != null) {
            return false;
        }
        Direccion direccion = DireccionMapper.toEntity(dto);
        empresaEnvios.addDirecciones(direccion);
        return true;
    }
    
    public boolean actualizarCliente(DireccionDTO direccionDTO) {
    	Direccion direccion = buscarDireccionEntity(direccionDTO.getId());
        if (direccion == null) {
            return false;
        }
        DireccionMapper.updateEntityFromDTO(direccion, direccionDTO);
        return true;
    }

    public boolean eliminarDireccion(String id) {
    	Direccion direccion = buscarDireccionEntity(id);
        if (direccion == null) {
            return false;
        }
        
        empresaEnvios.getDirecciones().remove(direccion);
        return true;
    }

    public Direccion buscarDireccionEntity(String id) {
        for (Direccion direccion : empresaEnvios.getDirecciones()) {
            if (direccion.getId().equals(id)) {
                return direccion;
            }
        }
        return null;
    }
}
