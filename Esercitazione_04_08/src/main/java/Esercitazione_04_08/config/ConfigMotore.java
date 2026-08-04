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
		return new Motore(); //1
	}
	@Bean(name="benzina")
	public Motore motore2() {
		return new Motore(); //2
	}
	@Bean(name="diesel")
	public Motore motore3() {
		return new Motore();  //3
	}

}
