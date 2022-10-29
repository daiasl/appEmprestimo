package br.edu.infnet.emprestimo.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JdbcUtil {

	private static Logger logger = LoggerFactory.getLogger(JdbcUtil.class);
	
	public static Connection obterConexao() {
		
		logger.info("Iniciando conexão com banco de dados.");
		String url="jdbc:mysql://localhost:3306/appemprestimo?createDatabaseIfNotExist=true";
		String user="root";
		String password="root123";	
		
		try {
			return DriverManager.getConnection(url, user, password);	
		} catch (Exception e) {
			logger.error("Erro ao conectar", e);
			throw new RuntimeException(e);
		}
		
	}

}
