import java.util.GregorianCalendar;

public class Usuario {
	private String Nome;
	GregorianCalendar BloqueadoAteh;   //Se null, ent�o n�o est� bloqueado.
	
	Usuario (String _Nome)
	{
		Nome = _Nome;
		BloqueadoAteh = null;
	}
	
	
	String getNome()
	{
		return Nome;
	}
	
	void BloquearAteh (int year, int month, int day)
	{
		BloqueadoAteh = new GregorianCalendar(year, month, day);
	}
	
	boolean isBloqueado ()
	{
		if (BloqueadoAteh == null)
			return false;
		else return BloqueadoAteh.after(new GregorianCalendar());
	}
	
	GregorianCalendar getBloqueadoAteh ()
	{
		return BloqueadoAteh;
	}
	
	public void PrintSituacaoUsuario ()
	{	
		
		System.out.println("Usu�rio:");
		System.out.println("Nome: " + getNome());
		if (isBloqueado())
			System.out.println("Bloqueado at�: " + getBloqueadoAteh().get(GregorianCalendar.DAY_OF_MONTH) + "/" + getBloqueadoAteh().get(GregorianCalendar.MONTH) + "/" + getBloqueadoAteh().get(GregorianCalendar.YEAR));
		else System.out.println("Usu�rio n�o bloqueado.\n");
		
	}
	
	
	
}
