package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase encargada de establecer la conexion
 * entre la aplicacion SpeedFast y MySQL.
 *
 * @author Sergio Sandoval
 */
public class ConexionBD {

    private static final String URL =
            "jdbc:mysql://localhost:3306/speedfast_db";

    private static final String USUARIO = "root";

    private static final String PASSWORD =
            System.getenv("MYSQL_PASSWORD");

    /**
     * Obtiene una conexion con la base de datos SpeedFast.
     *
     * @return conexion establecida con MySQL
     * @throws SQLException si ocurre un error de conexion
     */
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}
