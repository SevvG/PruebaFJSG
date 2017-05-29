package javaapplication4;

public class Notas
{
	//Atributos
	
	private String dni;
	private String codigo;
	private double nota1Ev;
	private double nota2Ev;
	private double nota3Ev;

	//Constructor
	public Notas()
	{
		dni="";
		codigo="";
		nota1Ev=0;
		nota2Ev=0;
		nota3Ev=0;
	}
	
	//Metodos
	
	public void setDni(String dni) { this.dni=dni; }
	public String getDni() { return dni; }
	
	public void setCodigo(String codigo) { this.codigo=codigo; }
	public String getCodigo() { return codigo; }
	
	public void setNota1Ev(double nota1Ev) { this.nota1Ev=nota1Ev; }
	public double getNota1Ev() { return nota1Ev; }
	
	public void setNota2Ev(double nota2Ev) { this.nota2Ev=nota2Ev; }
	public double getNota2Ev() { return nota2Ev; }
	
	public void setNota3Ev(double nota3Ev) { this.nota3Ev=nota3Ev; }
	public double getNota3Ev() { return nota3Ev; }
	
	
	public int getNotaFinal() { return (int) (nota1Ev+nota2Ev+nota3Ev)/3; }
}
