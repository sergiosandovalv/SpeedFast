
package vista;

import dao.RepartidorDAO;
import modelo.Repartidor;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Ventana para eliminar repartidores registrados
 * en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaEliminarRepartidor extends JFrame {

    private final JComboBox<Repartidor> cmbRepartidores;
    private final JButton btnEliminar;
    private final JButton btnVolver;
    private final RepartidorDAO repartidorDAO;

    /**
     * Construye la ventana y carga los repartidores.
     */
    public VentanaEliminarRepartidor() {

        repartidorDAO = new RepartidorDAO();

        setTitle("SpeedFast - Eliminar Repartidor");
        setSize(480, 190);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(
                new GridLayout(2, 2, 10, 10)
        );

        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        cmbRepartidores = new JComboBox<>();
        btnEliminar = new JButton("Eliminar");
        btnVolver = new JButton("Volver");

        panel.add(new JLabel("Seleccionar repartidor:"));
        panel.add(cmbRepartidores);
        panel.add(btnVolver);
        panel.add(btnEliminar);

        add(panel);

        cmbRepartidores.setRenderer(
                new DefaultListCellRenderer() {

                    @Override
                    public Component getListCellRendererComponent(
                            JList<?> lista,
                            Object valor,
                            int indice,
                            boolean seleccionado,
                            boolean tieneFoco) {

                        super.getListCellRendererComponent(
                                lista,
                                valor,
                                indice,
                                seleccionado,
                                tieneFoco
                        );

                        if (valor instanceof Repartidor) {

                            Repartidor repartidor =
                                    (Repartidor) valor;

                            setText(
                                    "ID " + repartidor.getId()
                                            + " - "
                                            + repartidor.getNombre()
                            );
                        }

                        return this;
                    }
                }
        );

        cargarRepartidores();

        btnVolver.addActionListener(e -> dispose());

        btnEliminar.addActionListener(
                e -> eliminarRepartidor()
        );
    }

    /**
     * Consulta los repartidores registrados en MySQL.
     */
    private void cargarRepartidores() {

        cmbRepartidores.removeAllItems();

        List<Repartidor> repartidores =
                repartidorDAO.listarTodos();

        for (Repartidor repartidor : repartidores) {
            cmbRepartidores.addItem(repartidor);
        }

        btnEliminar.setEnabled(
                cmbRepartidores.getItemCount() > 0
        );
    }

    /**
     * Solicita confirmacion antes de eliminar
     * el repartidor seleccionado.
     */
    private void eliminarRepartidor() {

        Repartidor repartidor =
                (Repartidor) cmbRepartidores.getSelectedItem();

        if (repartidor == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "No existen repartidores para eliminar.",
                    "Sin repartidores",
                    JOptionPane.INFORMATION_MESSAGE
            );

            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar al repartidor "
                        + repartidor.getNombre() + "?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        if (repartidorDAO.eliminar(repartidor.getId())) {

            JOptionPane.showMessageDialog(
                    this,
                    "Repartidor eliminado correctamente.",
                    "Eliminacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            cargarRepartidores();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible eliminar al repartidor. "
                            + "Compruebe si tiene entregas asociadas.",
                    "Eliminacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
