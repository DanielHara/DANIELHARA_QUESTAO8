public class Livro {

	final int disponivel = 1;
	final int retirado = 2;
	final int extraviado = 3;
	
	String Titulo;
	int situacao; 
	
	Livro (String _Titulo)
	{
		Titulo = _Titulo;
		situacao = disponivel;
	}
	
	String getTitulo()
	{
		return Titulo;
	}
	
	void RetirarLivro ()
	{
		situacao = retirado;
	}
	
	void DevolverLivro ()
	{
		situacao = disponivel;
	}
	
}
