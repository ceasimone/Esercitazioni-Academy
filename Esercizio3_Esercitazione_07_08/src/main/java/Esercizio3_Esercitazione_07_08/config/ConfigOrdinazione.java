package Esercizio3_Esercitazione_07_08.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Esercizio3_Esercitazione_07_08.beans.Ordinazione;
import Esercizio3_Esercitazione_07_08.beans.Pizza;

@Configuration
public class ConfigOrdinazione {
	
	@Bean
	public Ordinazione ordinazionePizzaBianca(@Qualifier("bianca") Pizza pizza) {
		Ordinazione o= new Ordinazione();
		o.setPizza(pizza);
		return o;
		
	}
	
	@Bean
	public Ordinazione ordinazionePizzaRossa(@Qualifier("rossa") Pizza pizza) {
		Ordinazione o= new Ordinazione();
		o.setPizza(pizza);
		return o;
		
	}

}
