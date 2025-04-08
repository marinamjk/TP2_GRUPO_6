package ejercicio3;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//public class Polideportivo implements IInstalacionDeportiva, IEdificio, ITipoInstalacion{
//
//	private String nombre;
//	private double superficie;
//	private Set<Integer> tipoInstalacion;
//	
//	public Polideportivo() 
//	{
//		this.nombre= "sin nombre";
//		this.superficie= 0;
//		this.tipoInstalacion = new HashSet<>();
//	}
//	
//	public Polideportivo(String nombre, double superficie, Set<Integer> tipoInstalacion) {
//		
//		this.nombre = nombre;
//		this.superficie = superficie;
//		this.tipoInstalacion = new HashSet<>(tipoInstalacion);
//	}
//	
//	
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public void setSuperficie(double superficie) {
//		this.superficie = superficie;
//	}
//
//	public void setTipoInstalacion(int tipoInstalacion) {
//		this.tipoInstalacion.add(tipoInstalacion);
//	}
//
//	@Override
//	public Set<Integer> getTipoInstalacion() {
//		return tipoInstalacion;
//	}
//
//	@Override
//	public String toString() {
//		return "Polideportivo: "+ 
//				"\nNombre= " + nombre + 
//				"\nSuperficie= " + superficie +
//				"\nTipo de instalacion= " + getDescripcion() + "\n";
//	}
//
//	@Override
//	public double getSuperficieEdificio() {
//		return superficie;
//	}
//	
//	private String getDescripcion()
//	{
//		Iterator<Integer> iterator = this.tipoInstalacion.iterator();
//		String descripcion = "";
//		while(iterator.hasNext())
//			descripcion += "\n*" + ITipoInstalacion.getDescripcion(iterator.next()) ;
//		
//		return descripcion;
//	}
//}



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
	public String getTipoDeInstalacion() {
		
		return super.getTipoDeInstalacion() + " y es una instalacion deportiva";
	}

}


