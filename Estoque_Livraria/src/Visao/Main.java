package Visao;

import java.util.Scanner;

import Controle.LivroDAO;
import Modelo.Livro;

public class Main {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		LivroDAO estoque = new LivroDAO();

		while (opcaoSelecionada != 0) {//Exibição e controle do menu

			System.out.println("- MENU -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR LIVRO");
			System.out.println("2 BUSCAR LIVRO");
			System.out.println("3 EFETUAR COMPRAR");
			System.out.println("4 Listar");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			
			case 0: {//Encerrar o programa
				System.out.println("\nEncerrado");
				break;
			}
			case 1: {//cadastrar livro
				
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
			case 2: {//Buscar livro
				System.out.println("\nInsira o título do livro desejado: ");
				boolean achou= estoque.Buscar(leitura.nextLine());
				if(achou==false)
				{
					System.out.println("\nLivro não encontrado\n");
				}
				break;
			}
			case 3: {//Efetuar compra
				System.out.println("\nInsira o título do livro desejado: ");
				estoque.Compra(leitura.nextLine());
				break;
			}
			case 4: {//Listar livro
				estoque.listar();
				break;
			}

			}

		}

		leitura.close();
	}

}
