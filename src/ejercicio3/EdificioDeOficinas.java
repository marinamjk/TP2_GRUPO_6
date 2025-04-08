package ejercicio3;

//public class EdificioDeOficinas implements IEdificio, ITipoInstalacion{
//
//	private int nroOficinas;
//	private double superficie;
//		
//	public EdificioDeOficinas()
//	{
//		nroOficinas= 0;
//		superficie=0;
//	}
//	
//	public EdificioDeOficinas(int nroOficinas, double superficie) {
//		this.nroOficinas = nroOficinas;
//		this.superficie = superficie;
//	}
//
//	public int getNroOficinas() {
//		return nroOficinas;
//	}
//
//	public void setNroOficinas(int nroOficinas) {
//		this.nroOficinas = nroOficinas;
//	}
//
//	public void setSuperficie(double superficie) {
//		this.superficie = superficie;
//	}
//
//	@Override
//	public double getSuperficieEdificio() {
//		return superficie;
//	}
//
//	@Override
//	public String toString() {
//		return "EdificioDeOficinas: "+
//				"\nNúmero de oficinas= " + nroOficinas + 
//				"\nSuperficie= " + superficie + "\n";
//	}
//	
//}




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
	public String toString() {
		return "EdificioDeOficinas: "+
				"\nNúmero de oficinas= " + nroOficinas + 
				"\nSuperficie= " + getSuperficie() + "\n";
	}
	
}