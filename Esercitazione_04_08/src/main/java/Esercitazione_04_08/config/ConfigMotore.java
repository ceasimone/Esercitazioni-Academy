package Esercitazione_04_08.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import Esercitazione_04_08.beans.Motore;

@Configuration
@Import(ConfigAutomobile.class)
public class ConfigMotore {
	
	
	@Bean(name="elettrico")
	public Motore motore1() {
		Motore m = new Motore();
		m.setTipo("elettrico");
		return m; //1
		
	}
	@Bean(name="benzina")
	public Motore motore2() {
		Motore m = new Motore();
		m.setTipo("benzina");
		return m; //1
	}
	@Bean(name="diesel")
	public Motore motore3() {
		Motore m = new Motore();
		m.setTipo("diesel");
		return m; //1
	}

}
