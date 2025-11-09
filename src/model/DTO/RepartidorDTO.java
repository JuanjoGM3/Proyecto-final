package model.DTO;

import model.Repartidor.zonaCobertura;

public class RepartidorDTO {
	private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private zonaCobertura cobertura;

    
    public RepartidorDTO() {
    }

    
    public RepartidorDTO(String id, String nombre, String correo, String telefono, zonaCobertura cobertura) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.cobertura = cobertura;
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

}
