package Esercizio3_Esercitazione_07_08.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import Esercizio3_Esercitazione_07_08.beans.Pizza;

@Configuration
@Import(ConfigOrdinazione.class)
public class ConfigPizza {
	
	@Bean(name="bianca")
	public Pizza pizzaBianca() {
		Pizza p= new Pizza();
		p.setTipo("bianca");
		return p;
	}
	
	@Bean(name="rossa")
	public Pizza pizzaRossa() {
		Pizza p= new Pizza();
		p.setTipo("rossa");
		return p;
	}
	
	

}
