package Esercizio2.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table
public class Ordine {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;


	private Date dataRichiesta;


	private double prezzoTotale;


	private Integer numeroArticoli;



	@ManyToMany
	private List<Articolo> articoli;



	public Ordine() {

	}



	public Ordine(Date dataRichiesta, double prezzoTotale, Integer numeroArticoli) {

		this.dataRichiesta = dataRichiesta;
		this.prezzoTotale = prezzoTotale;
		this.numeroArticoli = numeroArticoli;

	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getDataRichiesta() {
		return dataRichiesta;
	}



	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}



	public double getPrezzoTotale() {
		return prezzoTotale;
	}



	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}



	public Integer getNumeroArticoli() {
		return numeroArticoli;
	}



	public void setNumeroArticoli(Integer numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
	}



	public List<Articolo> getArticoli() {
		return articoli;
	}



	public void setArticoli(List<Articolo> articoli) {
		this.articoli = articoli;
	}



	@Override
	public String toString() {

		return "Ordine [id=" + id + ", dataRichiesta=" + dataRichiesta 
				+ ", prezzoTotale=" + prezzoTotale
				+ ", numeroArticoli=" + numeroArticoli + "]";

	}

}