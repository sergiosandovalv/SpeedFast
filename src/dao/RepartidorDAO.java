package dao;

import datos.ConexionBD;
import modelo.Repartidor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada del acceso a datos
 * de los repartidores en SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class RepartidorDAO {

    /**
     * Guarda un repartidor en la base de datos.
     *
     * @param repartidor repartidor que se desea guardar
     * @return true si fue guardado correctamente
     */
    public boolean guardar(Repartidor repartidor) {

        String sql =
                "INSERT INTO repartidor (nombre) VALUES (?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(
                    1,
                    repartidor.getNombre()
            );

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al guardar el repartidor."
            );

            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Obtiene todos los repartidores almacenados
     * en la base de datos.
     *
     * @return lista de repartidores
     */
    public List<Repartidor> listarTodos() {

        List<Repartidor> repartidores = new ArrayList<>();

        String sql = "SELECT id, nombre FROM repartidor";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre =
                        resultado.getString("nombre");

                Repartidor repartidor =
                        new Repartidor(id, nombre);

                repartidores.add(repartidor);
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error al consultar los repartidores."
            );

            System.out.println(e.getMessage());
        }

        return repartidores;
    }
}