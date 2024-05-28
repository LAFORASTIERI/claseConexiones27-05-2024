package daos;
import java.sql.Connection;
import java.sql.Statement;
import clase18pack.Conexion;
import entitiesVO.Auto;

public class AutoImplDAO implements IAutoDAO{

	public void insertar (Auto auto) {
		
		try {
			// paso 1: conectar base de datos invocando la conexion y al metodo conectar.
			Connection con= Conexion.conectar();	
			
			// paso 2: crear query
			 String query = "INSERT INTO auto (marca, precio, anio, km) VALUES ('" + auto.getMarca() + "', " + auto.getPrecio() + ", " + auto.getAnio() + ", " + auto.isKm() + ")";
	         Statement stmt = con.createStatement();
			
			// Ejecutar el String Query creado en paso 2
			stmt.executeUpdate(query);
			System.out.println("Datos guardados correctamente");
			
			//Cerrar conexiones
			stmt.close();
			con.close();
			
		}catch (Exception e) {
				 System.out.println("ERROR AL INSERTAR");
				 e.printStackTrace();
			 }
	}
	
	
	public void borrar (int id) {
		
	}
	
	
	public void listar () {
		
	}
	
	
	public void editar (Auto auto) {
		
	}
	
}

