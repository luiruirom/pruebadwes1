package laboral;

public class CalculaNominas {

	public static void main(String[] args) {
		Empleado james = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
		Empleado ada = new Empleado("Ada Lovelace", "32000031R", 'F');
		
		escribe(james, ada);
		
		ada.incrAnyo();
		james.setCategoria(9);
		
		escribe(james, ada);
	}
	
	private static void escribe(Empleado emp1, Empleado emp2) {
		Nomina calculadorNomina = new Nomina();
		emp1.imprime();
		System.out.println("Sueldo --> " + calculadorNomina.sueldo(emp1));
		emp2.imprime();
		System.out.println("Sueldo --> " + calculadorNomina.sueldo(emp2));
		
	}
}
