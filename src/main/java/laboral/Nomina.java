package laboral;

/**
 * Clase para calcular los sueldos de los empleados
 * @author luiruirom
 *
 */
public class Nomina {
	/**
	 * Array con los sueldos según la categoría del empleado
	 */
	private static final int SUELDO_BASE[] = 
		{50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};
	
	/**
	 * Método para obtener el sueldo de un empleado teniendo en cuenta su categoría y sus años trabajados
	 * @param emp empleado que recibe el método para calcular el sueldo de un empleado
	 * @return sueldoEmpleado
	 */
	public int sueldo(Empleado emp) {
		int sueldoEmpleado;
		sueldoEmpleado = SUELDO_BASE[emp.getCategoria() - 1] + (5000 * emp.anyos);
		return sueldoEmpleado;
	}
}
