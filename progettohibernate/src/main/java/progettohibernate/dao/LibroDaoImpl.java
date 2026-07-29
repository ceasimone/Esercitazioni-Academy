package progettohibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import progettohibernate.configuration.HibernateUtil;
import progettohibernate.entity.Libro;

public class LibroDaoImpl implements InterfacciaDao <Libro>{

	@Override
	public void insertMany(List<Libro> listaLibri) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			for (Libro l: listaLibri) {
				session.merge(l);
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
	public List<Libro> findAll() {
		List<Libro> listaLibri = new ArrayList<>();
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			listaLibri = session.createQuery("from Libro", Libro.class).list();
			
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
		
		return listaLibri;
	}

	@Override
	public Libro findOne(Integer id) {
		Libro libro = new Libro();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Query<Libro> query = session.createQuery("from Libro where id = :id", Libro.class);
			
			query.setParameter("id", id);
			
			libro = query.getSingleResult();
			
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
		
		return libro;
	}

	@Override
	public void modify(Integer id, String titolo) {
		Transaction transaction = null;
		try {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			/*Query<Libro> query = session.createQuery("update Libro set titolo = :titolo where id = :id", Libro.class);
			query.setParameter("titolo", titolo);
			query.setParameter("id", id);
			
			query.executeUpdate();*/
			
			
			NativeQuery<Libro> querySQL = session.createNativeQuery("UPDATE libro SET titolo = :titolo WHERE id = :id", Libro.class);
			querySQL.setParameter("titolo", titolo);
			querySQL.setParameter("id", id);
			
			querySQL.executeUpdate();
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
			Libro libro = session.get(Libro.class, id);
			
			if(libro != null) {
				
				libro.setAutore(null);
				session.merge(libro);
				session.remove(libro);
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
