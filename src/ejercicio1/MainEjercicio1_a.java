package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;


/*5. Crear una clase llamada mainEjercicio1_a, donde se creen 5 profesores y se 
guarden dentro de un arraylist. Mostrar la información utilizando un 
iterador. */
public class MainEjercicio1_a {
	
	static final int CANT_PROFESORES = 5;
	
	public static void main(String[] args) {
		
		Profesor[] vProfesor = crearVProfesores();
		ArrayList<Profesor> listProfesor = new ArrayList<Profesor>(CANT_PROFESORES);
		cargarArray(vProfesor, listProfesor);
		mostrarArray(listProfesor);
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
}
