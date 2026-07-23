package esercizio13;

import java.util.Scanner;

public class TestRegistrazione {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        try {

	            System.out.print("Inserisci username: ");
	            String username = input.nextLine();

	            System.out.print("Inserisci password: ");
	            String password = input.nextLine();

	            if (username.contains(" ") || password.contains(" ")) {
	                throw new EmptyInputException("Username e password non possono contenere spazi.");
	            }

	            System.out.println("Registrazione effettuata!");

	        } catch (EmptyInputException e) {

	            System.out.println(e.getMessage());

	        } finally {

	            input.close();

	        }


	}

}
