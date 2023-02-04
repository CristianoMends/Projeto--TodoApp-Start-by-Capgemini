package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	public static final String USERNAME = "root";
	public static final String PASSWORD = "cristiano@1234";
	public static final String IP = "localhost";
	public static final String PORT = "3306";
	public static final String DATABASE = "todoapp";
	
	public static final String URL = "jdbc:mysql://"+IP+":"+PORT+"/"+DATABASE+"";
	public static Connection connection;
	
	public ConnectionFactory() {
	
	}
	public static Connection getConnection(){
		try {
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar banco de dados!");
			e.printStackTrace();
		}
		return connection;
		
		
	}
	public static void CloseConnection() {
		try {
			if(connection != null) {
			connection.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao fechar banco de dados!");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
