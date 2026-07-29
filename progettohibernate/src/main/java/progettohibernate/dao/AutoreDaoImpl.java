package progettohibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import progettohibernate.configuration.HibernateUtil;
import progettohibernate.entity.Autore;
import progettohibernate.entity.Libro;

public class AutoreDaoImpl implements InterfacciaDao<Autore>{

	@Override
	public void insertMany(List<Autore> listaAutori) {
		
		Transaction transaction = null;
		try {
			//creare la sessione con il db tramite il metodo statico di Hibernateutil getSessionFactory()
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			for (Autore a: listaAutori) {
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
	public List<Autore> findAll() {
		List<Autore> listaAutori = new ArrayList<>();
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			listaAutori = session.createQuery("from Autore", Autore.class).list();
			
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
		
		return listaAutori;
	}

	@Override
	public Autore findOne(Integer id) {
		Autore autore = new Autore();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Query<Autore> query = session.createQuery("from Autore where id = :id", Autore.class);
			
			query.setParameter("id", id);
			
			autore = query.getSingleResult();
			
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
		
		return autore;
	}

	@Override
	public void modify(Integer id, String nome) {
		Transaction transaction = null;
		try {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			Query<Autore> query = session.createQuery("update Autore set nome = :nome where id = :id", Autore.class);
			query.setParameter("nome", nome);
			query.setParameter("id", id);
			
			query.executeUpdate();
			
			transaction.commit();
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
		
		try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); Session session = sessionFactory.openSession()){
			
			transaction = session.beginTransaction();
			Autore autore = session.get(Autore.class, id);
			
			if(autore != null) {
				Query<Libro> query = session.createQuery("from Libro where autore = :autore", Libro.class);
				query.setParameter("autore", autore);
				
				List<Libro> listaLibri = query.getResultList();
				
				for (Libro l: listaLibri) {
					l.setAutore(null);
					session.merge(l);
				}
				
				autore.setCf(null);
				session.merge(autore);
				
				session.remove(autore);
			}
			
			transaction.commit();
			
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
		
	}

}
