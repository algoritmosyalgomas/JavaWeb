package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.MySqlProperties;
import util.MySqlPropertiesLoader;

public class Conexion {

	private static MySqlPropertiesLoader mysqlPropertiesLoader = new MySqlPropertiesLoader();
	private static MySqlProperties mysqlProperties = mysqlPropertiesLoader.loadMySqlProperties();
	
    static {
        try {
        	Class.forName(mysqlProperties.getDriver());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }
    
    public static Connection getConexion() {
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(mysqlProperties.getUrl(), mysqlProperties.getUser(), mysqlProperties.getPassword());
            System.out.println("Conexión OK");

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
        
        return conexion;
    }
}