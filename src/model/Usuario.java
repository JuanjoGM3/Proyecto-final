package model;

import java.util.ArrayList;

public class Usuario {
	
	private String id; 
	private String nombre; 
	private String correo; 
	private String telefono;
	private ArrayList<Direccion> direcionesFrecuentes;
	private String contraseña;
	
	public Usuario(String id, String nombre, String correo, String telefono, String contraseña) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.direcionesFrecuentes = new ArrayList<>();
		this.contraseña = contraseña;
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
	public ArrayList<Direccion> getDirecionesFrecuentes() {
		return direcionesFrecuentes;
	}
	public void addDirecionesFrecuentes(Direccion direcion) {
		this.direcionesFrecuentes.add(direcion);
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
