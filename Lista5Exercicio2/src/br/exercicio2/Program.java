package br.exercicio2;

public class Program {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(1, 5, 2);
		Triangulo t2 = new Triangulo(4, 6, 5);
		
		imprimirSeHaLadosIguais(t1, t2);
		imprimirTrianguloMaiorPerimetro(t1, t2);
	}
	
	public static void imprimirSeHaLadosIguais(Triangulo t1, Triangulo t2) {
		boolean possuiAlgumLadoIgual = t1.possuiAlgumLadoIgual(t2);
		
		if(possuiAlgumLadoIgual)
			System.out.println("--- Há um ou mais lados iguais entre os triângulos! ---" );
		else
			System.out.println("--- Não há um ou mais lados iguais entre os triângulos! ---" );
	}
	
	public static void imprimirTrianguloMaiorPerimetro(Triangulo t1, Triangulo t2) {
		Triangulo trianguloMaiorPerimetro = t1.obterTrianguloMaiorPerimetro(t2);
		
		String lados = trianguloMaiorPerimetro.obterLados();
		
		System.out.println("--- " + lados + " ---");
	}
}