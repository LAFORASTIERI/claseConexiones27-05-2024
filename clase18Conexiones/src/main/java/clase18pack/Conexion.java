package clase18pack;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion { //se necesitan 2 cosas: algunas veces la ruta de los drivers.
						//Hay que pasarle el usuario y la clave para poder conectarse.
						//tiene que devolver la conexion para poder utilizar la base de datos.
						//API JAVA Interface Connection
	
	 static Connection con = null; 
	    
	    public static Connection conectar () {
	        try {
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autos", "root", "");
	            System.out.println("Conexión exitosa");
	        } catch (Exception e) {
	            System.out.println("Error de conexión");
	            e.printStackTrace();
	        }
	        return con;
	}
	
	
	

}
