package ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Profesor>{
	/* 2. Aplicar el concepto de encapsulamiento dentro de la clase profesor. */
	//atributos
	private String cargo;
	private int antiguedadDocente;
	
	/* 3. Crear los respectivos constructores */
	//constructores
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public Profesor() {
		super();
		this.cargo = "sin cargo";
		this.antiguedadDocente = 0;
	}

	//Getters & Setters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	//Metodos
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	/* 4. Sobreescribir el método “toString()”, en este caso debe devolver la
	 * siguiente información: id, nombre, edad, cargo y antiguedadDocente.*/
	@Override
	public String toString() {		
		return "ID: "+ getId() + 
				"\nNombre: "+ getNombre() + 
				"\nEdad: "+ getEdad() + 
				"\nCargo: "+ cargo + 
				"\nAntiguedad docente: " + antiguedadDocente; 
	}	
	
	public boolean equals(Object obj) {
		Profesor other = (Profesor) obj;
		
		if (!Objects.equals(getNombre(), other.getNombre()) ) return false;
		if (!Objects.equals(getEdad(), other.getEdad()) ) return false;
		
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		
		if(!Objects.equals(antiguedadDocente, other.antiguedadDocente) ) return false;

		return true;
	}
	
	public int hashCode() {
		final int prime = 2;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + Integer.hashCode(antiguedadDocente);
		result = prime * result + Integer.hashCode(getId());
		result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
		result = prime * result + Integer.hashCode(getEdad());
		return result;
	}

	@Override
	public int compareTo(Profesor o) {
		//Ordenamiento por antiguedad de mayor a menor
		
		if(o.antiguedadDocente == this.antiguedadDocente)
		return 0;
		
		if(o.antiguedadDocente < this.antiguedadDocente) 
		{
		 return -1;
		}
		return 1;
	}
	
}
