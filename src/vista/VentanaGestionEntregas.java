package vista;

import dao.EntregaDAO;
import dao.RepartidorDAO;
import modelo.Entrega;
import modelo.Repartidor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * Ventana para gestionar las entregas
 * registradas en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaGestionEntregas extends JFrame {

    private final JTable tablaEntregas;
    private final DefaultTableModel modeloTabla;

    private final JButton btnRefrescar;
    private final JButton btnEditar;
    private final JButton btnEliminar;
    private final JButton btnVolver;

    private final EntregaDAO entregaDAO;
    private final RepartidorDAO repartidorDAO;

    /**
     * Construye la ventana de gestion de entregas.
     */
    public VentanaGestionEntregas() {

        entregaDAO = new EntregaDAO();
        repartidorDAO = new RepartidorDAO();

        setTitle("SpeedFast - Gestion de Entregas");
        setSize(750, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnas = {
                "ID",
                "ID Pedido",
                "ID Repartidor",
                "Fecha",
                "Hora"
        };

        modeloTabla = new DefaultTableModel(columnas, 0) {

            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        tablaEntregas = new JTable(modeloTabla);

        JScrollPane scrollTabla =
                new JScrollPane(tablaEntregas);

        btnRefrescar = new JButton("Refrescar");
        btnEditar = new JButton("Editar repartidor");
        btnEliminar = new JButton("Eliminar");
        btnVolver = new JButton("Volver");

        JPanel panelBotones = new JPanel();

        panelBotones.add(btnRefrescar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnVolver);

        setLayout(new BorderLayout());

        add(scrollTabla, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        btnRefrescar.addActionListener(
                e -> cargarEntregas()
        );

        btnEditar.addActionListener(
                e -> editarEntrega()
        );

        btnEliminar.addActionListener(
                e -> eliminarEntrega()
        );

        btnVolver.addActionListener(
                e -> dispose()
        );

        cargarEntregas();
    }

    /**
     * Carga las entregas registradas en MySQL.
     */
    private void cargarEntregas() {

        modeloTabla.setRowCount(0);

        List<Entrega> entregas =
                entregaDAO.listarTodos();

        for (Entrega entrega : entregas) {

            Object[] fila = {
                    entrega.getId(),
                    entrega.getIdPedido(),
                    entrega.getIdRepartidor(),
                    entrega.getFecha(),
                    entrega.getHora()
            };

            modeloTabla.addRow(fila);
        }
    }

    /**
     * Permite cambiar el repartidor
     * asociado a una entrega.
     */
    private void editarEntrega() {

        int fila = tablaEntregas.getSelectedRow();

        if (fila < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar una entrega.",
                    "Sin seleccion",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int idEntrega =
                (int) modeloTabla.getValueAt(fila, 0);

        List<Repartidor> repartidores =
                repartidorDAO.listarTodos();

        if (repartidores.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "No existen repartidores registrados.",
                    "Sin repartidores",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        JComboBox<String> cmbRepartidores =
                new JComboBox<>();

        for (Repartidor repartidor : repartidores) {

            cmbRepartidores.addItem(
                    "ID " + repartidor.getId()
                            + " - "
                            + repartidor.getNombre()
            );
        }

        int opcion = JOptionPane.showConfirmDialog(
                this,
                cmbRepartidores,
                "Seleccionar nuevo repartidor",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion != JOptionPane.OK_OPTION) {
            return;
        }

        int indice =
                cmbRepartidores.getSelectedIndex();

        Repartidor repartidor =
                repartidores.get(indice);

        if (entregaDAO.actualizar(
                idEntrega,
                repartidor.getId()
        )) {

            JOptionPane.showMessageDialog(
                    this,
                    "Entrega actualizada correctamente.",
                    "Actualizacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            cargarEntregas();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible actualizar la entrega.",
                    "Actualizacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    /**
     * Elimina la entrega seleccionada.
     */
    private void eliminarEntrega() {

        int fila = tablaEntregas.getSelectedRow();

        if (fila < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar una entrega.",
                    "Sin seleccion",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int idEntrega =
                (int) modeloTabla.getValueAt(fila, 0);

        int confirmacion =
                JOptionPane.showConfirmDialog(
                        this,
                        "¿Desea eliminar la entrega seleccionada?",
                        "Confirmar eliminacion",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        if (entregaDAO.eliminar(idEntrega)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Entrega eliminada correctamente.",
                    "Eliminacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            cargarEntregas();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible eliminar la entrega.",
                    "Eliminacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}