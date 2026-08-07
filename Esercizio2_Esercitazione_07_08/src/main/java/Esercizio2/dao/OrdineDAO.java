package Esercizio2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Esercizio2.configuration.HibernateUtil;
import Esercizio2.entity.Ordine;



public class OrdineDAO implements InterfacciaDAO<Ordine>{



	@Override
	public void inserisciTutti(List<Ordine> lista) {


		Transaction transaction = null;


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			transaction = session.beginTransaction();


			for(Ordine o : lista){

				session.persist(o);

			}


			transaction.commit();


		}catch(Exception e){

			e.printStackTrace();

			if(transaction != null)
				transaction.rollback();

		}

	}




	@Override
	public List<Ordine> cercaTutti() {


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			return session.createQuery("from Ordine", Ordine.class)
					.getResultList();


		}

	}




	@Override
	public Ordine cercaUno(Integer id) {


		try(Session session = HibernateUtil.getSessionFactory().openSession()){


			return session.get(Ordine.class,id);


		}

	}


}
