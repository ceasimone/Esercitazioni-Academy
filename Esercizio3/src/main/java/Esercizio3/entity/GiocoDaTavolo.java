package Esercizio3.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="gioco_da_tavolo")
public class GiocoDaTavolo {
	@Id
	@Column
	private String nome;
	
	@Column(name="casa_produttrice")
	private String casaProduttrice;
	
	@Column(name="num_min_giocatori")
	private Integer numMinGiocatori;
	
	@Column (name="num_max_giocatori")
	private Integer numMaxGiocatori;
	
	@Column (name="eta_minima")
	private Integer etaMinima;
	
	@OneToMany (mappedBy = "gioco"/*, cascade = CascadeType.ALL*/)
	private List<Partecipante> partecipanti;

	public GiocoDaTavolo() {
		super();
	}

	public GiocoDaTavolo(String nome, String casaProduttrice, Integer numMinGiocatori, Integer numMaxGiocatori,
			Integer etaMinima) {
		super();
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numMinGiocatori = numMinGiocatori;
		this.numMaxGiocatori = numMaxGiocatori;
		this.etaMinima = etaMinima;
	}

	public GiocoDaTavolo(String nome, String casaProduttrice, Integer numMinGiocatori, Integer numMaxGiocatori,
			Integer etaMinima, List<Partecipante> partecipanti) {
		super();
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numMinGiocatori = numMinGiocatori;
		this.numMaxGiocatori = numMaxGiocatori;
		this.etaMinima = etaMinima;
		this.partecipanti = partecipanti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCasaProduttrice() {
		return casaProduttrice;
	}

	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}

	public Integer getNumMinGiocatori() {
		return numMinGiocatori;
	}

	public void setNumMinGiocatori(Integer numMinGiocatori) {
		this.numMinGiocatori = numMinGiocatori;
	}

	public Integer getNumMaxGiocatori() {
		return numMaxGiocatori;
	}

	public void setNumMaxGiocatori(Integer numMaxGiocatori) {
		this.numMaxGiocatori = numMaxGiocatori;
	}

	public Integer getEtaMinima() {
		return etaMinima;
	}

	public void setEtaMinima(Integer etaMinima) {
		this.etaMinima = etaMinima;
	}

	public List<Partecipante> getPartecipanti() {
		return partecipanti;
	}

	public void setPartecipanti(List<Partecipante> partecipanti) {
		this.partecipanti = partecipanti;
	}

	@Override
	public String toString() {
		return "GiocoDaTavolo [nome=" + nome + ", casaProduttrice=" + casaProduttrice + ", numMinGiocatori="
				+ numMinGiocatori + ", numMaxGiocatori=" + numMaxGiocatori + ", etaMinima=" + etaMinima + "]";
	}
	
}
