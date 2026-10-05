package vista;

import dao.PedidoDAO;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana para editar un pedido registrado
 * en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaEditarPedido extends JFrame {

    private final int idPedido;

    private final JTextField txtDireccion;
    private final JComboBox<String> cmbTipo;
    private final JComboBox<String> cmbEstado;

    private final JButton btnActualizar;
    private final JButton btnVolver;

    private final PedidoDAO pedidoDAO;

    public VentanaEditarPedido(
            int idPedido,
            String direccion,
            String tipo,
            String estado) {

        this.idPedido = idPedido;
        pedidoDAO = new PedidoDAO();

        setTitle("SpeedFast - Editar Pedido");
        setSize(450, 280);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario =
                new JPanel(new GridLayout(4, 2, 10, 10));

        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        txtDireccion = new JTextField(direccion);

        cmbTipo = new JComboBox<>(
                new String[]{
                        "Comida",
                        "Encomienda",
                        "Express"
                }
        );

        cmbEstado = new JComboBox<>(
                new String[]{
                        "PENDIENTE",
                        "EN_REPARTO",
                        "ENTREGADO"
                }
        );

        cmbTipo.setSelectedItem(tipo);
        cmbEstado.setSelectedItem(estado);

        btnActualizar = new JButton("Actualizar");
        btnVolver = new JButton("Volver");

        panelFormulario.add(new JLabel("Direccion:"));
        panelFormulario.add(txtDireccion);

        panelFormulario.add(new JLabel("Tipo:"));
        panelFormulario.add(cmbTipo);

        panelFormulario.add(new JLabel("Estado:"));
        panelFormulario.add(cmbEstado);

        panelFormulario.add(btnVolver);
        panelFormulario.add(btnActualizar);

        add(panelFormulario);

        btnVolver.addActionListener(
                e -> dispose()
        );

        btnActualizar.addActionListener(
                e -> actualizarPedido()
        );
    }

    /**
     * Valida y actualiza el pedido seleccionado.
     */
    private void actualizarPedido() {

        String direccion =
                txtDireccion.getText().trim();

        String tipo =
                cmbTipo.getSelectedItem().toString();

        String estado =
                cmbEstado.getSelectedItem().toString();

        if (direccion.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar una direccion.",
                    "Datos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        if (pedidoDAO.actualizar(
                idPedido,
                direccion,
                tipo,
                estado)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Pedido actualizado correctamente.",
                    "Actualizacion exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            dispose();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible actualizar el pedido.",
                    "Actualizacion no realizada",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}