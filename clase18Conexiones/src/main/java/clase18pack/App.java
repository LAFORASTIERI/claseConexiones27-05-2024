package clase18pack;
import java.util.Scanner;
import daos.AutoImplDAO;
import entitiesVO.Auto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Conexion.conectar();
        Scanner scanner = new Scanner(System.in);
        
        Auto auto1 = new Auto();
        
        System.out.println("Ingrese marca:");
        auto1.setMarca(scanner.nextLine());
        
        System.out.println("Ingrese precio:");
        auto1.setPrecio(scanner.nextDouble());
    
        System.out.println("Ingrese año:");
        auto1.setAnio(scanner.nextInt());
   
        System.out.println("Es 0 km? (true / false):");
        auto1.setKm(scanner.nextBoolean());
     
        AutoImplDAO autoDAO = new AutoImplDAO();
        
        autoDAO.insertar(auto1);
        
        scanner.close();
    
    }
}
