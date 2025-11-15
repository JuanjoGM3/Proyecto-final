package model;

import java.util.ArrayList;

public class Repartidor {
	
	private String id; 
	private String nombre; 
	private String correo; 
	private String telefono;
	private zonaCobertura cobertura;
	private Estado estado;
	ArrayList<Envio> enviosAsignados;
	
	public enum Estado {ACTIVO,INACTIVO,ENRUTA}
	public enum zonaCobertura {}
	
	public Repartidor(String id, String nombre, String correo, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.enviosAsignados = new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public zonaCobertura getCobertura() {
		return cobertura;
	}
	public void setCobertura(zonaCobertura cobertura) {
		this.cobertura = cobertura;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public ArrayList<Envio> getEnviosAsignados() {
		return enviosAsignados;
	}
	public void addEnvio(Envio envio) {
		this.enviosAsignados.add(envio);
	}
}
