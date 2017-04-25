
public class Teste {

	public static void main (String args[])
	{
		Registros Teste = new Registros();
		
		Teste.AdicionarUsuario("João da Silva");
		Teste.AdicionarUsuario("Fulano de Tal");
		
		Teste.AdicionarLivro("A Cidade e as Serras");
		Teste.AdicionarLivro("O Centeio");
		
		Teste.AdicionarEmprestimo("João da Silva", "A Cidade e as Serras");
		Teste.ListarEmprestimos();
		
		Teste.AdicionarDevolucao("Joao da Silva", "A Cidade e as Serras");
		Teste.ListarDevolucoes();
		
		
	
	}
}
