package progettohibernate.main;

import java.util.ArrayList;
import java.util.List;

import progettohibernate.dao.InterfacciaDao;
import progettohibernate.entity.CodiceFiscale;
import progettohibernate.dao.CodiceFiscaleDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		List <CodiceFiscale> listaCF = new ArrayList<>();
		
		listaCF.add(new CodiceFiscale(1, "ABC123"));
		listaCF.add(new CodiceFiscale(2, "123FGH"));
		listaCF.add(new CodiceFiscale(3, "GHJ456"));
		listaCF.add(new CodiceFiscale(4, "789TYU"));
		listaCF.add(new CodiceFiscale(5, "XCV246"));
		
		InterfacciaDao<CodiceFiscale> codiceFiscaleDao = new CodiceFiscaleDaoImpl();
		
		codiceFiscaleDao.insertMany(listaCF);
	}

}
