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
import Esercizio3.entity.GiocoDaTavolo;
import Esercizio3.entity.Partecipante;

public class GiocoDaTavoloDao implements InterfacciaDao<GiocoDaTavolo,String>{

	@Override
	public void aggiungi(List<GiocoDaTavolo> listaGiochi) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			
			for (GiocoDaTavolo a: listaGiochi) {
				session.merge(a);
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
	public GiocoDaTavolo cerca(String nome) {
		
		GiocoDaTavolo gioco= new GiocoDaTavolo();
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			Query<GiocoDaTavolo> query = session.createQuery("from GiocoDaTavolo where nome = :nome", GiocoDaTavolo.class);
			
			query.setParameter("nome", nome);
			
			gioco = query.getSingleResult();
			
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
		
		return gioco;
	}

	@Override
	public List<GiocoDaTavolo> cercaTutti() {
		List<GiocoDaTavolo> lista = new ArrayList<>();
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			lista = session.createQuery("from GiocoDaTavolo", GiocoDaTavolo.class).list();
			
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
	public void modifica(String nome, String casaProduttrice) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			
			MutationQuery query = session.createMutationQuery("update GiocoDaTavolo set casaProduttrice = :casa where nome = :nome");
			query.setParameter("casa", casaProduttrice);
			query.setParameter("nome", nome);
			
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
	public void cancella(String nome) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			transaction = session.beginTransaction();
			GiocoDaTavolo gioco = session.get(GiocoDaTavolo.class, nome);
			
			if(gioco != null) {
				Query<Partecipante> query = session.createQuery("from Partecipante where gioco = :gioco", Partecipante.class);
				query.setParameter("gioco", gioco);
				
				List<Partecipante> listaPartecipanti = query.getResultList();
				
				for (Partecipante p: listaPartecipanti) {
					p.setGioco(null);
					session.merge(p);
				}
				
				session.remove(gioco);
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
