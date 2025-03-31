package ejercicio1;

public class Profesor extends Empleado {

	private String cargo;
	private int antiguedadDocente;
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}	
	
}
