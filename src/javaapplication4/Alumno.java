package javaapplication4;

public class Alumno
{
	//Atributos
	
	private String dni;
	private String nombre;
	private String fecNan;
	
	//Constructor
	
	public Alumno()
	{
		dni="";
		nombre="";
		fecNan="";
	}
	
	//Metodos
	
	public void setDni(String dni) { this.dni=dni; }
	public String getDni() { return dni; }
	
	public void setNombre (String nombre) { this.nombre=nombre; }
	public String getNombre() { return nombre; }
	
	public void setFecNan(String fecNan) { this.fecNan=fecNan; }
	public String getFecNan() { return fecNan; }
	
}
