package Esercitazione_04_08.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Esercitazione_04_08.beans.Automobile;
import Esercitazione_04_08.beans.Motore;

@Configuration
public class ConfigAutomobile {
	
	@Bean
	public Automobile autoElettrica(@Qualifier("elettrico")Motore motore) {
		Automobile a = new Automobile("tesla",motore);
		return a;
	}
	@Bean
	public Automobile autoBenzina(@Qualifier("benzina")Motore motore) {
		Automobile a = new Automobile();
		a.setMotore(motore);
		return a;
	}
	@Bean
	public Automobile autoDiesel(@Qualifier("diesel")Motore motore) {
		Automobile a = new Automobile();
		a.setMotore(motore);
		return a;
	}
}
