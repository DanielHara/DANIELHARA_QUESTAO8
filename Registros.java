import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Registros
{
	
	ArrayList<Usuario> Lista;
	
	Registros()
	{
		Lista = new ArrayList<Usuario>();
	}

	public void Adicionar(String _Nome)
	{
		Usuario New_User = new Usuario (_Nome);
		Lista.add(New_User);
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
	
	public void ListarUsuarios ()
	{
		int i;
		for (i = 0; i < Lista.size(); i++)
		{
			System.out.println("Usuário:\n");
			System.out.println("Nome: " + Lista.get(i).getNome() + "\n");
			if (Lista.get(i).isBloqueado())
				System.out.println("Bloqueado até: " + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.DAY_OF_MONTH) + "/" + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.MONTH) + "/" + Lista.get(i).getBloqueadoAteh().get(GregorianCalendar.YEAR) + "\n");
			else System.out.println("Usuário não bloqueado.\n");
		}
	}
	
	
	

}
