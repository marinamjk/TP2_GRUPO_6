package ejercicio2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public abstract class Producto implements Comparable <Producto> {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	 private Date fechaCaducidad;
	 private int numLote;
	 
	 //Constructor	 
	 public Producto(Date fechaCaducidad, int numLote) 
	 {
	    setFechaCaducidad(fechaCaducidad);
	    setNumLote(numLote);
	    
	 }
	 
	//getters & setters
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		if(fechaCaducidad.before(new Date())) {
		
		  System.out.println("La fecha de vencimiento no puede ser un dia anterior al actual");
		  return;
		}
		  else {
		
		  this.fechaCaducidad=fechaCaducidad;
		  }
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		if(numLote < 0 ) {
		
			System.out.println("El numero de lote no puede ser un numero negativo");
			return;
		}
		else 
		{
			this.numLote = numLote;
		}
	}
	 
	// Métodos
    public void mostrarInfo() {
        System.out.println(
        		"Fecha de caducidad: " + sdf.format(getFechaCaducidad()) +
        		"\nNúmero de lote: " + getNumLote()
        		);
    }
	 @Override
    public int compareTo(Producto otroProducto) {
        // Comparar por fecha de caducidad
        int resultado = this.fechaCaducidad.compareTo(otroProducto.getFechaCaducidad());

        // Si las fechas son iguales, comparo por número de lote
        if (resultado == 0) {
            resultado = Integer.compare(this.numLote, otroProducto.getNumLote());
        }

        return resultado;
    }
}
