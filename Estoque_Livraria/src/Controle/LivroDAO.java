package Controle;

import java.util.ArrayList;

import Modelo.Livro;

public class LivroDAO {
	private ArrayList<Livro> Estoque;

	public LivroDAO() {
		Estoque = new ArrayList<Livro>();
	}

	public Boolean Inserir(Livro a) {
		Estoque.add(a);
		return true;
	}

	public Boolean Alterar(Livro p) {
		for (Livro produto : Estoque) {
			if (produto.getTitulo() == p.getTitulo()) {
				
				return true;
			}
		}
		return false;
	}

	public Boolean Excluir(Livro p) {
		for (Livro produto : Estoque) {
			if (produto.getTitulo() == p.getTitulo()) {
				Estoque.remove(produto);
				return true;
			}
		}
		return false;
	}

	public void listar() {
		for(int i=0;i<Estoque.size();i++)
		{
			System.out.println();
			System.out.println("Livro"+(i+1));
			System.out.println("Titulo: " + Estoque.get(i).getTitulo());
			System.out.println("Autor:"+ Estoque.get(i).getAutor());
			System.out.println("Genero:"+Estoque.get(i).getGenero());
			System.out.println("Preco:"+Estoque.get(i).getPreco());
		}
	}

}
