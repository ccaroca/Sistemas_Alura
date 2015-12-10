package br.com.caelum.loja_virtual.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

	private Connection connection;

	public ProdutosDAO(Connection conexao) {
		this.connection = conexao;
	}

	public void salva(Produto produto) throws SQLException {

		String sql = "insert into Produto (nome, descricao) values(?, ?)";

		try (PreparedStatement preparedStatement = connection.prepareStatement(
				sql, Statement.RETURN_GENERATED_KEYS)) {

			preparedStatement.setString(1, produto.getNome());
			preparedStatement.setString(2, produto.getDescricao());
			preparedStatement.execute();

			try (ResultSet rs = preparedStatement.getGeneratedKeys()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					produto.setId(id);
				}
			}

			connection.commit();
			System.out.println("A mesa foi inserida com sucesso: " + produto);

		} catch (Exception ex) {
			ex.printStackTrace();
			connection.rollback();
			System.out.println("Rollback efetuado");
		}

	}

	public void listaProdutos() throws SQLException {
		String sql = "SELECT * FROM Produto";

		try (PreparedStatement preparedStatement = connection
				.prepareStatement(sql)) {

			preparedStatement.execute();

			try (ResultSet rs = preparedStatement.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String n = rs.getString("nome");
					String d = rs.getString("descricao");
					System.out.println(id + ", " + n + ": " + d);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	public void deletaIDMaior3() throws SQLException {

		String sql = "delete from Produto where id > 3";

		try (PreparedStatement preparedStatement = connection
				.prepareStatement(sql)) {
			preparedStatement.execute();
		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "select * from Produto";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String descricao = rs.getString("descricao");
					Produto produto = new Produto(nome, descricao);
					produto.setId(id);
					produtos.add(produto);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return produtos;
	}

}
