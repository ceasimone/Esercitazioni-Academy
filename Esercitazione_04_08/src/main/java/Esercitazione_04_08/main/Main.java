package Esercitazione_04_08.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Esercitazione_04_08.beans.Automobile;
import Esercitazione_04_08.beans.Motore;
import Esercitazione_04_08.config.ConfigMotore;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigMotore.class);
		
		
		Automobile a1 = (Automobile) context.getBean("autoElettrica");
		
		System.out.println(a1);
		
		Motore m1 = (Motore) context.getBean("elettrico");
		
		m1.setTipo("ciao");
		
		Motore m2 = (Motore) context.getBean("benzina");
		
		m2.setTipo("none");
		
		System.out.println(a1);
		
		Automobile a2 = (Automobile) context.getBean("autoBenzina");
		
		System.out.println(a2);
		
		context.close();

	}

}
