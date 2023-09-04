package br.exercicio3;

public class Televisao {

	private StatusTelevisao status;
	
	public void Ligar() {
		if(this.status != StatusTelevisao.Quebrada)
			this.status = StatusTelevisao.Ligada;
		else
			ImprimirStatus();
	}
	
	public void Desligar() {
		if(this.status != StatusTelevisao.Quebrada)
			this.status = StatusTelevisao.Desligada;
		else
			ImprimirStatus();
	}
	
	public void Quebrar() {
		this.status = StatusTelevisao.Quebrada;
	}
	
	public void ImprimirStatus() {
		switch (this.status) {
			case Ligada: {
				System.out.println("--- A televisão está ligada! ---");
				break;
			}
			case Desligada: {
				System.out.println("--- A televisão está desligada! ---");
				break;
			}
			default: {
				System.out.println("--- A televisão está quebrada! ---");
				break;
			}
		}
	}
}