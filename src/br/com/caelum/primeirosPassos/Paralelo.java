package br.com.caelum.primeirosPassos;

public class Paralelo implements Runnable{
	private int id;           

    public void setId(int id) { 
        this.id = id; 
    } 

    public int getId(){ return this.id;}

    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }
}
