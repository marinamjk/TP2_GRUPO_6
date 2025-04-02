package ejercicio2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Producto {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	 private Date fechaCaducidad;
	 private int numLote;
	 
	 //Constructor	 
	 public Producto(Date fechaCaducidad, int numLote) 
	 {
	        this.fechaCaducidad = fechaCaducidad;
	        this.numLote = numLote;
	 }
	 
	//getters & setters
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	 
	// Métodos
    public void mostrarInfo() {
        System.out.println(
        		"Fecha de caducidad: " + sdf.format(fechaCaducidad) +
        		"\nNúmero de lote: " + numLote
        		);
    }
}
