package ejercicio3;

public class Polideportivo implements IInstalacionDeportiva, IEdificio{

	private String nombre;
	private double superficie;
	private int tipoInstalacion;
	
	public Polideportivo() 
	{
		this.nombre= "sin nombre";
		this.superficie= 0;
		this.tipoInstalacion= 0;
	}
	
	public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoInstalacion = tipoInstalacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setTipoInstalacion(int tipoInstalacion) {
		this.tipoInstalacion = tipoInstalacion;
	}

	@Override
	public int getTipoInstalacion() {
		return tipoInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo: "+ 
				"\nNombre= " + nombre + 
				"\nSuperficie= " + superficie +
				"\nTipo de instalacion= " + tipoInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}		
	
}


