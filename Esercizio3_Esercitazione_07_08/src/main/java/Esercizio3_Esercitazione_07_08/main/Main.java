package Esercizio3_Esercitazione_07_08.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Esercizio3_Esercitazione_07_08.beans.Ordinazione;
import Esercizio3_Esercitazione_07_08.beans.Pizza;
import Esercizio3_Esercitazione_07_08.config.ConfigPizza;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigPizza.class);
		
		Ordinazione o1 = (Ordinazione) context.getBean("ordinazionePizzaBianca");
		
		System.out.println(o1);
		
		o1.getPizza().setIngredienti("Ingredienti pizza bianca");
		
		System.out.println(o1);
		
		Pizza p1 = (Pizza) context.getBean("bianca");
		
		p1.setIngredienti("Aggiorno Ingredienti pizza bianca");
		
		System.out.println(o1);
		
		Ordinazione o2 = (Ordinazione) context.getBean("ordinazionePizzaRossa");
		
		System.out.println(o2);
		
		o2.getPizza().setIngredienti("Ingredienti pizza rossa");
		
		System.out.println(o2);
		
		Pizza p2 = (Pizza) context.getBean("rossa");
		
		p2.setIngredienti("Aggiorno ingredienti pizza rossa");
		
		System.out.println(o2);
		
		context.close();
		

	}

}
