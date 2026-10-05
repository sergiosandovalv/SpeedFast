
package vista;

import dao.RepartidorDAO;
import modelo.Repartidor;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Ventana para seleccionar y actualizar un repartidor
 * registrado en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaEditarRepartidor extends JFrame {

    private final JComboBox<String> cmbRepartidores;
    private final JTextField txtNombre;
    private final JButton btnActualizar;
    private final JButton btnVolver;

    private final RepartidorDAO repartidorDAO;
    private final List<Repartidor> repartidores;

    public VentanaEditarRepartidor() {

        repartidorDAO = new RepartidorDAO();
        repartidores = repartidorDAO.listarTodos();

        setTitle("SpeedFast - Editar Repartidor");
        setSize(450, 230);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario =
                new JPanel(new GridLayout(3, 2, 10, 10));

        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        cmbRepartidores = new JComboBox<>();
        txtNombre = new JTextField();

        btnActualizar = new JButton("Actualizar");
        btnVolver = new JButton("Volver");

        for (Repartidor repartidor : repartidores) {

            cmbRepartidores.addItem(
                    "ID " + repartidor.getId()
                            + " - " + repartidor.getNombre()
            );
        }

        panelFormulario.add(
                new JLabel("Seleccionar repartidor:")
        );
        panelFormulario.add(cmbRepartidores);

        panelFormulario.add(new JLabel("Nuevo nombre:"));
        panelFormulario.add(txtNombre);

        panelFormulario.add(btnVolver);
        panelFormulario.add(btnActualizar);

        add(panelFormulario);

        cmbRepartidores.addActionListener(
                e -> cargarRepartidor()
        );

        btnVolver.addActionListener(e -> dispose());

        btnActualizar.addActionListener(
                e -> actualizarRepartidor()
        );

        if (!repartidores.isEmpty()) {

            cargarRepartidor();

        } else {

            btnActualizar.setEnabled(false);

            JOptionPane.showMessageDialog(
                    this,
                    "No existen repartidores registrados.",
                    "Sin repartidores",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    /**
     * Carga el nombre del repartidor seleccionado.
     */
    private void cargarRepartidor() {

        int indice = cmbRepartidores.getSelectedIndex();

        if (indice >= 0) {

            Repartidor repartidor =
                    repartidores.get(indice);

            txtNombre.setText(repartidor.getNombre());
        }
    }

    /**
     * Valida y actualiza el repartidor seleccionado.
     */
    private void actualizarRepartidor() {

        int indice = cmbRepartidores.getSelectedIndex();

        if (indice < 0) {
            return;
        }

        String nuevoNombre = txtNombre.getText().trim();

        if (nuevoNombre.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar el nuevo nombre.",
                    "Datos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        Repartidor repartidor =
                repartidores.get(indice);

        int id = repartidor.getId();

        if (repartidorDAO.actualizar(id, nuevoNombre)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Repartidor actualizado correctamente.",
                    "Actualizacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            dispose();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible actualizar el repartidor.",
                    "Actualizacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
