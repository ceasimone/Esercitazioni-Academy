package esercizio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		aggiungiGatto(1,"Duff", 20, "Tigrato");
		aggiungiGatto(2,"Kila", 3, "Rosso");
		stampaGatti();
		cancellaGatto(1);
		aggiornaByName(2,"Kira");
		stampaGatti();
		cancellaAll();
		
	}
	
	public static void aggiungiGatto(int microchip, String nome, int eta, String colore_pelo) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/Gatti";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			String query = "INSERT INTO gatto (microchip,nome,eta,colore_pelo) VALUES (?,?,?,?);";
			
			stmt = conn.prepareStatement(query);
			
			stmt.setInt(1,microchip);
			stmt.setString(2, nome);
			stmt.setInt(3,eta);
			stmt.setString(4, colore_pelo);
			
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
					stmt=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura statemant");
				}
			}
			if(conn != null) {
				try {
					conn.close();
					conn=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura connection");
				}
			}
		}
	}
	
	public static void stampaGatti() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		String url = "jdbc:mysql://localhost:3306/Gatti";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			stmt = conn.createStatement();
			
			String query = "SELECT * FROM gatto;";
			
			rs = stmt.executeQuery(query);
			
			System.out.println("Lista dei gatti\n");
			while(rs.next()) {
				System.out.println("Microchip: " + rs.getInt(1) + "\nNome: " + rs.getString(2) + "\nEta': " + rs.getInt(3) + "\nColore pelo: " + rs.getString(4) +"\n");
			}
			System.out.println();
			
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
					stmt=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura statemant");
				}
			}
			if(conn != null) {
				try {
					conn.close();
					conn=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura connection");
				}
			}
		}
	}
	
	public static void cancellaGatto(int microchip) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/Gatti";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			String query = "DELETE FROM gatto WHERE microchip = " + microchip + ";";
			
			stmt = conn.prepareStatement(query);
			
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
					stmt=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura statemant");
				}
			}
			if(conn != null) {
				try {
					conn.close();
					conn=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura connection");
				}
			}
		}
	}
	
	public static void cancellaAll() {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/Gatti";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			String query = "DELETE FROM gatto;";
			
			stmt = conn.prepareStatement(query);
			
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
					stmt=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura statemant");
				}
			}
			if(conn != null) {
				try {
					conn.close();
					conn=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura connection");
				}
			}
		}
	}
	
	public static void aggiornaByName(int microchip, String nome) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/Gatti";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,username,password);
			
			String query = "UPDATE gatto SET nome=? WHERE microchip=?;";
			
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, nome);
			stmt.setInt(2,microchip);
			
			
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
					stmt=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura statemant");
				}
			}
			if(conn != null) {
				try {
					conn.close();
					conn=null;
				}catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Problemi chiusura connection");
				}
			}
		}
	}

}
