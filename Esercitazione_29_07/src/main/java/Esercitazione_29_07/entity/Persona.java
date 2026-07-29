package Esercitazione_29_07.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Persona {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String indirizzo;
	@Column
	private String professione;
	@Column
	private Integer eta;
	
	@OneToMany (mappedBy="proprietario")
	private List<Automobile> auto;
	
	public Persona() {
		super();
	}
	public Persona(String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}
	public Persona(Integer id, String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}
	
	public Persona(Integer id, String nome, String cognome, String indirizzo, String professione, Integer eta,
			List<Automobile> auto) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
		this.auto = auto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getProfessione() {
		return professione;
	}
	public void setProfessione(String professione) {
		this.professione = professione;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	public List<Automobile> getAuto() {
		return auto;
	}
	public void setAuto(List<Automobile> auto) {
		this.auto = auto;
	}
	@Override
	public String toString() {
		return "\nPersona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo
				+ ", professione=" + professione + ", eta=" + eta + "]";
	}
	
	

}
