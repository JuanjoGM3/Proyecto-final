package model;

import java.time.LocalDateTime;

public class Pago {
	private String id;
	private double monto;
	private LocalDateTime fecha;
	private boolean resultado;
	
	public Pago(String id, double monto, LocalDateTime fecha) {
		this.id = id;
		this.monto = monto;
		this.fecha = fecha;
		this.resultado = false;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
}
