
public class Teste {

	public static void main (String args[])
	{
		Registros Teste = new Registros();
	
		Teste.AdicionarUsuario("Jo�o da Silva");
		Teste.AdicionarUsuario("Fulano de Tal");
		
		Teste.AdicionarLivro("A Cidade e as Serras");
		Teste.AdicionarLivro("O Centeio");
		
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.AdicionarEmprestimo("Jo�o da Silva", "A Cidade e as Serras");
		Teste.ListarEmprestimos();
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.AdicionarDevolucao("Jo�o da Silva", "A Cidade e as Serras");
		Teste.ListarDevolucoes();
		
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.SituacaoUsuario("Jo�o da Silva");
		
		Teste.BloquearExtravio("Jo�o da Silva");
		
		Teste.SituacaoUsuario("Jo�o da Silva");
	
	}
}
