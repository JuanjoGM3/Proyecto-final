package model.DTO;

import model.Envio.Estado;

public class EnvioDTO {
	
	private String id;
	private String idOrigen;
	private String idDestino;
	private int peso;
	private int dimenciones;
	private double costo;
	private Estado estado;
	
	public EnvioDTO(String id, String idOrigen, String idDestino, int peso, int dimenciones, double costo, Estado estado) {
		this.id = id;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.peso = peso;
		this.dimenciones = dimenciones;
		this.costo = costo;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdOrigen() {
		return idOrigen;
	}
	public void setIdOrigen(String idOrigen) {
		this.idOrigen = idOrigen;
	}
	public String getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getDimenciones() {
		return dimenciones;
	}
	public void setDimenciones(int dimenciones) {
		this.dimenciones = dimenciones;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}

