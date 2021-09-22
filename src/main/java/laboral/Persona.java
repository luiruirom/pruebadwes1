package laboral;

/**
 * Clase modelo de personas
 * @author luiruirom
 * 
 */
public class Persona {
	public String nombre;
	public String dni;
	public char sexo;
	
	/**
	 * Constructor de la clase Persona con los parámetros: nombre, dni y sexo
	 * @param nombre nombre de la persona
	 * @param dni dni de la persona
	 * @param sexo sexo de la persona
	 */
	public Persona(String nombre, String dni, char sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	/**
	 * Constructor de la clase Persona con los parámetros: nombre y sexo
	 * @param nombre nombre de la persona
	 * @param sexo sexo de la persona
	 */
	public Persona(String nombre, char sexo) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	/**
	 * Método para modificar el dni
	 * @param dni dni nuevo de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Método para imprimir los datos del objeto Persona por pantalla
	 */
	public void imprime(){
		System.out.println("Persona [nombre=" + nombre + ", dni=" + dni + "]");
	}
	
}
