package laboral;

/**
 * Clase para lanzar errores al introducir datos de empleados no validos
 * @author luiruirom
 *
 */
public class DatosNoCorrectosException extends Exception{
	/**
	 * Excepcion para recoger los posibles errores al generar el objeto Empleado
	 * @param msg mensaje lanzado cuando la excepcion se lance, se toma el mensaje especifico de cada caso de la clase Empleado
	 */
	public DatosNoCorrectosException(String msg) {
		super(msg);
	}
	
}
