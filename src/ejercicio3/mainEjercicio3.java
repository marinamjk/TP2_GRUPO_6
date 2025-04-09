package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {
	public static void main(String[] args) {

		 ArrayList<Edificio> listaElementos = new ArrayList<>();
	        
		 Polideportivo polideportivo1 = new Polideportivo("Polideportivo A", 5000.0);
	     EdificioDeOficinas edificio1 = new EdificioDeOficinas(10, 2000.0);
	      
	      listaElementos.add(polideportivo1);
	      listaElementos.add(edificio1);
	      listaElementos.add(new Polideportivo("Poli B", 4500.00));
	      listaElementos.add(new Polideportivo("Poli C", 7800.00));
	      listaElementos.add(new EdificioDeOficinas(30, 5400.00));
	        
	      Iterator<Edificio> iterator = listaElementos.iterator();
	        
	      while (iterator.hasNext()) {
	          Edificio elemento = iterator.next();
	          System.out.print(elemento.toString());
	          System.out.println(elemento.getTipoDeInstalacion()+ "\n");
	      }
	}
}



