package Esercizio2.main;

import java.util.ArrayList;
import java.util.List;

import Esercizio2.dao.RichiestaFerieDao;
import Esercizio2.entity.RichiestaFerie;

public class Main {

	public static void main(String[] args) {
		RichiestaFerie rc1= new RichiestaFerie(1,"attiva");
		RichiestaFerie rc2= new RichiestaFerie(2,"chiuso");
		
		RichiestaFerieDao rfDao = new RichiestaFerieDao();
		
		List<RichiestaFerie> array = new ArrayList<>();
		
		array.add(rc1);
		array.add(rc2);
		
		
		rfDao.inserisci(array);
		System.out.println(rfDao.cerca(1));
		System.out.println(rfDao.cercaTutti());
		rfDao.modificaStato(1, "aperto");
		System.out.println(rfDao.cercaTutti());
		rfDao.cancella(2);
		System.out.println(rfDao.cercaTutti());
		rfDao.cancellaTutti();
		System.out.println(rfDao.cercaTutti());
		
	}

}
