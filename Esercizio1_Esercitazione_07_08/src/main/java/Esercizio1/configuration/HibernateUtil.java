package Esercizio1.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import Esercizio1.entity.Film;
import Esercizio1.entity.Premio;

public class HibernateUtil {
	
private static SessionFactory sessionFactory;
		
	
	public static SessionFactory getSessionFactory() {
			
			if(sessionFactory == null) {
				
				Configuration config = new Configuration();
				
				Properties settings = new Properties();
				
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/db_film");
				
				settings.put(Environment.USER, "root");
				
				settings.put(Environment.PASS, "root");
				
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				
				settings.put(Environment.SHOW_SQL, "true");
				
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				config.addAnnotatedClass(Film.class);
				config.addAnnotatedClass(Premio.class);

				config.setProperties(settings);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
				
				sessionFactory = config.buildSessionFactory(serviceRegistry);
				
			}
			
			return sessionFactory;
			
		}
}
