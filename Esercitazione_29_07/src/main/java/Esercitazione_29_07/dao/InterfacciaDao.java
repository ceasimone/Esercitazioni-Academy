package Esercitazione_29_07.dao;

import java.util.List;

public interface InterfacciaDao<T>{
	public void insert(T tipo);
	
	public void insertAll(List<T> tipo);
	
	public List<T> findAll();
	
	public T findOne(Integer id);
	
	public void modify(Integer id, String modifica);
	
	public void delete(Integer id);
}
