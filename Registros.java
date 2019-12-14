import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Registros
{
	final int disponivel = 1;
	final int retirado = 2;
	final int extraviado = 3;
	
	ArrayList<Usuario> Lista;
	ArrayList<Emprestimo> Lista_Emprestimo;
	ArrayList<Devolucao> Lista_Devolucao;
	ArrayList<Livro> Lista_Livro;
	
	Registros()
	{
		Lista = new ArrayList<Usuario>();
		Lista_Emprestimo = new ArrayList<Emprestimo>();
		Lista_Devolucao = new ArrayList<Devolucao>();
		Lista_Livro = new ArrayList<Livro>();
	}

	public void AdicionarUsuario(String _Nome)
	{
		Usuario New_User = new Usuario (_Nome);
		Lista.add(New_User);
	}
	
	public void AdicionarLivro (String _Titulo)
	{
		Livro L = new Livro(_Titulo);
		Lista_Livro.add(L);
	}
	
	public void Remover (String Nome)
	{
		int i;
		int N = Lista.size();
		for (i = 0; i < N; i++)
		{
			if (Lista.get(i).getNome().compareTo(Nome) == 0)
			{
				Lista.remove(i);
				break;
			}
		}
	}
	
	public void Bloquear (String Nome, int year, int month, int day)
	{
		int i;
		
		for (i = 0; i < Lista.size(); i++)
		{
			if (Lista.get(i).getNome().compareTo(Nome) == 0)
			{
				Lista.get(i).BloquearAteh(year, month, day);
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
		Lista_Devolucao.add(new Devolucao(_Nome, _Titulo));
		for (int i = 0; i < Lista_Livro.size(); i++)
			if (Lista_Livro.get(i).getTitulo().compareTo(_Titulo) == 0)
				Lista_Livro.get(i).DevolverLivro();
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
	
	private String DateAsString (GregorianCalendar A)
	{
		if (A != null)
			return A.get(GregorianCalendar.DAY_OF_MONTH) + "/" + A.get(GregorianCalendar.MONTH) + "/" + A.get(GregorianCalendar.YEAR);
		else return "";
	}
	
	public void ListarUsuarios ()
	{
		int i;
		for (i = 0; i < Lista.size(); i++)
		{
			System.out.println("Usuário:");
			System.out.println("Nome: " + Lista.get(i).getNome());
			if (Lista.get(i).isBloqueado())
				System.out.println("Bloqueado até: " + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.DAY_OF_MONTH) + "/" + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.MONTH) + "/" + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.YEAR));
			else System.out.println("Usuário não bloqueado.\n");
		}
	}
	
	public void ListarEmprestimos ()
	{
		int i;
		for (i = 0; i < Lista_Emprestimo.size(); i++)
		{
			System.out.println("Emprestimo:");
			System.out.println("Livro: " + Lista_Emprestimo.get(i).getTitulo() + ", Usuário: " + Lista_Emprestimo.get(i).getNome());
			System.out.println("Emprestado em " + DateAsString(Lista_Emprestimo.get(i).getData()));
		}
	}
	
	public void ListarDevolucoes ()
	{
		int i;
		for (i = 0; i < Lista_Devolucao.size(); i++)
		{
			System.out.println("Devolução:");
			System.out.println("Livro: " + Lista_Devolucao.get(i).getTitulo() + ", Usuário: " + Lista_Devolucao.get(i).getNome());
			System.out.println("Devolvido em " + DateAsString(Lista_Devolucao.get(i).getData()));
		}
	}
	
}
