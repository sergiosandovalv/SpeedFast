package dao;

import datos.ConexionBD;
import modelo.Entrega;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
     * @return true si la entrega fue guardada correctamente
     */
    public boolean guardar(Entrega entrega) {

        String sql = "INSERT INTO entrega "
                + "(id_pedido, id_repartidor, fecha, hora) "
                + "VALUES (?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

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

            sentencia.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al guardar la entrega.");
            System.out.println(e.getMessage());

            return false;
        }
    }
}