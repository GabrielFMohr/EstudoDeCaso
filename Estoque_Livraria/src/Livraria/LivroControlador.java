package Livraria;

import java.util.ArrayList;

public class LivroControlador {
	ArrayList<Livro> livrosCadastrados = new ArrayList<>();
	
	public void cadastrar(String autor, String genero, double preco, String titulo) {
		Livro a = new Livro(titulo, autor,genero, preco);
		livrosCadastrados.add(a);
		System.out.println("livro cadastrado com sucesso: "+titulo);
	}
	public void cadastrar(Livro livro) {
		livrosCadastrados.add(livro);
		System.out.println("livro cadastrado com sucesso: "+livro.titulo);
	}
}
