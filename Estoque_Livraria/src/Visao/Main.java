package Visao;

import java.util.Scanner;

import Controle.LivroDAO;
import Modelo.Livro;

public class Main {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);

		LivroDAO estoque = new LivroDAO();

		while (opcaoSelecionada != 0) {

			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR LIVRO");
			System.out.println("2 BUSCAR LIVRO");
			System.out.println("3 EFETUAR COMPRAR");
			System.out.println("4 Listar");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				System.out.println("Encerrado");
				break;
			}
			case 1: {
				Livro a = new Livro();
				System.out.println("Informe o título: ");
				a.setTitulo(leitura.nextLine());
				System.out.println("Informe o autor: ");
				a.setAutor(leitura.nextLine());
				System.out.println("Informe o gênero literário: ");
				a.setGenero(leitura.nextLine());
				System.out.println("Informe o preço: ");
				a.setPreco(Double.valueOf(leitura.nextLine()));

				estoque.Inserir(a);
				break;

			}
			case 2: {
				break; 
			}
			case 3: {
				/*
				 * Realiza a função de compra atraves do arraylist Caso a compra seja efetuada
				 * retira o livro do estoque
				 * 
				 */
				break;
			}     
			case 4: {
				estoque.listar();
				break;
			}

			}

		}

		leitura.close();
	}

}
