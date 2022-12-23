package br.com.caetasouas;

public class TestaAlgoritimos {
	public static void main(String[] args) {
		Produto produtos[] = {
		new Produto("Lamborghini", 1000000),
		new Produto("Jipe", 46000),
		new Produto("Brasilia", 16000),
		new Produto("Smart", 46000),
		new Produto("Fusca", 17000)
		};
		
		selectionSort(produtos, produtos.length);
		//insertionSort(produtos, produtos.length);
		
		for(Produto produto : produtos) {
			System.out.println("O carro " + produto.getNome() + " custa " + produto.getPreco());
		}
	}
	
	private static void insertionSort(Produto[] produtos, int quantidadeDeEelementos) {
		for(int atual = 1; atual < quantidadeDeEelementos; atual++) {
			int analise = atual;
			while(analise > 0 && produtos[analise].getPreco() < produtos[analise -1].getPreco()) {
				troca(produtos, analise, analise -1);
				
				analise--;
			}
		}
	}
	
	private static void troca(Produto[] produtos, int primeiro, int segundo) {
		Produto primeiroProduto = produtos[primeiro];
		Produto segundoProduto = produtos[segundo];
		// faz a troca de lugares
		produtos[primeiro] = segundoProduto;
		produtos[segundo] = primeiroProduto;
	}
	
	private static void selectionSort(Produto[] produtos, int quantidadeDeEelementos) {
		for(int atual = 0; atual < quantidadeDeEelementos -1; atual++) {
			int menor = buscaMenor(produtos, atual, quantidadeDeEelementos - 1);
			troca(produtos, atual, menor);
		}
	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for(int atual = inicio; atual <= termino; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
					}
		}
		return maisBarato;
	}
}
