import java.util.GregorianCalendar;

public class Emprestimo {

	final int corrente = 1;
	final int devolvido = 2;
	
	String Nome_Usuario;
	String Titulo;
	GregorianCalendar data;
	int situacao;
	
	Emprestimo(String Nome, String _Titulo)
	{
		Nome_Usuario = Nome;
		Titulo = _Titulo;
		data = new GregorianCalendar();
		situacao = corrente;
	}
	
	String getNomeUsuario()
	{
		return Nome_Usuario;
	}
	
	String getTitulo()
	{
		return Titulo;
	}
	
	void Devolver ()
	{
		situacao = devolvido;
	}
	
	int getSituacao ()
	{
		return situacao;
	}
	
	GregorianCalendar getData()
	{
		return data;
	}
	
}
