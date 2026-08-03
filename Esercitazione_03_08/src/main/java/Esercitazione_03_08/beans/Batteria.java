package Esercitazione_03_08.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
//@Scope("prototype")
public class Batteria {
	
	private String stato;
	private double livelloDiCarica;
	
	public Batteria() {
		super();
	}
	
	public Batteria(String stato, double livelloDiCarica) {
		super();
		this.stato = stato;
		this.livelloDiCarica = livelloDiCarica;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public double getLivelloDiCarica() {
		return livelloDiCarica;
	}

	public void setLivelloDiCarica(double livelloDiCarica) {
		this.livelloDiCarica = livelloDiCarica;
	}

	@Override
	public String toString() {
		return "Batteria [stato=" + stato + ", livelloDiCarica=" + livelloDiCarica + "]";
	}
	
	@PostConstruct
	public void metodoPostConstruct() {
		System.out.println("Bean Batteria appena creato");
	}
	
	@PreDestroy
	public void metodoPreDestroy() {
		System.out.println("Bean Batteria sta per essere distrutto");
	}
	

}
