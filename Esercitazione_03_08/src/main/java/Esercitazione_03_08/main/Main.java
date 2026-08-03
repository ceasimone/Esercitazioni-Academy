package Esercitazione_03_08.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Esercitazione_03_08.beans.Batteria;
import Esercitazione_03_08.beans.Smartphone;

@ComponentScan("Esercitazione_03_08")
public class Main {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		Smartphone s1 = context.getBean(Smartphone.class);
		Smartphone s2 = context.getBean(Smartphone.class);
		
		s1.setMarca("Oppo");
		
		
		s2.setMarca("Iphone");
		System.out.println("\nSmartphone s1:");
		System.out.println(s1);
		System.out.println("\nSmartphone s2:");
		System.out.println(s2);
		
		Batteria b1 = context.getBean(Batteria.class);
		
		b1.setStato("funzionante");
		
		System.out.println("\nSmartphone s2 prima di settare lo stato:");
		System.out.println(s2);
		
		s1.setBatteria(b1);
		
		System.out.println("\nSmartphone s2 dopo aver settato lo stato della batteria su s1:");
		System.out.println(s2);
		
		
		
		context.close();
	}

}
