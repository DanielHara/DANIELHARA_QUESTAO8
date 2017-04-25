import java.util.ArrayList;

public class Registros
{
	final int disponivel = 1;
	final int retirado = 2;
	final int extraviado = 3;
	final int corrente = 4;
	final int devolvido = 5;
	
	ArrayList<Usuario> Lista_Usuario;
	ArrayList<Emprestimo> Lista_Emprestimo;
	ArrayList<Devolucao> Lista_Devolucao;
	ArrayList<Livro> Lista_Livro;
	
	Registros()
	{
		Lista_Usuario = new ArrayList<Usuario>();
		Lista_Emprestimo = new ArrayList<Emprestimo>();
		Lista_Devolucao = new ArrayList<Devolucao>();
		Lista_Livro = new ArrayList<Livro>();
	}

	public void AdicionarUsuario(String _Nome)
	{
		Usuario New_User = new Usuario (_Nome);
		Lista_Usuario.add(New_User);
	}
	
	public void AdicionarLivro (String _Titulo)
	{
		Livro L = new Livro(_Titulo);
		Lista_Livro.add(L);
	}
	
	public void Remover (String Nome)
	{
		int i;
		int N = Lista_Usuario.size();
		for (i = 0; i < N; i++)
		{
			if (Lista_Usuario.get(i).getNome().compareTo(Nome) == 0)
			{
				Lista_Usuario.remove(i);
				break;
			}
		}
	}
	
	public void Bloquear (String Nome, int year, int month, int day)
	{
		int i;
		
		for (i = 0; i < Lista_Usuario.size(); i++)
		{
			if (Lista_Usuario.get(i).getNome().compareTo(Nome) == 0)
			{
				Lista_Usuario.get(i).BloquearAteh(year, month, day);
				break;
			}
		}
	}
	
	public void AdicionarEmprestimo (String _Nome, String _Titulo)
	{
		Lista_Emprestimo.add(new Emprestimo(_Nome, _Titulo));
		for (int i = 0; i < Lista_Livro.size(); i++)
		{
			if (Lista_Livro.get(i).getTitulo().compareTo(_Titulo) == 0)
			{
				Lista_Livro.get(i).RetirarLivro();
			}
		}
	}
	
	public void AdicionarDevolucao (String _Nome, String _Titulo)
	{
		int i;
		Lista_Devolucao.add(new Devolucao(_Nome, _Titulo));
		for (i = 0; i < Lista_Livro.size(); i++)
		{
			if (Lista_Livro.get(i).getTitulo().compareTo(_Titulo) == 0)
				Lista_Livro.get(i).DevolverLivro();
		}
		for (i = 0; i < Lista_Emprestimo.size(); i++)
			if (Lista_Emprestimo.get(i).getTitulo().compareTo(_Titulo) == 0 && Lista_Emprestimo.get(i).getNome().compareTo(_Nome) == 0)
				Lista_Emprestimo.get(i).Devolver();
	}
	
	public void ListarLivrosEmprestados (String _Nome)
	{
		int i;
		for (i = 0; i < Lista_Emprestimo.size(); i++)
			if (Lista_Emprestimo.get(i).getNome().compareTo(_Nome) == 0 && Lista_Emprestimo.get(i).getSituacao() == corrente)
				System.out.println("Livro \"" + Lista_Emprestimo.get(i).getTitulo() + "\": emprestado");
	}
	
	public void SituacaoUsuario (String _Nome)
	{
		int i;
		for (i = 0; i < Lista_Usuario.size(); i++)
		{
			if (Lista_Usuario.get(i).getNome().compareTo(_Nome) == 0)
				Lista_Usuario.get(i).PrintSituacaoUsuario();
		}
	}
	
	public void PrintSituacaoLivro (String _Titulo)
	{
		for (int i = 0; i < Lista_Livro.size(); i++)
			if (Lista_Livro.get(i).getTitulo().compareTo(_Titulo) == 0)
			{
				int situacao = Lista_Livro.get(i).getSituacao();
				if (situacao == disponivel)
					System.out.println("Livro disponível!");
				else
				{
					if (situacao == retirado)
						System.out.println("Livro retirado!");
					else System.out.println("Livro extraviado!");
				}
			}
	}
	
	

}
