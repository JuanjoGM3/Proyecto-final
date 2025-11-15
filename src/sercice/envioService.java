package sercice;

import model.EmpresaEnvios;
import model.Envio;
import model.Envio.Estado;
import model.DTO.EnvioDTO;

public class envioService {
	
	EmpresaEnvios empresaEnvios;

	public envioService() {
		this.empresaEnvios = EmpresaEnvios.getInstancia();
	}
	
	public void solicitudEnvío(EnvioDTO envio) {
		if (buscarEnvioEntity(envio.getId()) != null) {
			envio.setEstado(Estado.SOLICITADO);
		}
	}

	public Envio buscarEnvioEntity(String id) {
		for (Envio envio : empresaEnvios.getEnvios()) {
            if (envio.getId().equals(id)) {
                return envio;
            }
        }
        return null;
	}
	
	public boolean actualizarEstado(Envio envio, Estado estado) {
		if (buscarEnvioEntity(envio.getId()) != null) {
			envio.setEstado(estado);
			return true;
		}
		return false;
	}
}
