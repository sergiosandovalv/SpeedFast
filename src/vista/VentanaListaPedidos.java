package vista;

import dao.PedidoTablaDAO;
import modelo.ControladorPedidos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Ventana encargada de mostrar los pedidos
 * almacenados en la base de datos.
 *
 * @author Sergio Sandoval
 */
public class VentanaListaPedidos extends JFrame {

    private JTable tablaPedidos;
    private DefaultTableModel modeloTabla;
    private JButton btnRefrescar;
    private JButton btnVolver;
    private final PedidoTablaDAO pedidoTablaDAO;

    public VentanaListaPedidos(ControladorPedidos controlador) {

        pedidoTablaDAO = new PedidoTablaDAO();

        setTitle("SpeedFast - Lista de Pedidos");
        setSize(700, 400);
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

        btnRefrescar = new JButton("Refrescar");
        btnVolver = new JButton("Volver");

        JPanel panelBoton = new JPanel();

        panelBoton.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        panelBoton.add(btnRefrescar);
        panelBoton.add(btnVolver);

        setLayout(new BorderLayout());

        add(scrollTabla, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        btnRefrescar.addActionListener(
                e -> cargarPedidos()
        );

        btnVolver.addActionListener(
                e -> dispose()
        );

        cargarPedidos();
    }

    /**
     * Carga en la tabla los pedidos almacenados en MySQL.
     */
    private void cargarPedidos() {
        pedidoTablaDAO.cargarPedidos(modeloTabla);
    }
}