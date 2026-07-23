package esercizio1;

import java.io.Serializable;

public class Libro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String titolo;
	private transient double prezzo;
	private String autore;
	
	public Libro() {
		super();
	}

	public Libro(String titolo, double prezzo, String autore) {
		super();
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + ", autore=" + autore + "]";
	}
	
	

}
