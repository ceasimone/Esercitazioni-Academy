package Esercizio3.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import Esercizio3.configuraation.HibernateUtil;
import Esercizio3.entity.Partecipante;

public class PartecipanteDao implements InterfacciaDao<Partecipante,Integer>{

	@Override
	public void aggiungi(List<Partecipante> listaPartecipanti) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			
			for (Partecipante p: listaPartecipanti) {
				session.merge(p);
			}
			
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
	public Partecipante cerca(Integer id) {
		Partecipante partecipante= new Partecipante();
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			Query<Partecipante> query = session.createQuery("from Partecipante where id = :id", Partecipante.class);
			
			query.setParameter("id", id);
			
			partecipante = query.getSingleResult();
			
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
		
		return partecipante;
	}

	@Override
	public List<Partecipante> cercaTutti() {
		List<Partecipante> lista = new ArrayList<>();
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			lista = session.createQuery("from Partecipante", Partecipante.class).list();
			
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
		return lista;
	}

	@Override
	public void modifica(Integer id, String nome) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			
			MutationQuery query = session.createMutationQuery("update Partecipante set nome = :nome where id = :id");
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
	public void cancella(Integer id) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			Partecipante partecipante = session.get(Partecipante.class, id);
			
			if(partecipante != null) {
				
				partecipante.setGioco(null);
				session.merge(partecipante);
				session.remove(partecipante);
			}
			
			
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
	public void caancellaTutti() {
		// TODO Auto-generated method stub
		
	}
	

}
