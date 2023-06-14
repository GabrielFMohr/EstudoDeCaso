package Modelo;

public interface ILivro {//Implementação do modelo de interface

	public boolean Inserir(Livro a);

	public Livro Buscar(Long t);

	public boolean Compra(Long p);

	public boolean Alterar(Livro livroComAlteracoes);
	
	public void listar();

}
