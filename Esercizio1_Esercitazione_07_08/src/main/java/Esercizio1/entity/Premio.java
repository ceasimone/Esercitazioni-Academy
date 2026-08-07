package Esercizio1.entity;

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
public class Premio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_premio;
	
	@Column
	private String nome;
	
	@Column
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name="id_film")
	private Film film;

	public Premio() {
		super();
	}

	public Premio(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Premio [id_premio=" + id_premio + ", nome=" + nome + ", categoria=" + categoria + ", film=" + film
				+ "]";
	}
	
	
}
