package br.com.caelum.empresa;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;
import br.com.caelum.empresa.modelo.Gerente;

public class ImportadorDeGastos {
	private Scanner leitor;
	SimpleDateFormat formatoDaData = new SimpleDateFormat("ddMMyyyy");

	public Collection<Gasto> importa(InputStream entrada) throws ParseException {

		leitor = new Scanner(entrada);
		Collection<Gasto> gastos = new LinkedHashSet<Gasto>();

		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipoGasto = line.substring(0, 6);
			String dataGasto = line.substring(6, 14);
			String valorGasto = line.substring(14, 23);
			String mat = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascTxt = line.substring(56);

			double valor = Double.parseDouble(valorGasto);
			int matricula = Integer.parseInt(mat);

			Calendar dataNascimento = converteDataTxtParaCalendar(dataNascTxt);

			Calendar dataDespesa = converteDataTxtParaCalendar(dataGasto);

			Funcionario funcionario = new Gerente(nome, matricula,
					dataNascimento);

			gastos.add(new Gasto(valor, tipoGasto, funcionario, dataDespesa));
		}
		return gastos;
	}

	private Calendar converteDataTxtParaCalendar(String dataNascTxt)
			throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(formatoDaData.parse(dataNascTxt));
		return dataNascimento;
	}
}
