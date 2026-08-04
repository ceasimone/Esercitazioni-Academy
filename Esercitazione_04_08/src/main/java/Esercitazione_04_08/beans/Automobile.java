package Esercitazione_04_08.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Automobile {
	
	private String modello;
	private Motore motore;
	public Automobile() {
		super();
	}
	public Automobile(String modello, Motore motore) {
		super();
		this.modello = modello;
		this.motore = motore;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Motore getMotore() {
		return motore;
	}
	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	
	@PostConstruct
	public void  metodoPostConstruct() {
		System.out.println("Auto appena creata");
	}
	
	@PreDestroy
	public void metodoPreDestry() {
		System.out.println("Auto portata all'autodemolizione");
	}
	
	@Override
	public String toString() {
		return "Automobile [modello=" + modello + ", motore=" + motore + "]";
	}
	
	
}
