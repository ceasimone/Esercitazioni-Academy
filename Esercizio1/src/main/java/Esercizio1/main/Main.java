package Esercizio1.main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//aggiungiStudente(1, "Mario", "Sturniolo", 33, Date.valueOf(LocalDate.of(1998, 2, 28)), "Informatica", 2);
		//aggiungiStudente(2, "Luigi", "Bianchi", 25, Date.valueOf(LocalDate.of(1992, 7, 14)), "Farmacia", 7);
		//stampaStudente(1);
		stampaStudenti();
		//cancellaStudente(2);
		//stampaStudenti();
		aggiornaStudente(1,"Filippo");
		stampaStudenti();
	}
	
 static void aggiungiStudente(int matricola, String nome, String cognome, int eta, Date nascita, String nomeCorso, int esamiSostenuti) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			String query = "INSERT INTO studente (matricola,nome,cognome,eta,data_di_nascita,nome_del_corso,esami_sostenuti) VALUES ( ?,?,?,?,?,?,?);";
			
			stmt = conn.prepareStatement(query);
			
			stmt.setInt(1, matricola);
			stmt.setString(2, nome);
			stmt.setString(3, cognome);
			stmt.setInt(4, eta);
			stmt.setDate(5, nascita);
			stmt.setString(6, nomeCorso);
			stmt.setInt(7, esamiSostenuti);
			
			stmt.execute();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
	}
 
 static void stampaStudente(int matricola) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt =conn.createStatement();
			
			String query = "SELECT * FROM studente WHERE matricola = " + matricola + ";";
			
			
			rs= stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Matricola: " +rs.getInt(1)+ 
						"|| Nome: " +rs.getString(2)+ 
						"|| Cognome: " +rs.getString(3)+
						"|| Eta " +rs.getInt(4)+
						"|| Data di nascita: " +rs.getDate(5) +
						"|| Nome del corso: " +rs.getString(6) +
						"|| Esami svolti: "+ rs.getInt(7) );
			}
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
 }
 
 static void stampaStudenti() {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt =conn.createStatement();
			
			String query = "SELECT * FROM studente;";
			
			
			rs= stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Matricola: " +rs.getInt(1)+ 
						"|| Nome: " +rs.getString(2)+ 
						"|| Cognome: " +rs.getString(3)+
						"|| Eta " +rs.getInt(4)+
						"|| Data di nascita: " +rs.getDate(5) +
						"|| Nome del corso: " +rs.getString(6) +
						"|| Esami svolti: "+ rs.getInt(7) );
			}
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
}
 
 static void cancellaStudente( int matricola) {
		
		Connection conn = null;
		Statement stmt = null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt =conn.createStatement();
			
			String query = "DELETE FROM studente WHERE matricola = " + matricola + " ;";
			
			stmt.execute(query);			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
}
 
 static void cancellaStudenti() {
		
		Connection conn = null;
		Statement stmt = null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt =conn.createStatement();
			
			String query = "DELETE FROM studente;";
			
			stmt.execute(query);			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
}
 
 static void aggiornaStudente(int matricola, String nome) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs =null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/db_studenti";
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
					
			String query = "UPDATE studente SET nome=? WHERE matricola=?;";
					
			stmt = conn.prepareStatement(query);
					
			stmt.setString(1, nome);
			stmt.setInt(2, matricola);
			stmt.execute();
				
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problema classe non trovata");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Problema eccezione specifica SQL");
		}catch(Exception e) {
			System.out.println("Problema eccezione generica");
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
					stmt= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura dello statemant");
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
					conn= null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi durante la chiusura della connessione");
				}
			}
		}
	}

}
 
