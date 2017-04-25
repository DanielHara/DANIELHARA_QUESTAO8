
public class Teste {

	public static void main (String args[])
	{
		Registros Teste = new Registros();
	
		Teste.AdicionarUsuario("João da Silva");
		Teste.AdicionarUsuario("Fulano de Tal");
		
		Teste.AdicionarLivro("A Cidade e as Serras");
		Teste.AdicionarLivro("O Centeio");
		
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.AdicionarEmprestimo("João da Silva", "A Cidade e as Serras");
		Teste.ListarEmprestimos();
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.AdicionarDevolucao("João da Silva", "A Cidade e as Serras");
		Teste.ListarDevolucoes();
		
		Teste.PrintSituacaoLivro("A Cidade e as Serras");
		
		Teste.SituacaoUsuario("João da Silva");
		
		Teste.BloquearExtravio("João da Silva");
		
		Teste.SituacaoUsuario("João da Silva");
	
	}
}
