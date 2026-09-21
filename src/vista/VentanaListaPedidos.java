package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Ventana que muestra los pedidos registrados
 * en el sistema SpeedFast.
 * Utiliza una tabla para visualizar la informacion
 * almacenada en el controlador de pedidos.
 *
 * @author Sergio Sandoval
 */
public class VentanaListaPedidos extends JFrame {

    private final ControladorPedidos controlador;

    private JTable tablaPedidos;
    private DefaultTableModel modeloTabla;
    private JButton btnVolver;

    /**
     * Constructor de la ventana de listado de pedidos.
     * Recibe el controlador comun utilizado por el sistema
     * y carga los pedidos registrados en la tabla.
     *
     * @param controlador controlador que administra los pedidos registrados
     */
    public VentanaListaPedidos(ControladorPedidos controlador) {

        this.controlador = controlador;

        setTitle("SpeedFast - Lista de Pedidos");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnas = {
                "ID",
                "Direccion",
                "Distancia (km)",
                "Tipo",
                "Estado"
        };

        modeloTabla = new DefaultTableModel(columnas, 0) {

            /**
             * Evita que las celdas de la tabla puedan ser editadas.
             *
             * @param fila fila seleccionada
             * @param columna columna seleccionada
             * @return false para impedir la edicion
             */
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        tablaPedidos = new JTable(modeloTabla);

        JScrollPane scrollTabla = new JScrollPane(tablaPedidos);

        btnVolver = new JButton("Volver");

        JPanel panelBoton = new JPanel();

        panelBoton.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        panelBoton.add(btnVolver);

        setLayout(new BorderLayout());

        add(scrollTabla, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        btnVolver.addActionListener(e -> dispose());

        cargarPedidos();
    }

    /**
     * Carga en la tabla todos los pedidos almacenados
     * en el controlador compartido del sistema.
     */
    private void cargarPedidos() {

        modeloTabla.setRowCount(0);

        for (Pedido pedido : controlador.getPedidos()) {

            Object[] fila = {
                    pedido.getIdPedido(),
                    pedido.getDireccionEntrega(),
                    pedido.getDistanciaKm(),
                    pedido.getClass().getSimpleName(),
                    pedido.getEstado()
            };

            modeloTabla.addRow(fila);
        }
    }
}