package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

/*6. Crear una clase llamada mainEjercicio1_b, donde se creen 5 profesores y se 
guarden dentro de un treeset. Mostrar la información utilizando un iterador. */
public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listProfesor = new TreeSet<Profesor>();
		
		listProfesor.add(new Profesor("Francisco", 29, "Titular", 2));
        listProfesor.add(new Profesor("Carlos", 50, "Ayudante", 7));
        listProfesor.add(new Profesor("Estela", 63, "Titular", 15));
        listProfesor.add(new Profesor("Julian", 43, "Ayudante de cátedra", 12));
        listProfesor.add(new Profesor("Joaquin", 37, "Ayudante de cátedra", 6));
		
		
		Iterator<Profesor> it = listProfesor.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			/* System.out.println(p.toString()+ "\n"); No es necesario el toString*/
			System.out.println(p+ "\n");
		}
		
		/* 7. Crear dos objetos de tipo profesor con la misma información en su
		 * interior, luego compararlos dentro de un IF y si contienen la misma
		 * información mostrar por consola “Es el mismo profesor. */
		Profesor p1 = new Profesor("Juan",10,"Ayudante",1);
		Profesor p2 = new Profesor("Juan",10,"Ayudante",1);

		if(p1.equals(p2))
		{
			System.out.println("Es el mismo profesor");
		}
		
	}

}
