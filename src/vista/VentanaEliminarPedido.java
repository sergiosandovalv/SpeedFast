package vista;

import dao.PedidoDAO;
import dao.PedidoTablaDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Ventana para eliminar pedidos registrados
 * en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaEliminarPedido extends JFrame {

    private final JTable tablaPedidos;
    private final DefaultTableModel modeloTabla;
    private final JButton btnEliminar;
    private final JButton btnVolver;

    private final PedidoDAO pedidoDAO;
    private final PedidoTablaDAO pedidoTablaDAO;

    /**
     * Construye la ventana y carga los pedidos.
     */
    public VentanaEliminarPedido() {

        pedidoDAO = new PedidoDAO();
        pedidoTablaDAO = new PedidoTablaDAO();

        setTitle("SpeedFast - Eliminar Pedido");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnas = {
                "ID",
                "Direccion",
                "Tipo",
                "Estado"
        };

        modeloTabla = new DefaultTableModel(columnas, 0) {

            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        tablaPedidos = new JTable(modeloTabla);

        JScrollPane scrollTabla =
                new JScrollPane(tablaPedidos);

        btnEliminar = new JButton("Eliminar");
        btnVolver = new JButton("Volver");

        JPanel panelBotones = new JPanel();

        panelBotones.add(btnVolver);
        panelBotones.add(btnEliminar);

        setLayout(new BorderLayout());

        add(scrollTabla, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        cargarPedidos();

        btnVolver.addActionListener(
                e -> dispose()
        );

        btnEliminar.addActionListener(
                e -> eliminarPedido()
        );
    }

    /**
     * Consulta los pedidos registrados en MySQL.
     */
    private void cargarPedidos() {

        pedidoTablaDAO.cargarPedidos(modeloTabla);

        btnEliminar.setEnabled(
                modeloTabla.getRowCount() > 0
        );
    }

    /**
     * Solicita confirmacion antes de eliminar
     * el pedido seleccionado.
     */
    private void eliminarPedido() {

        int fila = tablaPedidos.getSelectedRow();

        if (fila < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un pedido.",
                    "Pedido no seleccionado",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int idPedido =
                Integer.parseInt(
                        modeloTabla.getValueAt(fila, 0).toString()
                );

        String direccion =
                modeloTabla.getValueAt(fila, 1).toString();

        int confirmacion =
                JOptionPane.showConfirmDialog(
                        this,
                        "¿Desea eliminar el pedido #"
                                + idPedido
                                + " - "
                                + direccion
                                + "?",
                        "Confirmar eliminacion",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        if (pedidoDAO.eliminar(idPedido)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Pedido eliminado correctamente.",
                    "Eliminacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            cargarPedidos();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible eliminar el pedido. "
                            + "Compruebe si tiene una entrega asociada.",
                    "Eliminacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}