package model;

public class Tarifa {
	
	private double distancia;
	private double peso;
	private double volumen;
	private double prioridad;
	private double recargosAdicionales;
	
	public Tarifa(double distancia, double peso, double volumen, double prioridad, double recargosAdicionales) {
		this.distancia = distancia;
		this.peso = peso;
		this.volumen = volumen;
		this.prioridad = prioridad;
		this.recargosAdicionales = recargosAdicionales;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public double getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(double prioridad) {
		this.prioridad = prioridad;
	}
	public double getRecargosAdicionales() {
		return recargosAdicionales;
	}
	public void setRecargosAdicionales(double recargosAdicionales) {
		this.recargosAdicionales = recargosAdicionales;
	}
}
