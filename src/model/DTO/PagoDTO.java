package model.DTO;

public class PagoDTO {
	
	private String id;
	private double monto;
	private boolean resultado;
	
	public PagoDTO(String id, double monto) {
		this.id = id;
		this.monto = monto;
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
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
}

