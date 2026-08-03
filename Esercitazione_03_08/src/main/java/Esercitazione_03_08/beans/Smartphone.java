package Esercitazione_03_08.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class Smartphone {
	private String modello;
	private String marca;
	
	@Autowired
	private Batteria batteria;
	
	@Lazy
	public Smartphone(Batteria batteria) {
		super();
		this.batteria = batteria;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Batteria getBatteria() {
		return batteria;
	}

	public void setBatteria(Batteria batteria) {
		this.batteria = batteria;
	}

	@Override
	public String toString() {
		return "Smartphone [modello=" + modello + ", marca=" + marca + ", batteria=" + batteria + "]";
	}

	@PostConstruct
	public void metodoPostConstruct() {
		System.out.println("Bean Smartphone appena creato");
	}
	@PreDestroy
	public void metodoPreDestroy() {
		System.out.println("Bean Smartphone sta per essere distrutto");
	}

}
