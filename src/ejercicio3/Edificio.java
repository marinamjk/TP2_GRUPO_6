package ejercicio3;

public abstract class Edificio { //En realidad debe llamarse "Edificio, hay que renombrar el archivo si lo cambiaramos

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

	public String getTipoDeInstalacion() {
		return "Es un edificio ";
	}
}