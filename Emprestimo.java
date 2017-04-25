import java.util.GregorianCalendar;

public class Emprestimo {

	final int corrente = 4;
	final int devolvido = 5;
	
	String Nome_Usuario;
	String Titulo;
	int situacao;
	GregorianCalendar data;
	
	Emprestimo(String Nome, String _Titulo)
	{
		Nome_Usuario = Nome;
		Titulo = _Titulo;
		data = new GregorianCalendar();
		situacao = corrente;
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
	
	int getSituacao()
	{
		return situacao;
	}
	
	void Devolver ()
	{
		situacao = devolvido;
	}
	
}
