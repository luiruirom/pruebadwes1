package laboral;

/**
 * Clase modelo de los empleados
 * @author luiruirom
 *
 */
public class Empleado extends Persona{
	private int categoria;
	public int anyos;
	
	/**
	 * Constructor de la clase Empleado, lanza una excepcion en caso de no cumplir requisitos de la clase
	 * @param nombre nombre del empleado
	 * @param dni dni del empleado
	 * @param sexo sexo del empleado
	 * @param categoria categoria laboral del empleado en la empresa
	 * @param anyos años trabajados en la empresa
	 * @throws DatosNoCorrectosException excepcion lanzada en caso de no cumplir requisitos de la clase
	 */
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;
		if(dni.length() > 9 || dni.length() < 9) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
		if(sexo != 'M' && sexo != 'F') {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
		if(categoria < 1 || categoria > 10) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
		if(anyos < 0) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
	}
	
	/**
	 * Constructor de la clase Empleado, lanza una excepcion en caso de no cumplir requisitos de la clase
	 * @param nombre nombre del empleado
	 * @param dni dni del empleado
	 * @param sexo sexo del empleado
	 * @throws DatosNoCorrectosException excepcion lanzada en caso de no cumplir requisitos de la clase
	 */
	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException{
		super(nombre, dni, sexo);
		this.categoria = 1;
		this.anyos = 0;
		if(dni.length() > 9 || dni.length() < 9) {
			throw new DatosNoCorrectosException("El dni debe ser de 9 caracteres");
		}
		if(sexo != 'M' && sexo != 'F') {
			throw new DatosNoCorrectosException("El sexo solo puede ser M ó F");
		}
	}
	
	/**
	 * Método para obtener la categoria de un empleado
	 * @return categoria del empleado 
	 */
	public int getCategoria() {
		return categoria;
	}
	
	/**
	 * Método para cambiar la categoría de un empleado
	 * @param categoria categoría nueva del empleado
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	/**
	 * Método para incrementar los años trabajados de un empleado en 1
	 */
	public void incrAnyo() {
		this.anyos++;
	}

	/**
	 * Método para imprimir los datos de un empleado
	 */
	public void imprime(){
		System.out.println("Empleado [categoria=" + categoria + ", anyos=" + anyos + ", nombre=" + nombre + ", dni=" + dni
				+ ", sexo=" + sexo + "]");
	}
}
