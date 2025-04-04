package ejercicio2;

import java.util.Date;

public class ProductoCongelado extends Producto {

	private float tempCongRecom;
	
	public ProductoCongelado(Date fechaCaducidad, int numLote, float tempCongRecom) {
		super(fechaCaducidad, numLote);
		this.tempCongRecom = tempCongRecom;
	}

	public float getTempCongRecom() {
		return tempCongRecom;
	}

	public void setTempCongRecom(float tempCongRecom) {
		this.tempCongRecom = tempCongRecom;
	}
	
    @Override
    public void mostrarInfo() {
    	System.out.println("-----Producto Congelado-------");
        super.mostrarInfo();
        System.out.println("Temperatuar de Congelación Recomendada: " + tempCongRecom + "° \n");

    }
	
	
}
