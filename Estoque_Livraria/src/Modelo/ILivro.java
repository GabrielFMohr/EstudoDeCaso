package Modelo;

public interface ILivro {//Implementação do modelo de interface

	public boolean Inserir(Livro a);

	public boolean Alterar(Livro p);

	public boolean Excluir(Livro p);

	public void listar();

}
