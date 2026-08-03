package Esercizio3.main;

import java.util.ArrayList;
import java.util.List;

import Esercizio3.dao.GiocoDaTavoloDao;
import Esercizio3.dao.PartecipanteDao;
import Esercizio3.entity.GiocoDaTavolo;
import Esercizio3.entity.Partecipante;

public class Main {

	public static void main(String[] args) {
		
		
		GiocoDaTavolo g1 = new GiocoDaTavolo("Dixit", "libellud", 4 ,12 , 12);
		GiocoDaTavolo g2 = new GiocoDaTavolo("La casa della follia", null, 1 ,5 , 12);
		Partecipante p1 = new Partecipante(1,"Mario","Sturniolo", 33);
		Partecipante p2 = new Partecipante(2,"Luigi","Bianchi", 25);
		Partecipante p3 = new Partecipante(3,"Paolo","Ruffini", 47);
		Partecipante p4 = new Partecipante(4,"Lupo","Lucio", 60);
		
		List<Partecipante> array1 = new ArrayList<>();
		
		array1.add(p1);
		array1.add(p2);
		
		List<Partecipante> array2 = new ArrayList<>();
		array2.add(p3);
		array2.add(p4);
		
		List<Partecipante> array3= new ArrayList<>();
		
		array3.add(p1);
		array3.add(p2);
		array3.add(p3);
		array3.add(p4);
		
		
		List<GiocoDaTavolo> listaGiochi = new ArrayList<>();
		
		listaGiochi.add(g1);
		listaGiochi.add(g2);
		
		GiocoDaTavoloDao gdt = new GiocoDaTavoloDao();
		PartecipanteDao pd = new PartecipanteDao();
		
		pd.aggiungi(array3);
		gdt.aggiungi(listaGiochi);
		
		pd.cercaTutti();
		gdt.cercaTutti();		
		
		
		p1.setGioco(g1);
		p2.setGioco(g1);
		p3.setGioco(g2);
		p4.setGioco(g2);
		
		g1.setPartecipanti(array1);
		g2.setPartecipanti(array2);
		
		pd.aggiungi(array3);
		gdt.aggiungi(listaGiochi);
		System.out.println(pd.cercaTutti());
		System.out.println(gdt.cercaTutti());
		
		
		pd.modifica(2, "Carlo");
		gdt.modifica("La casa della follia", "asmodee");
		
		System.out.println(pd.cerca(2));
		System.out.println(gdt.cerca("La casa della follia"));
		
		pd.cancella(4);
		
		gdt.cancella("dixit");
		
		System.out.println(pd.cercaTutti());
		System.out.println(gdt.cercaTutti());

	}

}
