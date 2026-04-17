package conexion;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alonzo
 */
public class Conexion {
 
    private static final String URL = "jdbc:mysql://localhost:3306/sistemareservacanchas?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CLAVE = "admin";

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
