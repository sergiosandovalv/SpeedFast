package dao;

import datos.ConexionBD;
import modelo.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada del acceso a datos
 * de los pedidos en SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class PedidoDAO {

    /**
     * Guarda un pedido en la base de datos.
     *
     * @param pedido pedido que se desea guardar
     * @return true si el pedido fue guardado correctamente
     */
    public boolean guardar(Pedido pedido) {

        String sql =
                "INSERT INTO pedidos (direccion, tipo, estado) VALUES (?, ?, ?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia = conexion.prepareStatement(
                     sql,
                     Statement.RETURN_GENERATED_KEYS
             )) {

            sentencia.setString(1, pedido.getDireccionEntrega());

            sentencia.setString(
                    2,
                    pedido.getClass().getSimpleName().replace("Pedido", "")
            );

            sentencia.setString(3, pedido.getEstado().toString());

            int filasInsertadas = sentencia.executeUpdate();

            if (filasInsertadas == 0) {
                return false;
            }

            try (ResultSet clavesGeneradas =
                         sentencia.getGeneratedKeys()) {

                if (clavesGeneradas.next()) {
                    pedido.setIdPedido(
                            clavesGeneradas.getInt(1)
                    );
                }
            }

            return true;

        } catch (SQLException e) {

            System.out.println("Error al guardar el pedido.");
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Actualiza los datos de un pedido.
     *
     * @param idPedido identificador del pedido
     * @param direccion nueva direccion
     * @param tipo nuevo tipo de pedido
     * @param estado nuevo estado del pedido
     * @return true si fue actualizado correctamente
     */
    public boolean actualizar(
            int idPedido,
            String direccion,
            String tipo,
            String estado
    ) {

        String sql =
                "UPDATE pedidos "
                        + "SET direccion = ?, tipo = ?, estado = ? "
                        + "WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(1, direccion);
            sentencia.setString(2, tipo);
            sentencia.setString(3, estado);
            sentencia.setInt(4, idPedido);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al actualizar el pedido."
            );
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Elimina un pedido de la base de datos.
     *
     * @param idPedido identificador del pedido
     * @return true si fue eliminado correctamente
     */
    public boolean eliminar(int idPedido) {

        String sql =
                "DELETE FROM pedidos WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setInt(1, idPedido);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al eliminar el pedido."
            );
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Actualiza el estado de un pedido.
     *
     * @param idPedido identificador del pedido
     * @param estado nuevo estado
     * @return true si fue actualizado correctamente
     */
    public boolean actualizarEstado(int idPedido, String estado) {

        String sql =
                "UPDATE pedidos SET estado = ? WHERE id = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(1, estado);
            sentencia.setInt(2, idPedido);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al actualizar el estado del pedido."
            );
            System.out.println(e.getMessage());

            return false;
        }
    }

    /**
     * Obtiene los identificadores de los pedidos pendientes.
     *
     * @return lista de identificadores pendientes
     */
    public List<Integer> listarIdsPendientes() {

        List<Integer> idsPendientes = new ArrayList<>();

        String sql =
                "SELECT id FROM pedidos WHERE estado = 'PENDIENTE'";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {
                idsPendientes.add(resultado.getInt("id"));
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error al consultar los pedidos pendientes."
            );
            System.out.println(e.getMessage());
        }

        return idsPendientes;
    }
}