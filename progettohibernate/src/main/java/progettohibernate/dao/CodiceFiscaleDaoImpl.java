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
import progettohibernate.entity.Autore;
import progettohibernate.entity.CodiceFiscale;

public class CodiceFiscaleDaoImpl implements InterfacciaDao<CodiceFiscale> {

	@Override
	public void insertMany(List<CodiceFiscale> listaCF) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			for (CodiceFiscale cf: listaCF) {
				session.merge(cf);
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
	public List<CodiceFiscale> findAll() {
		List<CodiceFiscale> listaCF = new ArrayList<>();
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			listaCF = session.createQuery("from CodiceFiscale", CodiceFiscale.class).list();
			
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
		
		return listaCF;
	}

	@Override
	public CodiceFiscale findOne(Integer id) {
		CodiceFiscale cf = new CodiceFiscale();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Query<CodiceFiscale> query = session.createQuery("from CodiceFiscale where id = :id", CodiceFiscale.class);
			
			query.setParameter("id", id);
			
			cf = query.getSingleResult();
			
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
		
		return cf;
	}

	@Override
	public void modify(Integer id, String cf) {
		Transaction transaction = null;
		try {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			transaction = session.beginTransaction();
			
			/*Query<Libro> query = session.createQuery("update Libro set titolo = :titolo where id = :id", Libro.class);
			query.setParameter("titolo", titolo);
			query.setParameter("id", id);
			
			query.executeUpdate();*/
			
			
			NativeQuery<CodiceFiscale> querySQL = session.createNativeQuery("UPDATE codice_fiscale SET cf = :cf WHERE id = :id", CodiceFiscale.class);
			querySQL.setParameter("cf", cf);
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
			CodiceFiscale cf = session.get(CodiceFiscale.class, id);
			
			if(cf != null) {
				Query<Autore> query = session.createQuery("from Autore where cf = :cf", Autore.class);
				query.setParameter("cf", cf);
				
				//uniqueresult si aspetta un solo risultato, relazione 1 to 1
				Autore autore =query.uniqueResult();
				
				if(autore !=null) {
					autore.setCf(null);
					session.merge(autore);
				}
				
				session.remove(cf);
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
