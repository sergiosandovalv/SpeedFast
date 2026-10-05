
package vista;

import dao.PedidoDAO;
import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.PedidoComida;
import modelo.PedidoEncomienda;
import modelo.PedidoExpress;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana para registrar pedidos en SpeedFast.
 * Valida los datos y almacena los pedidos en MySQL.
 *
 * @author Sergio Sandoval
 */
public class VentanaRegistroPedido extends JFrame {

    private final ControladorPedidos controlador;
    private final PedidoDAO pedidoDAO;

    private final JTextField txtDireccion;
    private final JTextField txtDistancia;
    private final JComboBox<String> cmbTipo;
    private final JButton btnVolver;
    private final JButton btnGuardar;

    public VentanaRegistroPedido(ControladorPedidos controlador) {

        this.controlador = controlador;
        this.pedidoDAO = new PedidoDAO();

        setTitle("SpeedFast - Registrar Pedido");
        setSize(450, 260);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario =
                new JPanel(new GridLayout(4, 2, 10, 10));

        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        txtDireccion = new JTextField();
        txtDistancia = new JTextField();

        String[] tiposPedido = {
                "Comida",
                "Encomienda",
                "Express"
        };

        cmbTipo = new JComboBox<>(tiposPedido);

        btnVolver = new JButton("Volver");
        btnGuardar = new JButton("Guardar");

        panelFormulario.add(new JLabel("Direccion:"));
        panelFormulario.add(txtDireccion);

        panelFormulario.add(new JLabel("Distancia (km):"));
        panelFormulario.add(txtDistancia);

        panelFormulario.add(new JLabel("Tipo:"));
        panelFormulario.add(cmbTipo);

        panelFormulario.add(btnVolver);
        panelFormulario.add(btnGuardar);

        add(panelFormulario);

        btnVolver.addActionListener(e -> dispose());
        btnGuardar.addActionListener(e -> guardarPedido());
    }

    /**
     * Valida los datos y registra el pedido en MySQL.
     */
    private void guardarPedido() {

        String direccion = txtDireccion.getText().trim();
        String distanciaTexto = txtDistancia.getText().trim();

        if (direccion.isEmpty() || distanciaTexto.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe completar todos los campos.",
                    "Datos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        double distancia;

        try {

            distancia = Double.parseDouble(distanciaTexto);

            if (!Double.isFinite(distancia) || distancia <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "La distancia debe ser un numero mayor que cero.",
                        "Distancia invalida",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese solo el valor numerico, por ejemplo: 4.5",
                    "Distancia invalida",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        String tipo = (String) cmbTipo.getSelectedItem();
        Pedido pedido;

        switch (tipo) {

            case "Comida":
                pedido = new PedidoComida(
                        0,
                        direccion,
                        distancia
                );
                break;

            case "Encomienda":
                pedido = new PedidoEncomienda(
                        0,
                        direccion,
                        distancia
                );
                break;

            case "Express":
                pedido = new PedidoExpress(
                        0,
                        direccion,
                        distancia
                );
                break;

            default:

                JOptionPane.showMessageDialog(
                        this,
                        "Debe seleccionar un tipo de pedido.",
                        "Tipo invalido",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
        }

        if (pedidoDAO.guardar(pedido)) {

            controlador.agregarPedido(pedido);

            JOptionPane.showMessageDialog(
                    this,
                    "Pedido registrado correctamente.\n"
                            + "ID asignado por MySQL: "
                            + pedido.getIdPedido(),
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );

            limpiarFormulario();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible guardar el pedido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    /**
     * Limpia los campos del formulario.
     */
    private void limpiarFormulario() {

        txtDireccion.setText("");
        txtDistancia.setText("");
        cmbTipo.setSelectedIndex(0);
        txtDireccion.requestFocus();
    }
}
