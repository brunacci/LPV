package br.exercicio1;

public class Program {

	public static void main(String[] args) {
		Produto antenaParabolica = criarProduto("Antena Parabólica", 150.0);
		Produto videoCassete = criarProduto("Vídeo Cassete", 230.0);
		
		comprarProduto(antenaParabolica, "Zé da Esquina", 15);
		comprarProduto(videoCassete, "Tonin da Mercearia", 22);
		
		venderProduto(antenaParabolica, "Tonico", 3);
		venderProduto(videoCassete, "Tinoco", 6);
	}
	
	public static Produto criarProduto(
		String nome,
		double valorUnitario) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setValorUnitario(valorUnitario);
		
		return produto;
	}
	
	public static void comprarProduto(Produto produto, String fornecedor, int quantidade) {
		System.out.println("--- Compra ---");
		produto.comprar(fornecedor, quantidade);
		produto.imprimirQuantidadeEstoque();
	}
	
	public static void venderProduto(Produto produto, String cliente, int quantidade) {
		System.out.println("--- Venda ---");
		
		if(! produto.vender(cliente, quantidade)) {
			System.out.println("--- Quantidade insuficiente do produto! ---");
		}
		
		produto.imprimirQuantidadeEstoque();
	}
}