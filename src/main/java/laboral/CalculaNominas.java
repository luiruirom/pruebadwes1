package laboral;

import java.io.*;
import java.sql.*;
import java.util.*;
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
			altaEmpleado("Sergio", "32000037F", 'M', 1, 1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Parte 1
		 * try {
			Empleado james = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
			Empleado ada = new Empleado("Ada Lovelace", "32000031R", 'F');
			escribe(james, ada);
			ada.incrAnyo();
			james.setCategoria(9);
			escribe(james, ada);
		} catch (DatosNoCorrectosException ex) {
			System.out.println(ex.getMessage());
		} 
		 */
		
		/* Ejercicio 1 parte 2
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		ArrayList<String[]> listaCamposEmpleados = new ArrayList<>();
		String[] listaSueldos;
		Empleado emp;
		
	    try {
	        archivo = new File ("/home/luiruirom/eclipse-workspace/pruebadwes/src/main/java/laboral/empleados.txt");
	        fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
	        String linea;
	        while((linea=br.readLine())!=null) {
	        	listaSueldos = new String [2];
	        	String[] empleadoDatos = linea.split(",");
        		emp = new Empleado(empleadoDatos[0], empleadoDatos[1], empleadoDatos[2].charAt(0), Integer.parseInt(empleadoDatos[3]), Integer.parseInt(empleadoDatos[4]));
        		listaSueldos[0] = empleadoDatos[1];
        		listaSueldos[1] = String.valueOf(Nomina.sueldo(emp));
 		        listaCamposEmpleados.add(listaSueldos);
 		        
	        }
	     }catch(Exception e){
	        e.printStackTrace();
	     }finally{
	        try{                    
	           if(null != fr){   
	              fr.close();     
	           }                  
	        }catch (Exception e2){ 
	           e2.printStackTrace();
	        }
	     }
	    
	    try {
	        BufferedWriter out = null;
	        out = new BufferedWriter(new FileWriter("sueldos.dat")); 
	        Iterator<String[]> iterador = listaCamposEmpleados.iterator();
		    while(iterador.hasNext()) {
		    	String[] siguienteLinea = iterador.next();
		    	out.write(siguienteLinea[0] + "," + siguienteLinea[1] + "\n");
		    }
	        out.flush();
	        out.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("ERROR al crear el fichero");
	        return;
	    } catch (IOException e) {
	        System.out.println("ERROR al escribir en el fichero");
	        return;
	    }
	 */   
	}
		
	/**
	 * Método que imprime por pantalla los datos de dos empleados, incluido su nómina
	 * @param emp1 primer empleado para mostrar sus datos
	 * @param emp2 segundo empleado para mostrar sus datos
	 */
	private static void escribe(Empleado emp1, Empleado emp2) {
		emp1.imprime();
		System.out.println("Sueldo --> " + Nomina.sueldo(emp1));
		emp2.imprime();
		System.out.println("Sueldo --> " + Nomina.sueldo(emp2));	
	}
	
	private static void altaEmpleado(String nombre, String dni, char sexo, int categoria, int anyos) throws SQLException {
			int sueldoEmp = 0;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Empleado emp = new Empleado(nombre, dni, sexo, categoria, anyos);
				sueldoEmp = Nomina.sueldo(emp);
			} catch (DatosNoCorrectosException e) {
				System.out.println(e.getMessage());
			}
			
			Connection con = null;
			String sURL = "jdbc:mysql://localhost:3306/laboral";
			con = DriverManager.getConnection(sURL,"luiruirom","Luiruirom_99");
	
		try (PreparedStatement stmt = con.prepareStatement("INSERT INTO laboral.Empleados VALUES ('" + nombre + "', '" + dni + "',' " + sexo + "', " + categoria + ", " + anyos + ");"
				+ "INSERT INTO laboral.Nominas VALUES ('" + dni + "', " + sueldoEmp + ")")){
			ResultSet rs = stmt.executeQuery();

			} catch (SQLException sqle) { 
			  System.out.println("Error en la ejecución " + sqle.getErrorCode() + " " + sqle.getMessage());    
			}
		}
}
