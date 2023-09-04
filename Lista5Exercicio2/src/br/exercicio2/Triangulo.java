package br.exercicio2;

public class Triangulo {

	private double a;
	private double b;
	private double c;
	
	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		validar();
	}
	
	public void modificarTriangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		validar();
	}
	
	public boolean validar() {
		return !(a > (b + c) || b > (a + c) || c > (a + b));
	}
	
	public boolean possuiAlgumLadoIgual(Triangulo outroTriangulo) {
		for (double lado : obterVetor()) {
			for (double outroLado : outroTriangulo.obterVetor()) {
				if(lado == outroLado)
					return true;
			}
		}
		
		return false;
	}
	
	public Triangulo obterTrianguloMaiorPerimetro(Triangulo outroTriangulo) {
		if(outroTriangulo.somarPerimetro() > somarPerimetro())
			return outroTriangulo;
		
		return this;
	}
	
	public String obterLados() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
	
	private double[] obterVetor() {
		double[] vetor = { a , b, c }; 
		return vetor;
	}
	
	private double somarPerimetro() {
		return a + b + c;
	}
}