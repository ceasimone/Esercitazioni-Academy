package Esercizio1.main;

import java.util.ArrayList;
import java.util.List;

import Esercizio1.dao.FilmDAO;
import Esercizio1.dao.PremioDAO;
import Esercizio1.entity.Film;
import Esercizio1.entity.Premio;

public class Main {

	public static void main(String[] args) {

				// DAO
				FilmDAO filmDAO = new FilmDAO();
				PremioDAO premioDAO = new PremioDAO();

				// FILM
				Film film1 = new Film("Titanic", "Drammatico");
				Film film2 = new Film("Interstellar", "Fantascienza");
				Film film3 = new Film("Il Signore degli Anelli", "Fantasy");

				List<Film> film = new ArrayList<>();

				film.add(film1);
				film.add(film2);
				film.add(film3);

				// Inserimento film
				filmDAO.inserisciTutti(film);


				// Recupero i film dal database
				film1 = filmDAO.cercaUno(1);
				film2 = filmDAO.cercaUno(2);
				film3 = filmDAO.cercaUno(3);


				// PREMI
				Premio premio1 = new Premio("Oscar", "Miglior film");
				Premio premio2 = new Premio("Oscar", "Migliori effetti speciali");

				Premio premio3 = new Premio("Oscar", "Miglior fotografia");
				Premio premio4 = new Premio("Golden Globe", "Miglior regia");

				Premio premio5 = new Premio("Oscar", "Miglior scenografia");
				Premio premio6 = new Premio("Saturn Award", "Miglior film");


				// Associazione premi-film
				premio1.setFilm(film1);
				premio2.setFilm(film1);

				premio3.setFilm(film2);
				premio4.setFilm(film2);

				premio5.setFilm(film3);
				premio6.setFilm(film3);


				// Lista premi
				List<Premio> premi = new ArrayList<>();

				premi.add(premio1);
				premi.add(premio2);
				premi.add(premio3);
				premi.add(premio4);
				premi.add(premio5);
				premi.add(premio6);


				// Inserimento premi
				premioDAO.inserisciTutti(premi);


				// CERCA TUTTI I FILM
				System.out.println("FILM:");

				for (Film f : filmDAO.cercaTutti()) {
					System.out.println(f);
				}


				// CERCA TUTTI I PREMI
				System.out.println("\nPREMI:");

				for (Premio p : premioDAO.cercaTutti()) {
					System.out.println(p);
				}


				// CERCA UN FILM
				System.out.println("\nCERCA FILM:");

				System.out.println(filmDAO.cercaUno(1));


				// MODIFICA NOME
				System.out.println("\nMODIFICA FILM:");

				filmDAO.ModificaNome(1, "Titanic - Film");

				System.out.println(filmDAO.cercaUno(1));


				// CANCELLA UN PREMIO
				System.out.println("\nCANCELLA PREMIO:");

				premioDAO.CancellaUno(6);

				System.out.println("Premio cancellato.");
			
	}

}
