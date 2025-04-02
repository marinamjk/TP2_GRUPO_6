package ejercicio2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Fresco extends Producto{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date fechaEnvasado;
	private String paisOrigen;
	
	 public Fresco(Date fechaCaducidad, int numLote, Date fechaEnvasado, String paisOrigen) 
	 {
	        super(fechaCaducidad, numLote);
	        this.fechaEnvasado = fechaEnvasado;
	        this.paisOrigen = paisOrigen;
	 }
	 
	// Getters y Setters
	    public Date getFechaEnvasado() {
	        return fechaEnvasado;
	    }

	    public void setFechaEnvasado(Date fechaEnvasado) {
	        this.fechaEnvasado = fechaEnvasado;
	    }

	    public String getPaisOrigen() {
	        return paisOrigen;
	    }

	    public void setPaisOrigen(String paisOrigen) {
	        this.paisOrigen = paisOrigen;
	    }

	    // Método para mostrar información
	    @Override
	    public void mostrarInfo() {
	    	System.out.println("-----Producto FRESCO-------");
	        super.mostrarInfo();
	        System.out.println("Fecha de envasado: " + sdf.format(fechaEnvasado) +
	        					"\nPaís de origen: " + paisOrigen+"\n");
	    }
	 
}
