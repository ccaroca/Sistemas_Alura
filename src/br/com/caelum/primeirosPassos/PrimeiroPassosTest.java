package br.com.caelum.primeirosPassos;


import org.junit.Assert;
import org.junit.Test;


public class PrimeiroPassosTest {
	
	@Test
	public void fatorial_0(){
		Assert.assertEquals(1, new PrimeirosPassosJava().fatorial(0));
		
	}
	
	@Test
	public void fatorial_1(){
		Assert.assertEquals(1, new PrimeirosPassosJava().fatorial(1));
	}
	
	@Test
	public void fatorial_n(){
		Assert.assertEquals(720, new PrimeirosPassosJava().fatorial(6));
	}
	
	@Test
	public void fatorial_0a10(){
		for(int i=0;i<11;i++)
			System.out.println("Fatorial de " + i + "!= "+ new PrimeirosPassosJava().fatorial(i));
		
	}
	
	@Test
	public void conjecturaCollatTest(){
		new PrimeirosPassosJava().conjecturaCollatz(13);
		System.out.println();
		new PrimeirosPassosJava().conjecturaCollatz(14578);
		
	}

}
