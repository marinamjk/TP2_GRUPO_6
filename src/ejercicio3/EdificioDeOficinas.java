package ejercicio3;

public class EdificioDeOficinas implements IEdificio{

	private int nroOficinas;
	private double superficie;
		
	public EdificioDeOficinas()
	{
		nroOficinas= 0;
		superficie=0;
	}
	
	public EdificioDeOficinas(int nroOficinas, double superficie) {
		this.nroOficinas = nroOficinas;
		this.superficie = superficie;
	}

	public int getNroOficinas() {
		return nroOficinas;
	}

	public void setNroOficinas(int nroOficinas) {
		this.nroOficinas = nroOficinas;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "EdificioDeOficinas: "+
				"\nNúmero de oficinas= " + nroOficinas + 
				"\nSuperficie= " + superficie;
	}

	
}
