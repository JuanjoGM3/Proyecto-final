package model.Services;

import java.util.ArrayList;
import java.util.List;

import model.Repartidor;
import model.DTO.RepartidorDTO;
import model.mappers.RepartidorMapper;


public class RepartidorService{
	
    private List<Repartidor> listaRepartidores;
	 
	 public RepartidorService() {
	        this.listaRepartidores = new ArrayList<>();
	        
	        
	    }
	 public List<RepartidorDTO> obtenerTodosLosRepartidores() {
	        List<RepartidorDTO> repartidoresDTO = new ArrayList<>();
	        for (Repartidor repartidor : listaRepartidores) {
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
	               listaRepartidores.add(repartidor);
	               return true;
	           }
	 public boolean actualizarRepartidor(RepartidorDTO repartidorDTO) {
	        Repartidor repartidor = buscarRepartidorEntity(repartidorDTO.getId());
	        if (repartidor == null) {
	            return false; 
	            
	            RepartidorMapper.updateEntityFromDTO(repartidor, repartidorDTO);
	            return true;
	            public boolean cambiarDisponibilidad(String id, String nuevoEstado) {
	                Repartidor repartidor = buscarRepartidorEntity(id);
	                if (repartidor == null) {
	                    return false; 
	                }
	                repartidor.setEstadoDisponibilidad(nuevoEstado);
	                return true;
	            }
	            public List<Envio> consultarEnviosAsignados(String idRepartidor) {
	                Repartidor repartidor = buscarRepartidorEntity(idRepartidor);
	                if (repartidor != null) {
	                    return repartidor.getEnviosAsignados(); 
	                }
	                return new ArrayList<>();
	            }
	            public boolean existeRepartidor(String id) {
	                return buscarRepartidorEntity(id) != null;
	            }
	            private Repartidor buscarRepartidorEntity(String id) {
	                for (Repartidor repartidor : listaRepartidores) {
	                    if (repartidor.getId().equals(id)) {
	                        return repartidor;
	                    }
	                }
	                return null;
	            }
	        }
