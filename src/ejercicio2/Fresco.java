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
	        setFechaEnvasado(fechaEnvasado);
	        setPaisOrigen(paisOrigen);
	 }
	 
	// Getters y Setters
	    public Date getFechaEnvasado() {
	        return fechaEnvasado;
	    }

	    public void setFechaEnvasado(Date fechaEnvasado) {
	       if(fechaEnvasado.after(new Date())) {
	        	System.out.println("La fecha de envasado debe coincidir con la fecha del sistema");
	        	return;
	        } 
	        else 
	        { 
	        	this.fechaEnvasado=fechaEnvasado;        
	        }
	    }

	    public String getPaisOrigen() {
	        return paisOrigen;
	    }

	    public void setPaisOrigen(String paisOrigen) {
	       if (paisOrigen == null || paisOrigen.trim().isEmpty() || !paisOrigen.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
	    	{
	               System.out.println("Nombre de pais no valido");
	               return; 
	        } 
	    	else 
	            {
	            	this.paisOrigen = paisOrigen;
	            }
	    }

	    // Método para mostrar información
	    @Override
	    public void mostrarInfo() {
	    	System.out.println("-----Producto FRESCO-------");
	        super.mostrarInfo();
	        System.out.println("Fecha de envasado: " + sdf.format(getFechaEnvasado()) +
	        					"\nPaís de origen: " + getPaisOrigen()+"\n");
	    }
	 
}
