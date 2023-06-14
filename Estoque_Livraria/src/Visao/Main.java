package Visao;

import java.util.Scanner;

import Controle.LivroDAO;
import Modelo.Livro;

public class Main {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		LivroDAO estoque = LivroDAO.getInstancia();

		while (opcaoSelecionada != 0) {// Exibição e controle do menu

			System.out.println("- MENU -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR LIVRO");
			System.out.println("2 BUSCAR LIVRO");
			System.out.println("3 EFETUAR COMPRAR");
			System.out.println("4 Listar");
			System.out.println("5 Alterar");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {

			case 0: {// Encerrar o programa
				System.out.println("\nEncerrado");
				break;
			}
			case 1: {// cadastrar livro

				Livro a = new Livro();
				System.out.println("Informe o título: ");
				a.setTitulo(leitura.nextLine());
				System.out.println("Informe o autor: ");
				a.setAutor(leitura.nextLine());
				System.out.println("Informe o gênero literário: ");
				a.setGenero(leitura.nextLine());
				System.out.println("Informe o preço: ");
				a.setPreco(Double.valueOf(leitura.nextLine()));
				System.out.println("Informe o ISBN do livro: ");
				a.setIsbn(Long.valueOf(leitura.nextLine()));

				Boolean Foi = estoque.Inserir(a);
				if (Foi == true) {
					System.out.println("Tudo certo, livro cadastrado!");
				} else {
					System.out.println("Deu errado, faz de novo aí!");
				}
				break;

			}
			case 2: {// Buscar livro
				System.out.println("\nInsira o Isbn do livro desejado: ");
				estoque.Buscar(Long.valueOf(leitura.nextLine()));

				break;
			}
			case 3: {// Efetuar compra
				System.out.println("\nInsira o título do livro desejado: ");
				boolean achou = estoque.Compra(leitura.nextLine());
				if (achou == true) {
					System.out.println("Compra efetuada!\n");
				} else if (achou == false) {
					System.out.println("Compra não efetuada!\n");
				}
				break;
			}
			case 4: {// Listar livro
				estoque.listar();
				break;
			}
			case 5:
				System.out.println("Insira o Isbn original do livro que deseja alterar:");
				Long N = Long.valueOf(leitura.nextLine());

				Livro livroAlterar = estoque.Buscar(N);

				System.out.println("Insira o título para o qual deseja mudar:");
				String A = leitura.nextLine();
				livroAlterar.setTitulo(A);

				System.out.println("Insira o autor para o qual deseja mudar:");
				String B = leitura.nextLine();
				livroAlterar.setAutor(B);

				System.out.println("Insira o genero para o qual deseja mudar:");
				String C = leitura.nextLine();
				livroAlterar.setGenero(C);

				System.out.println("Insira o preco para o qual deseja mudar:");
				Double D = Double.valueOf(leitura.nextLine());
				livroAlterar.setPreco(D);

				System.out.println("Inira o Isbn para o qual deseja alterar:");
				Long E = Long.valueOf(leitura.nextLine());
				livroAlterar.setIsbn(E);

				estoque.Alterar(livroAlterar);

				break;

			}

		}

		leitura.close();
	}

}
