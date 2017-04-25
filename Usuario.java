import java.util.GregorianCalendar;

public class Usuario {
	private String Nome;
	GregorianCalendar BloqueadoAteh;   //Se null, então não está bloqueado.
	private int situacao;
	
	final int OK = 6;
	final int atrasado = 7;
	final int extravio = 8;
	
	Usuario (String _Nome)
	{
		Nome = _Nome;
		BloqueadoAteh = null;
		situacao = OK;
	}
	
	
	String getNome()
	{
		return Nome;
	}
	
	void BloquearAteh (int year, int month, int day)
	{
		BloqueadoAteh = new GregorianCalendar(year, month, day);
		situacao = atrasado;
	}
	
	void BloquearExtravio()
	{
		situacao = extravio;
	}
	
	
	GregorianCalendar getBloqueadoAteh ()
	{
		return BloqueadoAteh;
	}
	
	public void PrintSituacaoUsuario ()
	{	
		
		System.out.println("Usuário:");
		System.out.println("Nome: " + getNome());
		if (situacao == atrasado)
			System.out.println("Bloqueado até: " + getBloqueadoAteh().get(GregorianCalendar.DAY_OF_MONTH) + "/" + getBloqueadoAteh().get(GregorianCalendar.MONTH) + "/" + getBloqueadoAteh().get(GregorianCalendar.YEAR));
		else
		{
			if (situacao == extravio)
				System.out.println("Bloqueado por extravio.\n");
			else System.out.println("Usuário não bloqueado.\n");
		}
		
	}
	
	
	
}
