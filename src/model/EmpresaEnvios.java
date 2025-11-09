package model;

import java.util.ArrayList;

public class EmpresaEnvios {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Repartidor> repartidores;
	private ArrayList<Pago> historialPagos;
	private ArrayList<Direccion> direcciones;
	private ArrayList<Envio> envios;
	private  static EmpresaEnvios instancia;
	
	public EmpresaEnvios() {
		this.usuarios = new ArrayList<>();
		this.repartidores = new ArrayList<>();
		this.historialPagos = new ArrayList<>();
		this.direcciones = new ArrayList<>();
		this.envios = new ArrayList<>();
	}
    public static EmpresaEnvios getInstancia() {
        if (instancia == null) {
            instancia = new EmpresaEnvios();
        }
        return instancia;
    }
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void addUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	public ArrayList<Repartidor> getRepartidores() {
		return repartidores;
	}
	public void addRepartidores(Repartidor repartidore) {
		this.repartidores.add(repartidore);
	}
	public ArrayList<Pago> getHistorialPagos() {
		return historialPagos;
	}
	public void addHistorialPagos(Pago Pago) {
		this.historialPagos.add(Pago);
	}
	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}
	public void addDirecciones(Direccion direccion) {
		this.direcciones.add(direccion);
	}
	public ArrayList<Envio> getEnvios() {
		return envios;
	}
	public void setEnvios(Envio envio) {
		this.envios.add(envio);
	}
}
