package br.com.caelum.primeirosPassos;

public class PrimeirosPassosJava {
	
	
	

	public int fatorial(int n){		
		return (n<=0) ? 1 : n*fatorial(n-1);
	}
	
	public void conjecturaCollatz(int n){		
		
		if (n==1)
			System.out.print(n);
		else if(n%2 == 0)
		{//� par
			System.out.print(n+">");
			n = n/2;
			conjecturaCollatz(n);
		}
		else {//� impar
			System.out.print(n+">");
			n = 3*n + 1;
			conjecturaCollatz(n);
		}
		
	}
		
		

	

}
