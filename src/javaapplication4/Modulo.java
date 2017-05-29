package javaapplication4;

public class Modulo
{
	//Atrubutos
	private String codigo;
	private String titulo;
	private String horaS;
	
	//Constructor
	public Modulo()
	{
		codigo="";
		titulo="";
		horaS="";
	}
	
	//Metodos
	
	public void setCodigo(String codigo) { this.codigo=codigo; }
	public String getCodigo() { return codigo; }
	
	public void setTitulo(String titulo) { this.titulo=titulo; }
	public String getTitulo() { return titulo; }
	
	public void setHoraS(String horaS) { this.horaS=horaS; }
	public String getHoraS() { return horaS; }

}
