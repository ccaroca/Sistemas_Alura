package br.com.caelum;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.loja_virtual.ConnectionPool;
import br.com.caelum.loja_virtual.modelo.Produto;
import br.com.caelum.loja_virtual.modelo.ProdutosDAO;

public class Programa {

	public static void main(String[] args) throws IOException,
			InterruptedException, SQLException {

		Produto mesa = new Produto("Mesa 2 Azul", "Mesa com 8 pés");

		try (Connection conexao = new ConnectionPool().getConnection()) {
			conexao.setAutoCommit(false);
			ProdutosDAO dao = new ProdutosDAO(conexao);
			dao.salva(mesa);
			dao.listaProdutos();
			List<Produto> produtos = dao.lista();
            for (Produto produto : produtos) {
                System.out.println("Existe o produto: " + produto);
            }

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

}
