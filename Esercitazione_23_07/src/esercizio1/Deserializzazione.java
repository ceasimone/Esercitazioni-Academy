package esercizio1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class Deserializzazione {
	
	public static void deserializza() {
		
		FileInputStream file = null;
		ObjectInputStream in = null;
		
		try {
			file = new FileInputStream("Libro.ser");
			in = new ObjectInputStream(file);
			
			while(true) {
				Object obj = in.readObject();
			
				System.out.println("Lettura del file");
			
			
				if(obj instanceof Libro) {
					Libro i= (Libro) obj;
					System.out.println(i);
			
				}
			}
			
		} catch(EOFException e) {
			System.out.println("Fine del file");
		}catch(IOException e) {
		
			System.out.println("Problemi di tipo Input/Output Exception");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				file.close();
			}catch(IOException e) {
				System.out.println("Problemi di tipo Input/Output Exception");
				e.printStackTrace();
			}
		}
	}
	
}
