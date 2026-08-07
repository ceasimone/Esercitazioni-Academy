package Esercizio2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Esercizio2.configuration.HibernateUtil;
import Esercizio2.entity.Articolo;



public class ArticoloDAO implements InterfacciaDAO<Articolo>{



	@Override
	public void inserisciTutti(List<Articolo> lista) {


		Transaction transaction = null;


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			transaction = session.beginTransaction();


			for(Articolo a : lista){

				session.persist(a);

			}


			transaction.commit();


		}catch(Exception e){

			e.printStackTrace();

			if(transaction != null)
				transaction.rollback();

		}

	}





	@Override
	public List<Articolo> cercaTutti() {


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			return session.createQuery("from Articolo", Articolo.class)
					.getResultList();


		}

	}





	@Override
	public Articolo cercaUno(Integer id) {


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			return session.get(Articolo.class,id);


		}

	}


}
