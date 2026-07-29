package progettohibernate.dao;

import java.util.List;

//DAO Data Access Object
//rappresenta un design pattern architetturale per la gestione della persistenza

//serve a fornire lo scheletro di alcuni metodi CRUD usati dalle classi

//Permette di separare la logica di business dalla logica di accesso ai dati

public interface InterfacciaDao<T> {
	
	//accetta una lista di oggetti T e li inserisced come record, più righe salvate contemporanemanete
	public void insertMany(List<T> tipo);
	
	public List<T> findAll();
	
	public T findOne(Integer id);
	
	public void modify(Integer id, String modifica);
	
	public void delete(Integer id);
	
}
