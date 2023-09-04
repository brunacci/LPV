package br.exercicio2;

public class Lampada {

	private boolean status;
	
	public void acender() {
		this.status = true;
	}
	
	public void apagar() {
		this.status = false;
	}
	
	public void imprimirStatus() {
		if(this.status)
			System.out.println("--- Status: acesa ---");
		else
			System.out.println("--- Status: apagada ---");
	}
}