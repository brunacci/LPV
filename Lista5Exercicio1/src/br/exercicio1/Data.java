package br.exercicio1;

import javax.swing.JOptionPane;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public boolean setDia(int dia) {
		if(dia < 1 || dia > 30) {
			JOptionPane.showMessageDialog(null, "Apenas números entre 1 e 30!");
			
			return false;
		}
		
		this.dia = dia;
		
		return true;
	}
	
	public boolean setMes(int mes) {
		if(mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Apenas números entre 1 e 12!");
			
			return false;
		}
		
		this.mes = mes;
		
		return true;
	}
	
	public boolean setAno(int ano) {
		if(ano < 1900) {
			JOptionPane.showMessageDialog(null, "Apenas número maior ou igual a 1900!");
			
			return false;
		}
		
		this.ano = ano;
		
		return true;
	}
	
	public void imprimirData() {
		JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
	}
}