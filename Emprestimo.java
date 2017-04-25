import java.util.GregorianCalendar;

public class Emprestimo {

	String Nome_Usuario;
	String Titulo;
	GregorianCalendar data;
	
	Emprestimo(String Nome, String _Titulo)
	{
		Nome_Usuario = Nome;
		Titulo = _Titulo;
		data = new GregorianCalendar();
	}
	
	String getTitulo ()
	{
		return Titulo;
	}
	
	String getNome ()
	{
		return Nome_Usuario;
	}
	
	GregorianCalendar getData()
	{
		return data;
	}
	
}
