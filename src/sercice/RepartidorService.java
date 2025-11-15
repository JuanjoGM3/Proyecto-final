package sercice;

import java.util.ArrayList;
import java.util.List;

import model.Repartidor;
import model.Repartidor.Estado;
import model.empresaEnvios;
import model.DTO.EnvioDTO;
import model.DTO.RepartidorDTO;
import model.Envio;
import utils.Mappers.RepartidorMapper;

public class RepartidorService {
	private empresaEnvios empresaEnvios;
	
	public RepartidorService(model.empresaEnvios empresaEnvios) {
		super();
		this.empresaEnvios = empresaEnvios.getInstancia();
	}

	public List<RepartidorDTO> obtenerTodosLosRepartidores() {
		List<RepartidorDTO> repartidoresDTO = new ArrayList<>();
		for (Repartidor repartidor : empresaEnvios.getRepartidores()) {
			repartidoresDTO.add(RepartidorMapper.toDTO(repartidor));
		}
		return repartidoresDTO;
	}

	public RepartidorDTO buscarRepartidorPorId(String id) {
		Repartidor repartidor = buscarRepartidorEntity(id);
		return (repartidor != null) ? RepartidorMapper.toDTO(repartidor) : null;
	}
	public boolean agregarRepartidor(RepartidorDTO repartidorDTO) {

		if (buscarRepartidorEntity(repartidorDTO.getId()) != null) {
			return false; 
		}
		Repartidor repartidor = RepartidorMapper.toEntity(repartidorDTO);
		empresaEnvios.addRepartidores(repartidor);
		return true;
	}
	public boolean actualizarRepartidor(RepartidorDTO repartidorDTO) {
		Repartidor repartidor = buscarRepartidorEntity(repartidorDTO.getId());
		if (repartidor == null) {
			return false; 
		}
		RepartidorMapper.updateEntityFromDTO(repartidor, repartidorDTO);
		return true;
	}
	public boolean cambiarDisponibilidad(String id, Estado nuevoEstado) {
		Repartidor repartidor = buscarRepartidorEntity(id);
		if (repartidor == null) {
			return false; 
		}
		repartidor.setEstado(nuevoEstado);
		return true;
	}
	
	public ArrayList<Envio> consultarEnviosAsignados(String idRepartidor) {

	    Repartidor repartidor = buscarRepartidorEntity(idRepartidor);

	    return repartidor != null ? repartidor.getEnviosAsignados() : null;
	}
	
	public boolean existeRepartidor(String id) {
		return buscarRepartidorEntity(id) != null;
	}
	
	private Repartidor buscarRepartidorEntity(String id) {
		for (Repartidor repartidor : empresaEnvios.getRepartidores()) {
			if (repartidor.getId().equals(id)) {
				return repartidor;
			}
		}
		return null;
	}
}
