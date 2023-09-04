package br.exercicio2;

public class Program {

	public static void main(String[] args) {
		
		Lampada lampadaIncandescente = new Lampada();
		
		lampadaIncandescente.acender();
		lampadaIncandescente.imprimirStatus();
		
		lampadaIncandescente.apagar();
		lampadaIncandescente.imprimirStatus();
	}
}