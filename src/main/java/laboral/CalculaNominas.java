package laboral;

/**
 * Clase main con un método para imprimir los datos de los empleados y con un método main que prueba los métodos de todas las clases
 * @author luiruirom
 *
 */
public class CalculaNominas {
	
	/**
	 * Método main en el que se crean dos empleados y se prueban los métodos de las demás clases
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Empleado james = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
			Empleado ada = new Empleado("Ada Lovelace", "32000031R", 'F');
			escribe(james, ada);
			ada.incrAnyo();
			james.setCategoria(9);
			escribe(james, ada);
		} catch (DatosNoCorrectosException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	/**
	 * Método que imprime por pantalla los datos de dos empleados, incluido su nómina
	 * @param emp1 primer empleado para mostrar sus datos
	 * @param emp2 segundo empleado para mostrar sus datos
	 */
	private static void escribe(Empleado emp1, Empleado emp2) {
		Nomina calculadorNomina = new Nomina();
		emp1.imprime();
		System.out.println("Sueldo --> " + calculadorNomina.sueldo(emp1));
		emp2.imprime();
		System.out.println("Sueldo --> " + calculadorNomina.sueldo(emp2));
		
	}
}
