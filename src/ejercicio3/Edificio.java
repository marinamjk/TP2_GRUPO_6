package ejercicio3;

public abstract class Edificio {

	private double superficie;

	public Edificio() 
	{
		superficie=0;
	}
	
	public Edificio(double superficie) 
	{
		this.superficie=superficie;
	}
	
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getTipoDeInstalacion() {
		return 2;
	}
}
