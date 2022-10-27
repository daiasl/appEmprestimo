package br.edu.infnet.emprestimo.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

	public static Connection obterConexao() throws Exception {
		
		String url="jdbc:mysql://localhost:8080/aula01?createDatabaseIfNotExist=true";
		String user="root";
		String password="";	
		
		return DriverManager.getConnection(url, user, password);
		
	}

}
