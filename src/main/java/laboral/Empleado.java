package laboral;

public class Empleado extends Persona{
	private int categoria;
	public int anyos;
	
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;
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
