package ejercicio3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mainEjercicio3 {
	public static void main(String[] args) {

		final Set<Integer> tipoIPolideportivo = new HashSet<>();
		
		tipoIPolideportivo.add(ITipoInstalacion.EDIFICIO);
		tipoIPolideportivo.add(ITipoInstalacion.INSTALACION_DEPORTIVA);
		
		 ArrayList<Object> listaElementos = new ArrayList<>();
	        
		 Polideportivo polideportivo1 = new Polideportivo("Polideportivo A", 5000.0, tipoIPolideportivo);
	        
	   
	     EdificioDeOficinas edificio1 = new EdificioDeOficinas(10, 2000.0);
	   
	        
	      
	      listaElementos.add(polideportivo1);
	      listaElementos.add(edificio1);	        
	    
	        Iterator<Object> iterator = listaElementos.iterator();
	        
	        while (iterator.hasNext()) {
	            Object elemento = iterator.next();
	            System.out.println(elemento.toString());
	        }
	        /*
	        for (Object object : listaElementos) {
	    				System.out.println(object.toString());
	    	}
	    	*/        
	        
	}
}


//PROPUESTA ANALIA:
//public class mainEjercicio3 {
//	public static void main(String[] args) {
//
//
//		 ArrayList<IEdificio> listaElementos = new ArrayList<>();
//	        
//		 Polideportivo polideportivo1 = new Polideportivo("Polideportivo A", 5000.0);
//	        
//	   
//	     EdificioDeOficinas edificio1 = new EdificioDeOficinas(10, 2000.0);
//	   
//	        
//	      
//	      listaElementos.add(polideportivo1);
//	      listaElementos.add(edificio1);
//	        
//	        
//	        
//	        Iterator<IEdificio> iterator = listaElementos.iterator();
//	        
//	        while (iterator.hasNext()) {
//	            Object elemento = iterator.next();
//	            System.out.println(elemento.toString());
//	        }
//
//	}
//}