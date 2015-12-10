package br.com.caelum.loja_virtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

	
	
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return connection;
	}

	public static void adiciona(String nome, String descricao,
			PreparedStatement statement) throws SQLException {
		
//		if (nome.equals("Blueray")) {
//            throw new IllegalArgumentException("Problema ocorrido");
//        }
		
		statement.setString(1, nome);
		statement.setString(2, descricao);

		statement.execute();
		
		ResultSet resultSet = statement.getGeneratedKeys();
		while (resultSet.next()) {
			String id = resultSet.getString("id");
			System.out.println(id + " gerado");
		}
		resultSet.close();
	}

}
