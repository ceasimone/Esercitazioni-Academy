package progettohibernate.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Classe di configurazione per capire dove si trova il file hibernate.cfg.xml che contiene
//tutte le impostazioni di configurazione per connettersi al database

public class HibernateUtil {
	
	//permette di aprire una sessione col database
	private static SessionFactory sessionFactory;
	
	
	//metodo che ci permette di aprire la session con MySQL attraverso il file di configurazione
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
}
