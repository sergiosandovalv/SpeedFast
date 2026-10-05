
package dao;

import datos.ConexionBD;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase encargada de cargar los pedidos
 * almacenados en MySQL para mostrarlos en JTable.
 *
 * @author Sergio Sandoval
 */
public class PedidoTablaDAO {

    /**
     * Consulta los pedidos registrados en MySQL
     * y actualiza el contenido de la tabla.
     *
     * @param modeloTabla modelo de la tabla de pedidos
     */
    public void cargarPedidos(DefaultTableModel modeloTabla) {

        String sql =
                "SELECT id, direccion, tipo, estado " +
                        "FROM pedidos ORDER BY id";

        modeloTabla.setRowCount(0);

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia =
                     conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                Object[] fila = {
                        resultado.getInt("id"),
                        resultado.getString("direccion"),
                        resultado.getString("tipo"),
                        resultado.getString("estado")
                };

                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {

            System.out.println("Error al consultar los pedidos.");
            System.out.println(e.getMessage());
        }
    }
}
