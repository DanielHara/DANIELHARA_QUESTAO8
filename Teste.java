
public class Teste {

	public static void main (String args[])
	{
		Registros Teste = new Registros();
		
		Teste.Adicionar("Jo�o da Silva");
		Teste.ListarUsuarios();
		
		Teste.Adicionar("Fulano de Tal");
		Teste.ListarUsuarios();
		
		Teste.Remover("Jo�o da Silva");
		Teste.ListarUsuarios();
		
		Teste.Bloquear("Fulano de Tal", 2017, 4, 31);
		Teste.ListarUsuarios();
	}
	
}
