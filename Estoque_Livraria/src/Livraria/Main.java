package Livraria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		     
		       
		LivroControlador estoque = new LivroControlador();

		while (opcaoSelecionada != 0) {

			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR LIVRO");
			System.out.println("2 BUSCAR LIVRO");
			System.out.println("3 EFETUAR COMPRAR");
	
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				System.out.println("Encerrado");
				break;
			}
			case 1: {
				Livro a=new Livro();
				System.out.println("Informe o título: ");
				
				a.titulo=leitura.nextLine();
				System.out.println("Informe o autor: ");
				a.autor=leitura.nextLine();
				System.out.println("Informe o gênero literário: ");
				a.genero=leitura.nextLine();
				System.out.println("Informe o preço: ");
				a.preco= Double.valueOf(leitura.nextLine());	
				estoque.cadastrar(a);
				
			}
			case 2: {
			 /*
			  * Realiza a função de busca atraves do arraylist
			  * Sendo os criterios  de busca autor, genero, titulo
			  * Retorna os atributos do objeto livro 
			  * 
			  */
				
			}
			case 3: {
				/*
				 * Realiza a função de compra atraves do arraylist
				 * Caso a compra seja efetuada retira o livro do estoque
				 * 
				 */
				
			
			}

			}

		}

		leitura.close();
	}

}
