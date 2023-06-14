package Controle;

import java.util.ArrayList;

import Modelo.Livro;

public class LivroDAO {

	private static ArrayList<Livro> Estoque;
	private static LivroDAO instancia;

	private LivroDAO() {
	}

	public static LivroDAO getInstancia() {

		if (instancia == null) {
			instancia = new LivroDAO();
			Estoque = new ArrayList<>();
		}

		return instancia;
	}

	public Boolean Inserir(Livro a) {// Adicionar um livro
		if (a != null) {
			Estoque.add(a);
			return true;
		} else {
			return false;
		}

	}

	public Livro Buscar(Long t) {
		for (int i = 0; i < Estoque.size(); i++) {// Percorre o estoque
			if (t.equals(Estoque.get(i).getIsbn())) {
				System.out.println("Titulo: " + Estoque.get(i).getTitulo());
				System.out.println("Autor:" + Estoque.get(i).getAutor());
				System.out.println("Genero:" + Estoque.get(i).getGenero());
				System.out.println("Preco:" + Estoque.get(i).getPreco());
				System.out.println("Isbn:"+ Estoque.get(i).getIsbn());
				return Estoque.get(i);
			}
		}
		return null;
	}

	public boolean Alterar(Livro livroComAlteracoes) {

		for (Livro livroBuscado : Estoque) {
			if (livroComAlteracoes.getIsbn() == livroBuscado.getIsbn()) {
				livroBuscado = livroComAlteracoes;
				return true;
			}
		}
		return false;
	}

	public Boolean Compra(Long p) {
		for (int i = 0; i < Estoque.size(); i++) {// Percorre o estoque
			if (p.equals(Estoque.get(i).getIsbn())) {// Acha o livro no estoque
				Estoque.remove(i);
				return true;
			}
		}
		return false;
	}

	public void listar() {// Mostra todos os livros do estoque
		for (int i = 0; i < Estoque.size(); i++) {
			System.out.println();
			System.out.println("Livro " + (i + 1));
			System.out.println("Titulo: " + Estoque.get(i).getTitulo());
			System.out.println("Autor:" + Estoque.get(i).getAutor());
			System.out.println("Genero:" + Estoque.get(i).getGenero());
			System.out.println("Preco:" + Estoque.get(i).getPreco());
			System.out.println("ISBN: "+ Estoque.get(i).getIsbn());
			System.out.println();
		}
	}

}
