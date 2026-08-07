package Esercizio1.entity;

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
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_film;
	@Column
	private String titolo;
	@Column
	private String categoria;
	
	@OneToMany(mappedBy="film")
	private List<Premio> premi;

	public Film() {
		super();
	}

	public Film(String titolo, String categoria) {
		super();
		this.titolo = titolo;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id_film;
	}

	public void setId(Integer id_film) {
		this.id_film = id_film;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Premio> getPremi() {
		return premi;
	}

	public void setPremi(List<Premio> premi) {
		this.premi = premi;
	}

	@Override
	public String toString() {
		return "Film [id=" + id_film + ", titolo=" + titolo + ", categoria=" + categoria + "]";
	}
	
	

}
