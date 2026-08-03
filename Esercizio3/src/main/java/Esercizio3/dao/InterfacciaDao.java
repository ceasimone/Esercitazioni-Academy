package Esercizio3.dao;

import java.util.List;

public interface InterfacciaDao<T,E> {
	
	public void aggiungi(List<T> tipo);
	
	public T cerca(E id);
	
	public List<T> cercaTutti();
	
	public void modifica(E id, String nome);
	
	public void cancella(E id);
	
	public void caancellaTutti();
	
	
}
