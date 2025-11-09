package model;

public class Direccion {
	
	private String id;
	private String alias;
	private String calle; 
	private String ciudad;
	private String cooedenadas;
	
	public Direccion(String id, String alias, String calle, String ciudad, String cooedenadas) {
		this.id = id;
		this.alias = alias;
		this.calle = calle;
		this.ciudad = ciudad;
		this.cooedenadas = cooedenadas;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCooedenadas() {
		return cooedenadas;
	}
	public void setCooedenadas(String cooedenadas) {
		this.cooedenadas = cooedenadas;
	}
}
