package br.com.caelum.empresa;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.caelum.empresa.modelo.Gasto;

public class FiltradorDeGastosTest {

	@Test
	public void gastosAcimaLimite() {
		FiltradorDeGastosEspeciais filtro = new FiltradorDeGastosEspeciais(100);
		List<Gasto> gastos = new ArrayList<Gasto>();
		gastos.add(new Gasto(50, "Cart�o", null, null));
		gastos.add(new Gasto(100, "Cart�o", null, null));
		gastos.add(new Gasto(150, "Cart�o", null, null));		
		
		assertEquals(1, filtro.filtraGastosGrandes(gastos).size());
	}
	
	@Test
	public void gastosIgualLimite() {
		FiltradorDeGastosEspeciais filtro = new FiltradorDeGastosEspeciais(100);
		List<Gasto> gastos = new ArrayList<Gasto>();
		gastos.add(new Gasto(50, "Cart�o", null, null));
		gastos.add(new Gasto(100, "Cart�o", null, null));
		
		
		assertEquals(0, filtro.filtraGastosGrandes(gastos).size());
	}
	
	@Test
	public void gastosAbaixoLimite() {
		FiltradorDeGastosEspeciais filtro = new FiltradorDeGastosEspeciais(100);
		List<Gasto> gastos = new ArrayList<Gasto>();
		gastos.add(new Gasto(50, "Cart�o", null, null));
		gastos.add(new Gasto(100, "Cart�o", null, null));
		gastos.add(new Gasto(70, "Cart�o", null, null));
		gastos.add(new Gasto(90, "Cart�o", null, null));
		
		assertEquals(0, filtro.filtraGastosGrandes(gastos).size());
	}

}
