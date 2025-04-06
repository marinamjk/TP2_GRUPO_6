package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


/*5. Crear una clase llamada mainEjercicio1_a, donde se creen 5 profesores y se 
guarden dentro de un arraylist. Mostrar la información utilizando un 
iterador. */
public class MainEjercicio1_a {
	
	static final int CANT_PROFESORES = 5;
	static ArrayList<Profesor> listProfesor2 = new ArrayList<Profesor>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Profesor[] vProfesor = crearVProfesores();
		ArrayList<Profesor> listProfesor = new ArrayList<Profesor>(CANT_PROFESORES);
		cargarArray(vProfesor, listProfesor);
		mostrarArray(listProfesor);
		//-------------------------------------------------------//
		cargarProfesor();
		mostrarProfesores(listProfesor2);
	}
	
	static Profesor[] crearVProfesores()
	{
		
		Profesor[] vProfesor = new Profesor[CANT_PROFESORES];
		
		vProfesor[0] = new Profesor("Juan", 40, "Titular",12);
		vProfesor[1] = new Profesor("Maximiliano", 26, "Ayudante de catedra",1);
		vProfesor[2] = new Profesor("Tamara", 35, "Jefe de trabajos practicos",7);
		vProfesor[3] = new Profesor("Angel", 50, "Ayudante",20);
		vProfesor[4] = new Profesor("Laura", 31, "Ayudante de catedra",4);
		
		return vProfesor;
	}
	
	static void cargarArray(Profesor[] vProfesor, ArrayList<Profesor> listProfesor) {
		for(Profesor p : vProfesor)
			listProfesor.add(p);
	}
	
	static void mostrarArray(ArrayList<Profesor> listProfesor)
	{
		ListIterator<Profesor> iteratorProfesor = listProfesor.listIterator();
		
		while(iteratorProfesor.hasNext())
			System.out.println(iteratorProfesor.next() + "\n") ;
		
	}
	static void cargarProfesor() 
	{		
		int i=0;		
		for(i=0;i<5;i++) 
		{	
		Profesor nuevoProfesor = new Profesor();				
		System.out.print("Ingrese nombre: " );
		nuevoProfesor.setNombre(scanner.nextLine());
		System.out.print("Ingrese edad: ");
		int edad = Integer.parseInt(scanner.nextLine());
		nuevoProfesor.setEdad(edad);
		System.out.print("Ingrese Cargo: ");
		nuevoProfesor.setCargo(scanner.nextLine());
		System.out.print("Ingrese Antiguedad: ");
		int antiguedad =Integer.parseInt(scanner.nextLine());
		nuevoProfesor.setAntiguedadDocente(antiguedad);
		
		 agregarNuevoProfesor(nuevoProfesor,listProfesor2);
		}		
		System.out.println("Profesores cargados correctamente.");		
	}
	
	static void agregarNuevoProfesor (Profesor p, ArrayList<Profesor> listNuevosProfesores)
	{
		listNuevosProfesores.add(p);
	}
	
	static void mostrarProfesores (ArrayList<Profesor> listNuevosProfesores)
	{
		ListIterator<Profesor> iteradorCargaPantalla = listProfesor2.listIterator();
		
		while(iteradorCargaPantalla.hasNext()) 
		
			System.out.println(iteradorCargaPantalla.next() + "\n") ;			
	}
}
