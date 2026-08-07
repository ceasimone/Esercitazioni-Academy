package Esercizio2.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Esercizio2.dao.ArticoloDAO;
import Esercizio2.dao.OrdineDAO;
import Esercizio2.entity.Articolo;
import Esercizio2.entity.Ordine;



public class Main {


	public static void main(String[] args) {


		ArticoloDAO articoloDAO = new ArticoloDAO();
		OrdineDAO ordineDAO = new OrdineDAO();



		// ARTICOLI

		Articolo a1 = new Articolo(
				1,
				10.50,
				"Mouse",
				"Mouse wireless",
				"Informatica"
		);


		Articolo a2 = new Articolo(
				2,
				25.00,
				"Tastiera",
				"Tastiera meccanica",
				"Informatica"
		);



		Articolo a3 = new Articolo(
				3,
				15.00,
				"HDMI",
				"Cavo HDMI",
				"Accessori"
		);



		List<Articolo> articoli = new ArrayList<>();

		articoli.add(a1);
		articoli.add(a2);
		articoli.add(a3);



		articoloDAO.inserisciTutti(articoli);



		// ORDINI


		Ordine o1 = new Ordine(
				new Date(),
				35.50,
				2
		);



		Ordine o2 = new Ordine(
				new Date(),
				40.00,
				2
		);



		List<Articolo> lista1 = new ArrayList<>();

		lista1.add(a1);
		lista1.add(a2);



		List<Articolo> lista2 = new ArrayList<>();

		lista2.add(a2);
		lista2.add(a3);



		o1.setArticoli(lista1);
		o2.setArticoli(lista2);



		List<Ordine> ordini = new ArrayList<>();

		ordini.add(o1);
		ordini.add(o2);



		ordineDAO.inserisciTutti(ordini);



		System.out.println("ARTICOLI:");

		for(Articolo a : articoloDAO.cercaTutti()) {

			System.out.println(a);

		}



		System.out.println("\nORDINI:");

		for(Ordine o : ordineDAO.cercaTutti()) {

			System.out.println(o);

		}


	}

}
