package Controle;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Livro;

public class LivroDAO {
	
	private ArrayList<Livro> Estoque;
	Scanner leitura = new Scanner(System.in);

	public LivroDAO() {
		Estoque = new ArrayList<Livro>();
	}

	public Boolean Inserir(Livro a) {//Adicionar um livro
		Estoque.add(a);
		return true;
	}

	public Boolean Buscar(String t) {
		for (int i = 0; i < Estoque.size(); i++) {//Percorre o estoque
			String r = Estoque.get(i).getTitulo();
			if (r.equals(t)) {//Acha o livro no estouqe e mostra suas inforações
				System.out.println("Titulo: " + Estoque.get(i).getTitulo());
				System.out.println("Autor:" + Estoque.get(i).getAutor());
				System.out.println("Genero:" + Estoque.get(i).getGenero());
				System.out.println("Preco:" + Estoque.get(i).getPreco());
				return true;
			}
		}
		return false;
	}

	public Boolean Compra(String p) {
		for (int i = 0; i < Estoque.size(); i++) {//Percorre o estoque
			String r = Estoque.get(i).getTitulo();
			if (r.equals(p)) {//Acha o livro no estoque
				System.out.println("O preço do livro desejado é R$ " + Estoque.get(i).getPreco()
						+ "\nDeseja efetuar a compra?(1 para sim / 2 para não)");
				int E = leitura.nextInt();//Confirma a compra
				if (E == 1) {
					System.out.println("Compra efetuada com sucesso");
					Estoque.remove(i);
					return true;
				} else if (E == 2) {
					return false;
				}
			}
		}
		return false;
	}

	public void listar() {//Mostra todos os livros do estoque
		for (int i = 0; i < Estoque.size(); i++) {
			System.out.println();
			System.out.println("Livro " + (i + 1));
			System.out.println("Titulo: " + Estoque.get(i).getTitulo());
			System.out.println("Autor:" + Estoque.get(i).getAutor());
			System.out.println("Genero:" + Estoque.get(i).getGenero());
			System.out.println("Preco:" + Estoque.get(i).getPreco());
			System.out.println();
		}
	}

}
