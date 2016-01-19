package br.com.caelum.empresa.teste;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.caelum.empresa.modelo.Gasto;
import br.com.caelum.empresa.modelo.dao.GastoDAO;

public class TesteDAO {
	public static void main(String[] args) {

		GastoDAO dao = new GastoDAO();
		//private static final Logger logger = Logger.getLogger(GastoDAO.class);
		List<Gasto> gastos = dao.buscaTodos();
		for (Gasto gasto : gastos) {
			System.out.println(gasto);
			//logger.info("Valor do gasto:  " + gasto.getValor());

		}

	}
}
