package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	private String nombre;
		
	public Polideportivo() 
	{
		super();
		this.nombre= "sin nombre";
	}
	
	public Polideportivo(String nombre, double superficie) 
	{
		super(superficie);
		this.nombre = nombre;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Polideportivo: "+ 
				"\nNombre= " + nombre + 
				"\nSuperficie= " + getSuperficie() +
				"\nTipo de instalacion= " + getTipoDeInstalacion() + "\n";
	}

	@Override
	public int getTipoDeInstalacion() {
		
		return 0;
	}
}







