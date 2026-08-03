package Esercizio2.dao;

import java.util.List;

public interface InterfacciaDao<T> {
	
	public void inserisci(List<T> tipo);
	
	public T cerca(Integer id);
	
	public List<T> cercaTutti();
	
	public void modificaStato(Integer id, String stato);
	
	public void cancella(Integer id);
	
	public void cancellaTutti();

}
