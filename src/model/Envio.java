package model;

import java.time.LocalDateTime;

public class Envio {
	
	private String id;
	private Direccion origen;
	private Direccion destino;
	private int peso;
	private int dimenciones;
	private double costo;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaEntrega;
	private Estado estado;
	
	public enum Estado {SOLICITADO, ASIGNADO, ENRUTA, ENTREGADO, INCIDENCIA}
	
	public Envio(String id, Direccion origen, Direccion destino, int peso, int dimenciones, double costo, Estado estado) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
		this.dimenciones = dimenciones;
		this.costo = costo;
		this.fechaCreacion = LocalDateTime.now();
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Direccion getOrigen() {
		return origen;
	}
	public void setOrigen(Direccion origen) {
		this.origen = origen;
	}
	public Direccion getDestino() {
		return destino;
	}
	public void setDestino(Direccion destino) {
		this.destino = destino;
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
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
