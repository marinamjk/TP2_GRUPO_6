package ejercicio2;

import java.util.Date;

public class ProductoRefrigerado extends Producto {

	private int codOrgSupAliment;
	
	public ProductoRefrigerado(Date fechaCaducidad, int numLote, int codOrgSupAliment) {
		super(fechaCaducidad, numLote);
                setCodOrgSupAliment(codOrgSupAliment);
	}

	public int getCodOrgSupAliment() {
		return codOrgSupAliment;
	}

	public void setCodOrgSupAliment(int codOrgSupAliment) {
		if(codOrgSupAliment >= 0) 
		{
			this.codOrgSupAliment = codOrgSupAliment;
		}
		else 
		{
			System.out.println("El codigo de la organizacion alimentaria no puede ser negativo");
			return;
		}
	}

    // Método para mostrar información
    @Override
    public void mostrarInfo() {
    	System.out.println("-----Producto Refrigerado-------");
        super.mostrarInfo();
        System.out.println("Código del Org. de Supervisión Alimentaria: " + getCodOrgSupAliment() + "\n");

    }
	
	
}
