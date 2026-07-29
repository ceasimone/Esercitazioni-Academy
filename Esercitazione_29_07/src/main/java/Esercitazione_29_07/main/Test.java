package Esercitazione_29_07.main;

import java.util.ArrayList;
import java.util.List;

import Esercitazione_29_07.dao.*;
import Esercitazione_29_07.entity.*;

public class Test {

	public static void main(String[] args) {
		
		InterfacciaDao<Persona> personaDaoImpl = new PersonaDaoImpl();
		InterfacciaDao<Automobile> automobileDaoImpl = new AutomobileDaoImpl();
		
		Persona p1 = new Persona(1,"Mario","Rossi","via roma","Lavoratore 1",33);
		
		personaDaoImpl.insert(p1);
		
		Persona p2 = new Persona(2,"Luigi","Bianchi","via napoli","Lavoratore 2",27);
		Persona p3 = new Persona(3,"Marta","Neri","via roma","Lavoratore 3",29);
		Persona p4 = new Persona(4,"Pippo","Franco","via roma","Lavoratore 4",31);
		Persona p5 = new Persona(5,"Giulio","Verdi","via roma","Lavoratore 5",35);
		
		List<Persona> listaPersone = new ArrayList<>();
		
		
		listaPersone.add(p2);
		listaPersone.add(p3);
		listaPersone.add(p4);
		listaPersone.add(p5);
		
		personaDaoImpl.insertAll(listaPersone);
		
		System.out.println(personaDaoImpl.findAll());
		
		personaDaoImpl.modify(3, "Giulia");
		System.out.println(personaDaoImpl.findOne(3));
		
		personaDaoImpl.delete(5);
		System.out.println(personaDaoImpl.findAll());
		
		Automobile a1 = new Automobile(1,"Marca1", "Modello1", "telaio1", "targa1", "trazione1" );
		Automobile a2 = new Automobile(2,"Marca2", "Modello2", "telaio2", "targa2", "trazione2" );
		Automobile a3 = new Automobile(3,"Marca3", "Modello3", "telaio3", "targa3", "trazione3" );
		Automobile a4 = new Automobile(4,"Marca4", "Modello4", "telaio4", "targa4", "trazione4" );
		Automobile a5 = new Automobile(5,"Marca5", "Modello5", "telaio5", "targa5", "trazione5" );
		
		List<Automobile> autoP1 = new ArrayList<>();
		autoP1.add(a1);
		autoP1.add(a5);
		p1.setAuto(autoP1);
		a1.setProprietario(p1);
		a3.setProprietario(p1);
		
		automobileDaoImpl.insert(a1);
		
		List<Automobile> listaAutomobili = new ArrayList<>();
		
		listaAutomobili.add(a2);
		listaAutomobili.add(a3);
		listaAutomobili.add(a4);
		listaAutomobili.add(a5);
		
		automobileDaoImpl.insertAll(listaAutomobili);
		
		System.out.println(automobileDaoImpl.findAll());
		automobileDaoImpl.modify(3, " NuovoModello");
		System.out.println(automobileDaoImpl.findOne(3));
		
		automobileDaoImpl.delete(5);
		System.out.println(automobileDaoImpl.findAll());
		
		personaDaoImpl.delete(1);
		System.out.println(personaDaoImpl.findAll());
		System.out.println(automobileDaoImpl.findAll());
		
		
		

	}

}
