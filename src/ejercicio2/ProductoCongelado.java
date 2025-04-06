package ejercicio2;

import java.util.Date;

public class ProductoCongelado extends Producto {

	private float tempCongRecom;
	
	public ProductoCongelado(Date fechaCaducidad, int numLote, float tempCongRecom) {
		super(fechaCaducidad, numLote);
		setTempCongRecom(tempCongRecom);
	}

	public float getTempCongRecom() {
		return tempCongRecom;
	}

	public void setTempCongRecom(float tempCongRecom) {
		if(tempCongRecom<=-18) 
		{
			this.tempCongRecom=tempCongRecom;
		}
		else{
			
			System.out.println("La temperatura recomendada de congelacion es");
			this.tempCongRecom=-18;
			return;
	            }
	}
	
    @Override
    public void mostrarInfo() {
    	System.out.println("-----Producto Congelado-------");
        super.mostrarInfo();
       System.out.println("Temperatura de Congelación Recomendada: " + getTempCongRecom() + "° \n");

    }
	
	
}
