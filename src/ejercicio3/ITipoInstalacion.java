package ejercicio3;

public interface ITipoInstalacion {
	static final int INSTALACION_DEPORTIVA = 1;
	static final int EDIFICIO = 2;
	
	static String getDescripcion(int id_tipo)
	{
		if(id_tipo == 1)
			return "Instalacion deportiva";
		
		if(id_tipo == 2)
			return "Edificio";
		
		return "SIN TIPO";
	}
}
