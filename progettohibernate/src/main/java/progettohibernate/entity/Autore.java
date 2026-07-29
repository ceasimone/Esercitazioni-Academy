package progettohibernate.entity;

import java.util.List;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity //indica che la classe Autore è un'entità, rende la classe persistente
@Table  //indica la tabella corrispondente nel database
public class Autore {
	
	@Id //indica che è la chiave primaria
	@Column //indica che è una colonna della tabella
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@OneToOne //definisce la relazione 1 a 1
	@JoinColumn( name= "id_codice_fiscale")
	private CodiceFiscale cf;
	
	/*
	 * Un autore molti libri
	 * 
	 * mappedBy -> indica il nome dell'attributo nella classe Libro che gestisce la relazione, il proprietario della relazione,
	 *  quel campo che contiene la chiave esterna
	 *  
	 *  Cascade -> per la propagazione automatica delle operazioni, va inserito
	 *  			sull'entità proprietaria della relazione
	 *  			ALL-> salva,aggiorna e cancella
	 */
	@OneToMany (mappedBy = "autore"/*, cascade = CascadeType.ALL*/)
	List<Libro> libri;
	
	public Autore() {
		super();
	}
	
	public Autore(Integer id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Autore(Integer id, String nome, String cognome, CodiceFiscale cf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	public Autore(Integer id, String nome, String cognome, CodiceFiscale cf, List<Libro> libri) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.libri = libri;
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
	
	public CodiceFiscale getCf() {
		return cf;
	}

	public void setCf(CodiceFiscale cf) {
		this.cf = cf;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

	@Override
	public String toString() {
		return "Autore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}
