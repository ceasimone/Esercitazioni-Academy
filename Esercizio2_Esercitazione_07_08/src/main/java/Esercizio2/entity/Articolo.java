package Esercizio2.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Articolo {

	@Id
	private Integer codice;

	private double prezzo;

	private String nome;

	private String descrizione;

	private String categoria;


	@ManyToMany(mappedBy = "articoli")
	private List<Ordine> ordini;


	public Articolo() {

	}


	public Articolo(Integer codice, double prezzo, String nome, String descrizione, String categoria) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.nome = nome;
		this.descrizione = descrizione;
		this.categoria = categoria;
	}


	public Integer getCodice() {
		return codice;
	}


	public void setCodice(Integer codice) {
		this.codice = codice;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public List<Ordine> getOrdini() {
		return ordini;
	}


	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}


	@Override
	public String toString() {
		return "Articolo [codice=" + codice + ", prezzo=" + prezzo + ", nome=" + nome + ", descrizione="
				+ descrizione + ", categoria=" + categoria + "]";
	}

}