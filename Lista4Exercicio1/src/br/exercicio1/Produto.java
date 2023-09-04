package br.exercicio1;

public class Produto {

	private String nome;
	private double valorUnitario;
	private int quantidadeEstoque;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	
	public void comprar(String fornecedor, int quantidade) {
		System.out.println("--- Fornecedor: " + fornecedor + " ---");
		this.quantidadeEstoque += quantidade;
	}
	
	public boolean vender(String cliente, int quantidade) {
		System.out.println("--- Cliente: " + cliente + " ---");
		
		if(this.quantidadeEstoque < quantidade)
			return false;
		
		this.quantidadeEstoque -= quantidade;
		
		return true;
	}
	
	public void imprimirQuantidadeEstoque() {
		System.out.println();
		System.out.println("--- Produto: " + this.nome + " ---");
		System.out.println("--- Quantidade em estoque: " + this.quantidadeEstoque + " ---");
		System.out.println();
	}
}