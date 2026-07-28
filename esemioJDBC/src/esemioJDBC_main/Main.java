package esemioJDBC_main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		//JBDC Java Database Connectivity
		//aggiungiDipendente(1,"Mario", "Rossi", 2000);
		//aggiungiDipendenteByPreparedStatement(2,"Luigi","Bianchi",3500);
		aggiornaDipendente(1,"Filippo","Bianchi",300);
		
	}
	
	public static void aggiungiDipendente(int id, String nome, String cognome, double stipendio) {
		
		Connection conn = null;
		Statement stmt = null;
		
		String password = "root";
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/esempiojdbc";
		
		try {
			//caricamento del driver relativo a mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt = conn.createStatement();
			
			String query = "INSERT INTO dip (id,nome,cognome,stipendio) VALUES ( " + id +", '"+ nome + "' , '" +cognome+ "', " + stipendio + ");";
			
			stmt.executeUpdate(query);
			
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
		
		
		public static void aggiungiDipendenteByPreparedStatement(int id, String nome, String cognome, double stipendio) {
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			String password = "root";
			String username = "root";
			String url = "jdbc:mysql://localhost:3306/esempiojdbc";
			
			try {
				//caricamento del driver relativo a mysql
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,username,password);
				
				String query = "INSERT INTO dip (id,nome,cognome,stipendio) VALUES (?,?,?,?);";
				
				stmt = conn.prepareStatement(query);
				
				stmt.setInt(1, id);
				stmt.setString(2, nome);
				stmt.setString(3, cognome);
				stmt.setDouble(4, stipendio);
				
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
		
		public static void aggiornaDipendente(int id, String nome, String cognome, double stipendio) {
			Connection conn = null;
			PreparedStatement stmt = null;
			
			String password = "root";
			String username = "root";
			String url = "jdbc:mysql://localhost:3306/esempiojdbc";
			
			try {
				//caricamento del driver relativo a mysql
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,username,password);
				
				String query = "UPDATE dip SET nome=? , cognome =? , stipendio =? WHERE id=?;";
				
				stmt = conn.prepareStatement(query);
				
				
				stmt.setString(1, nome);
				stmt.setString(2, cognome);
				stmt.setDouble(3, stipendio);
				stmt.setInt(4, id);
				
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
