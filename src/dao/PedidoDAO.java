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
                "INSERT INTO pedido (direccion, tipo, estado) VALUES (?, ?, ?)";

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

            sentencia.executeUpdate();

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
     * Actualiza el estado de un pedido.
     *
     * @param idPedido identificador del pedido
     * @param estado nuevo estado
     * @return true si fue actualizado correctamente
     */
    public boolean actualizarEstado(int idPedido, String estado) {

        String sql =
                "UPDATE pedido SET estado = ? WHERE id = ?";

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
                "SELECT id FROM pedido WHERE estado = 'PENDIENTE'";

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