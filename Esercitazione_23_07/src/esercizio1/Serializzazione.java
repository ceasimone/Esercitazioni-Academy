package esercizio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public abstract class Serializzazione {
	
	
	public static void serializza(Libro l) {
		
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			
			file = new FileOutputStream("Libro.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(l);
			System.out.println("Scrittura del file");
			
		}catch(IOException e) {
			System.out.println("Problemi di tipo Input/Output Exception");
			e.printStackTrace();
		}finally {
			try {
				out.close();
				file.close();
			}catch(IOException e) {
				System.out.println("Problemi di tipo Input/Output Exception");
				e.printStackTrace();
			}
		}
		
	}
	
	public static void serializza(Libro l1,Libro l2) {
		
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		try {
			
			file = new FileOutputStream("Libro.ser");
			out = new ObjectOutputStream(file);
			
			out.writeObject(l1);
			out.writeObject(l2);
			System.out.println("Scrittura del file");
			
		}catch(IOException e) {
			System.out.println("Problemi di tipo Input/Output Exception");
			e.printStackTrace();
		}finally {
			try {
				out.close();
				file.close();
			}catch(IOException e) {
				System.out.println("Problemi di tipo Input/Output Exception");
				e.printStackTrace();
			}
		}
		
	}

}
