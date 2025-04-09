package ejercicio3;

public class EdificioDeOficinas extends Edificio{

	private int nroOficinas;
	public EdificioDeOficinas()
	{
		super();
		nroOficinas= 0;
	}
	
	public EdificioDeOficinas(int nroOficinas, double superficie) 
	{
		super(superficie);
		this.nroOficinas = nroOficinas;
	}

	public int getNroOficinas() {
		return nroOficinas;
	}

	public void setNroOficinas(int nroOficinas) {
		this.nroOficinas = nroOficinas;
	}
	
	@Override
	public String getTipoDeInstalacion() {
		return super.getTipoDeInstalacion() +  "y un Edificio de Oficinas";
	}


	@Override
	public String toString() {
		return "EdificioDeOficinas: "+
				"\nNúmero de oficinas= " + nroOficinas + 
				"\nSuperficie= " + getSuperficie() + "\n";
	}
	
}





