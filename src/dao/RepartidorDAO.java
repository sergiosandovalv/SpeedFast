
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
                "INSERT INTO repartidores (nombre) VALUES (?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(1, repartidor.getNombre());

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error al guardar el repartidor.");
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

        String sql =
                "SELECT id, nombre FROM repartidores";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");

                Repartidor repartidor =
                        new Repartidor(id, nombre);

                repartidores.add(repartidor);
            }

        } catch (SQLException e) {

            System.out.println("Error al consultar los repartidores.");
            System.out.println(e.getMessage());
        }

        return repartidores;
    }

    /**
     * Actualiza el nombre de un repartidor existente.
     *
     * @param id identificador del repartidor
     * @param nuevoNombre nuevo nombre del repartidor
     * @return true si se actualizo correctamente
     */
    public boolean actualizar(int id, String nuevoNombre) {

        String sql =
                "UPDATE repartidores SET nombre = ? WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(1, nuevoNombre);
            sentencia.setInt(2, id);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error al actualizar el repartidor.");
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Elimina un repartidor por su identificador.
     *
     * La base de datos protege las entregas
     * relacionadas mediante su clave foranea.
     *
     * @param id identificador del repartidor
     * @return true si fue eliminado correctamente
     */
    public boolean eliminar(int id) {

        String sql =
                "DELETE FROM repartidores WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setInt(1, id);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            if (e.getErrorCode() == 1451) {

                System.out.println(
                        "No se puede eliminar el repartidor " +
                                "porque tiene entregas asociadas."
                );

            } else {

                System.out.println(
                        "Error al eliminar el repartidor."
                );
                System.out.println(e.getMessage());
            }

            return false;
        }
    }
}
