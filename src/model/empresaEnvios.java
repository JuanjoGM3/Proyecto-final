package model;

import java.util.ArrayList;

public class empresaEnvios {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Repartidor> repartidores;
	private ArrayList<Pago> historialPagos;
	private ArrayList<Direccion> direcciones;
	private  static empresaEnvios instancia;
	
	public empresaEnvios() {
		this.usuarios = new ArrayList<>();
		this.repartidores = new ArrayList<>();
		this.historialPagos = new ArrayList<>();
		this.direcciones = new ArrayList<>();
	}
    public static empresaEnvios getInstancia() {
        if (instancia == null) {
            instancia = new empresaEnvios();
        }
        return instancia;
    }
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Repartidor> getRepartidores() {
		return repartidores;
	}
	public void setRepartidores(ArrayList<Repartidor> repartidores) {
		this.repartidores = repartidores;
	}
	public ArrayList<Pago> getHistorialPagos() {
		return historialPagos;
	}
	public void setHistorialPagos(ArrayList<Pago> historialPagos) {
		this.historialPagos = historialPagos;
	}
	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(ArrayList<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
}
