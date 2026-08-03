package Esercizio2.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import Esercizio2.configuration.Util;
import Esercizio2.entity.RichiestaFerie;

public class RichiestaFerieDao implements InterfacciaDao<RichiestaFerie>{

	@Override
	public void inserisci(List<RichiestaFerie> listaRichieste) {
		Transaction transaction = null;

		
	try (Session session = Util.getSessionFactory().openSession()) {

		transaction = session.beginTransaction();

		for (RichiestaFerie a : listaRichieste) {
			session.merge(a);
		}

		transaction.commit();

	} catch (ConstraintViolationException e) {
		e.printStackTrace();
		System.out.println("Eccezione per chiave primaria duplicata");
		transaction.rollback(); //ritorna alla situazione precedente

	} catch (HibernateException e) {
		e.printStackTrace();
		System.out.println("Eccezione specifica di Hibernate");
		transaction.rollback();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Eccezione generica");
		transaction.rollback();
	}

	}

	@Override
	public RichiestaFerie cerca(Integer id) {
		RichiestaFerie rf = new RichiestaFerie();
		try(Session session = Util.getSessionFactory().openSession()){
				Query<RichiestaFerie> query = session.createQuery("from RichiestaFerie where id = :id", RichiestaFerie.class);
				query.setParameter("id", id);
				
				rf = query.getSingleResult();

		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Eccezione per chiave primaria duplicata");
			

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
		}
		return rf;
	}

	@Override
	public List<RichiestaFerie> cercaTutti() {
		List<RichiestaFerie> arrayrf = new ArrayList<>();
		try(Session session = Util.getSessionFactory().openSession()){
				
				arrayrf = session.createQuery("from RichiestaFerie", RichiestaFerie.class).list();

		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Eccezione per chiave primaria duplicata");
			

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
		}
		return arrayrf;
	}

	@Override
	public void modificaStato(Integer id, String stato) {
		Transaction transaction = null;
		
	try(Session session = Util.getSessionFactory().openSession()){
			
		transaction = session.beginTransaction();
		
		MutationQuery query = session.createMutationQuery("UPDATE RichiestaFerie set stato = :stato where id = :id");
		query.setParameter("stato", stato);
		query.setParameter("id", id);
		
		query.executeUpdate();
		
		transaction.commit();
	} catch (ConstraintViolationException e) {
		e.printStackTrace();
		System.out.println("Eccezione per chiave primaria duplicata");
		transaction.rollback(); //ritorna alla situazione precedente

	} catch (HibernateException e) {
		e.printStackTrace();
		System.out.println("Eccezione specifica di Hibernate");
		transaction.rollback();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Eccezione generica");
		transaction.rollback();
	}
		
	}

	@Override
	public void cancella(Integer id) {
		Transaction transaction = null;
		try(Session session = Util.getSessionFactory().openSession()){
				
			transaction = session.beginTransaction();
			
			RichiestaFerie rf = session.get(RichiestaFerie.class, id);
			session.remove(rf);
			transaction.commit();
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Eccezione per chiave primaria duplicata");
			transaction.rollback(); //ritorna alla situazione precedente

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
		
	}

	@Override
	public void cancellaTutti() {
		Transaction transaction = null;
		try(Session session = Util.getSessionFactory().openSession()){
				
			transaction = session.beginTransaction();
			
			MutationQuery query = session.createMutationQuery("DELETE RichiestaFerie");
			
			query.executeUpdate();
			
			transaction.commit();
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Eccezione per chiave primaria duplicata");
			transaction.rollback(); //ritorna alla situazione precedente

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
	}

}
