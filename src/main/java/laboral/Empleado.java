package laboral;

public class Empleado extends Persona{
	private int categoria;
	public int anyos;
	
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;
		if(dni.length() > 9 || dni.length() < 9) {
			throw new DatosNoCorrectosException("El dni debe ser de 9 caracteres");
		}
		if(sexo != 'M' && sexo != 'F') {
			throw new DatosNoCorrectosException("El sexo solo puede ser M ó F");
		}
		if(categoria < 1 || categoria > 10) {
			throw new DatosNoCorrectosException("La categoría debe estar entre 1 y 10");
		}
		if(anyos < 0) {
			throw new DatosNoCorrectosException("Los años trabajados no pueden ser números negativos");
		}
	}

	public Empleado(String nombre, String dni, char sexo) {
		super(nombre, dni, sexo);
		this.categoria = 1;
		this.anyos = 0;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public void incrAnyo() {
		this.anyos++;
	}

	public void imprime(){
		System.out.println("Empleado [categoria=" + categoria + ", anyos=" + anyos + ", nombre=" + nombre + ", dni=" + dni
				+ ", sexo=" + sexo + "]");
	}
}
