package progettohibernate.entity;



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
public class Libro {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String titolo;
	@Column
	private String descrizione;
	
	@ManyToOne //molti libri un solo autore
	@JoinColumn(name= "id_autore")
	private Autore autore;
	
	public Libro() {
		super();
	}
	
	public Libro(String titolo, String descrizione) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
	}

	public Libro(Integer id, String titolo, String descrizione) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.descrizione = descrizione;
	}
	
	public Libro(String titolo, String descrizione, Autore autore) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.autore = autore;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione + "]";
	}

}
