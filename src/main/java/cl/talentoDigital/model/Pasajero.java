package cl.talentoDigital.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "pasajero")
@SequenceGenerator(name="SQ_PASAJERO", initialValue=1, allocationSize=1)
public class Pasajero {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SQ_PASAJERO")
	private Long id;
	private String rut;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudadNatal;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "pasajero_id", referencedColumnName = "id")
	private List<Destino> destino;
	
	public Pasajero() {
		// TODO Auto-generated constructor stub
	}

	public Pasajero(Long id, String rut, String nombre, String apellido, Integer edad, String ciudadNatal,
			List<Destino> destino) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudadNatal = ciudadNatal;
		this.destino = destino;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCiudadNatal() {
		return ciudadNatal;
	}

	public void setCiudadNatal(String ciudadNatal) {
		this.ciudadNatal = ciudadNatal;
	}

	public List<Destino> getDestino() {
		return destino;
	}

	public void setDestino(List<Destino> destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", ciudadNatal=" + ciudadNatal + ", destino=" + destino + "]";
	}
	
	
}
