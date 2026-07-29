package Esercitazione_29_07.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import Esercitazione_29_07.configuration.HibernateUtil;
import Esercitazione_29_07.entity.Automobile;
import Esercitazione_29_07.entity.Persona;

public class PersonaDaoImpl implements InterfacciaDao<Persona>{

	@Override
	public void insert(Persona persona) {
		Transaction transaction = null;
		
		try{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.merge(persona);
			
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
	public void insertAll(List<Persona> listaPersone) {
		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			for(Persona p: listaPersone) {
				session.merge(p);
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
	public List<Persona> findAll() {
		List<Persona> listaPersone = new ArrayList<>();
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
				
			listaPersone = session.createQuery("from Persona", Persona.class).list();
			
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
		
		return listaPersone;
		
	}

	@Override
	public Persona findOne(Integer id) {
		Persona persona=null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			persona= session.get(Persona.class, id);
			
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
		
		return persona;
	}

	@Override
	public void modify(Integer id, String nome) {
		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			MutationQuery query = session.createMutationQuery("update Persona set nome = :nome where id =:id");
			
			query.setParameter("nome", nome);
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
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Persona persona =session.get(Persona.class, id);
			
			if(persona !=null) {
				Query<Automobile> query = session.createQuery("from Automobile where proprietario = :proprietario",Automobile.class);
				query.setParameter("proprietario", persona);
				
				List<Automobile> listaAutomobili = query.getResultList();
				
				for(Automobile a : listaAutomobili) {
					a.setProprietario(null);
					session.merge(a);
				}
				
				session.remove(persona);
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
