package dao;

import datos.ConexionBD;
import modelo.Entrega;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada del acceso a datos
 * de las entregas en SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class EntregaDAO {

    /**
     * Guarda una entrega en la base de datos.
     *
     * @param entrega entrega que se desea guardar
     * @return true si fue guardada correctamente
     */
    public boolean guardar(Entrega entrega) {

        String sql =
                "INSERT INTO entregas "
                        + "(id_pedido, id_repartidor, fecha, hora) "
                        + "VALUES (?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setInt(1, entrega.getIdPedido());
            sentencia.setInt(2, entrega.getIdRepartidor());

            sentencia.setDate(
                    3,
                    java.sql.Date.valueOf(entrega.getFecha())
            );

            sentencia.setTime(
                    4,
                    java.sql.Time.valueOf(entrega.getHora())
            );

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error al guardar la entrega.");
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Obtiene todas las entregas registradas.
     *
     * @return lista de entregas
     */
    public List<Entrega> listarTodos() {

        List<Entrega> entregas = new ArrayList<>();

        String sql =
                "SELECT id, id_pedido, id_repartidor, fecha, hora "
                        + "FROM entregas ORDER BY id";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                Entrega entrega = new Entrega(
                        resultado.getInt("id_pedido"),
                        resultado.getInt("id_repartidor"),
                        resultado.getDate("fecha").toLocalDate(),
                        resultado.getTime("hora").toLocalTime()
                );

                entrega.setId(
                        resultado.getInt("id")
                );

                entregas.add(entrega);
            }

        } catch (SQLException e) {

            System.out.println("Error al consultar las entregas.");
            System.out.println(e.getMessage());
        }

        return entregas;
    }

    /**
     * Actualiza el repartidor asociado a una entrega.
     *
     * @param idEntrega identificador de la entrega
     * @param idRepartidor nuevo identificador del repartidor
     * @return true si fue actualizada correctamente
     */
    public boolean actualizar(
            int idEntrega,
            int idRepartidor
    ) {

        String sql =
                "UPDATE entregas "
                        + "SET id_repartidor = ? "
                        + "WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setInt(1, idRepartidor);
            sentencia.setInt(2, idEntrega);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error al actualizar la entrega.");
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Elimina una entrega de la base de datos.
     *
     * @param idEntrega identificador de la entrega
     * @return true si fue eliminada correctamente
     */
    public boolean eliminar(int idEntrega) {

        String sql =
                "DELETE FROM entregas WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setInt(1, idEntrega);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error al eliminar la entrega.");
            System.out.println(e.getMessage());

            return false;
        }
    }
}