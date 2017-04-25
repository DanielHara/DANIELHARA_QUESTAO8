import java.util.GregorianCalendar;

public class Usuario {
	private String Nome;
	GregorianCalendar BloqueadoAteh;   //Se null, então não está bloqueado.
	
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
	
	
}
