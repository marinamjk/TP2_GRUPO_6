package ejercicio2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainEjercicio2 {
	public static void main(String[] args) 
	{
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Fresco(new GregorianCalendar(2025, Calendar.JUNE, 31).getTime(),
										  100, 
										  new GregorianCalendar(2025,Calendar.APRIL, 4).getTime(), 
										  "Argentina"));
		listaProductos.add(new ProductoRefrigerado(new GregorianCalendar(2025, Calendar.APRIL, 10).getTime(), 
														118, 
														115805113));
		listaProductos.add(new ProductoCongelado(new GregorianCalendar(2025, Calendar.APRIL, 9).getTime(),
				 										113, -3));
		
		for (Producto producto : listaProductos) {
			producto.mostrarInfo();
		}
	}
}
