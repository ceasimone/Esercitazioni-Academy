package Esercitazione_29_07.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Automobile {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String marca;
	@Column
	private String modello;
	@Column(unique = true)
	private String telaio;
	@Column(unique = true)
	private String targa;
	@Column
	private String trazione;
	
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona proprietario;
	public Automobile() {
		super();
	}
	public Automobile(String marca, String modello, String telaio, String trazione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.telaio = telaio;
		this.trazione = trazione;
	}
	public Automobile(Integer id, String marca, String modello, String telaio, String targa, String trazione) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.telaio = telaio;
		this.targa = targa;
		this.trazione = trazione;
	}
	public Automobile(Integer id, String marca, String modello, String telaio, String targa, String trazione,
			Persona proprietario) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.telaio = telaio;
		this.targa = targa;
		this.trazione = trazione;
		this.proprietario = proprietario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTelaio() {
		return telaio;
	}
	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getTrazione() {
		return trazione;
	}
	public void setTrazione(String trazione) {
		this.trazione = trazione;
	}
	public Persona getProprietario() {
		return proprietario;
	}
	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "\nAutomobile [id=" + id + ", marca=" + marca + ", modello=" + modello + ", telaio=" + telaio + ", targa="
				+ targa + ", trazione=" + trazione + ", proprietario=" + proprietario + "]";
	}
	

}
