package Esercizio2.dao;

import java.util.List;

public interface InterfacciaDAO <T>{
	public void inserisciTutti(List<T> lista);


	public List<T> cercaTutti();


	public T cercaUno(Integer id);
}
