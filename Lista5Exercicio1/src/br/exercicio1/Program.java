package br.exercicio1;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		Data data = new Data(3, 9, 2023);
		
		obterDia(data);
		obterMes(data);
		obterAno(data);
		
		data.imprimirData();
	}
	
	public static int obterNumero(String mensagem) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		
		return numero;
	}
	
	public static void obterDia(Data data) {
		boolean exito = false;
		
		do {
			int dia = obterNumero("Informe o dia:");
			
			exito = data.setDia(dia);
		} while(!exito);
	}
	
	public static void obterMes(Data data) {
		boolean exito = false;
		
		do {
			int mes = obterNumero("Informe o mês:");
			
			exito = data.setMes(mes);
		} while(!exito);
	}
	
	public static void obterAno(Data data) {
		boolean exito = false;
		
		do {
			int ano = obterNumero("Informe o ano:");
			
			exito = data.setAno(ano);
		} while(!exito);
	}
}
