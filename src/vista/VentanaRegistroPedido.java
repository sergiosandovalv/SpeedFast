package vista;

import dao.PedidoDAO;
import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.PedidoComida;
import modelo.PedidoEncomienda;
import modelo.PedidoExpress;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroPedido extends JFrame {

    private final ControladorPedidos controlador;
    private final PedidoDAO pedidoDAO;

    private JTextField txtId;
    private JTextField txtDireccion;
    private JTextField txtDistancia;
    private JComboBox<String> cmbTipo;
    private JButton btnVolver;
    private JButton btnGuardar;

    public VentanaRegistroPedido(ControladorPedidos controlador) {
        this.controlador = controlador;
        this.pedidoDAO = new PedidoDAO();

        setTitle("SpeedFast - Registrar Pedido");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 10, 10));
        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        txtId = new JTextField();
        txtDireccion = new JTextField();
        txtDistancia = new JTextField();

        String[] tiposPedido = {"Comida", "Encomienda", "Express"};
        cmbTipo = new JComboBox<>(tiposPedido);

        btnVolver = new JButton("Volver");
        btnGuardar = new JButton("Guardar");

        panelFormulario.add(new JLabel("ID:"));
        panelFormulario.add(txtId);
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

    private void guardarPedido() {

        String idTexto = txtId.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String distanciaTexto = txtDistancia.getText().trim();

        if (idTexto.isEmpty() || direccion.isEmpty()
                || distanciaTexto.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe completar todos los campos.",
                    "Datos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        int id;

        try {
            id = Integer.parseInt(idTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "El ID debe ser un numero entero.",
                    "ID invalido",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        double distancia;

        try {
            distancia = Double.parseDouble(distanciaTexto);

            if (distancia <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "La distancia debe ser mayor que cero.",
                        "Distancia invalida",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "La distancia debe ser un numero valido.",
                    "Distancia invalida",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String tipo = (String) cmbTipo.getSelectedItem();
        Pedido pedido;

        switch (tipo) {
            case "Comida":
                pedido = new PedidoComida(id, direccion, distancia);
                break;

            case "Encomienda":
                pedido = new PedidoEncomienda(id, direccion, distancia);
                break;

            case "Express":
                pedido = new PedidoExpress(id, direccion, distancia);
                break;

            default:
                JOptionPane.showMessageDialog(
                        this,
                        "Debe seleccionar un tipo de pedido.",
                        "Tipo invalido",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
        }

        if (pedidoDAO.guardar(pedido)) {

            controlador.agregarPedido(pedido);

            JOptionPane.showMessageDialog(
                    this,
                    "Pedido registrado correctamente.",
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

    private void limpiarFormulario() {
        txtId.setText("");
        txtDireccion.setText("");
        txtDistancia.setText("");
        cmbTipo.setSelectedIndex(0);
        txtId.requestFocus();
    }
}