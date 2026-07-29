package progettohibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "codice_fiscale")
public class CodiceFiscale {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String cf;

	public CodiceFiscale() {
		super();
	}

	public CodiceFiscale(Integer id, String cf) {
		super();
		this.id = id;
		this.cf = cf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "CodiceFiscale [id=" + id + ", cf=" + cf + "]";
	}
	
}
