package Esercitazione_29_07.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.MutationQuery;

import Esercitazione_29_07.configuration.HibernateUtil;
import Esercitazione_29_07.entity.Automobile;

public class AutomobileDaoImpl implements InterfacciaDao<Automobile>{
	@Override
	public void insert(Automobile automobile) {
		Transaction transaction = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.merge(automobile);
			
			transaction.commit();		
			session.close();
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			transaction.rollback();
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
		
	}

	@Override
	public void insertAll(List<Automobile> automobili) {
		Transaction transaction = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			for(Automobile a: automobili) {
				session.merge(a);
			}
			
			transaction.commit();		
			session.close();
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			transaction.rollback();
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
		
	}

	@Override
	public List<Automobile> findAll() {
		List<Automobile> listaAutomobili = new ArrayList<>();
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();	
			
			listaAutomobili = session.createQuery("from Automobile", Automobile.class).list();
			
			session.close();
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			
		}
		
		return listaAutomobili;
		
	}

	@Override
	public Automobile findOne(Integer id) {
		Automobile automobile=null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			automobile= session.get(Automobile.class, id);
			
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			
		}
		
		return automobile;
	}

	@Override
	public void modify(Integer id, String modello) {
		Transaction transaction = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			MutationQuery query = session.createMutationQuery("update Automobile set modello = :modello where id =:id");
			
			query.setParameter("modello", modello);
			query.setParameter("id", id);
			query.executeUpdate();
			transaction.commit();
			session.close();
			
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			transaction.rollback();
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
		
		
	}

	@Override
	public void delete(Integer id) {
		Transaction transaction = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Automobile automobile =session.get(Automobile.class, id);
			
			if(automobile !=null) {
				automobile.setProprietario(null);
				session.merge(automobile);
				session.remove(automobile);
			}
			transaction.commit();
			session.close();
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			System.out.println("Eccezione per la chiave primaria");
			transaction.rollback();
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
		
	}
}
