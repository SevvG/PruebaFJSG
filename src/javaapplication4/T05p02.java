package javaapplication4;

import java.util.*;

public class T05p02
{
	public static void main (String[] args) 
	{
		Alumno a=new Alumno();
		
		a.setDni("77880033K");
		a.setNombre("Mateo");
		a.setFecNan("22/11/1980");
		
		Modulo m=new Modulo();
		
		m.setCodigo("889O81W");
		m.setTitulo("Bases de datos");
		m.setHoraS("45h");
		
		Notas n=new Notas();
		
		n.setDni(a.getDni());
		n.setCodigo(m.getCodigo());
		n.setNota1Ev(6);
		n.setNota2Ev(5);
		n.setNota3Ev(4);
		
		System.out.println("Alumno");
		System.out.println("------");
		System.out.println("Nombre:\t\t\t "+a.getNombre());
		System.out.println("DNI:\t\t\t "+a.getDni());
		System.out.println("Fecha de nacimiento:\t "+a.getFecNan());
		System.out.println("");
		
		System.out.println("Modulo");
		System.out.println("------");
		System.out.println("Codigo del modulo:\t "+m.getCodigo());
		System.out.println("Nombre del modulo:\t "+m.getTitulo());
		System.out.println("Numero de horas:\t "+m.getHoraS());
		System.out.println("");
		
		System.out.println("Notas");
		System.out.println("------");
		System.out.println("Alumno: \t\t "+a.getNombre());
		System.out.println("DNI: \t\t\t "+n.getDni());
		System.out.println("Modulo: \t\t "+m.getTitulo());
		System.out.println("Codigo modulo:\t\t "+n.getCodigo());
		System.out.println("Nota Primera Evaluacion: "+n.getNota1Ev());
		System.out.println("Nota Segunda Evaluacion: "+n.getNota2Ev());
		System.out.println("Nota Tercera Evaluacion: "+n.getNota3Ev());
		System.out.println("Nota Final:\t\t "+n.getNotaFinal());
		System.out.println("");
	}
}
