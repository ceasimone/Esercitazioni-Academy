package Esercizio3.entity;

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
public class Partecipante {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private Integer eta;
	
	@ManyToOne
	@JoinColumn
	private GiocoDaTavolo gioco;

	public Partecipante() {
		super();
	}

	public Partecipante(Integer id, String nome, String cognome, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Partecipante(Integer id, String nome, String cognome, Integer eta, GiocoDaTavolo gioco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.gioco = gioco;
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

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public GiocoDaTavolo getGioco() {
		return gioco;
	}

	public void setGioco(GiocoDaTavolo gioco) {
		this.gioco = gioco;
	}

	@Override
	public String toString() {
		return "Partecipante [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", gioco="
				+ gioco + "]";
	}
	
}
