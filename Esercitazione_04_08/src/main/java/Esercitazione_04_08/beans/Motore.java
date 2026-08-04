package Esercitazione_04_08.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motore {
	private String tipo;
	
	public Motore() {
		super();
	}
	
	public Motore(String tipo) {
		super();
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@PostConstruct
	public void  metodoPostConstruct() {
		System.out.println("Motore appena realizzato");
	}
	
	@PreDestroy
	public void metodoPreDestry() {
		System.out.println("Zucchero nel motore");
	}
	
	
	
	@Override
	public String toString() {
		return "Motore [tipo=" + tipo + "]";
	}
	
	

}
