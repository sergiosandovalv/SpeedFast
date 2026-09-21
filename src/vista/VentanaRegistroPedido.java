package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.PedidoComida;
import modelo.PedidoEncomienda;
import modelo.PedidoExpress;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana para registrar nuevos pedidos en el sistema SpeedFast.
 * Permite ingresar el ID, la direccion, la distancia
 * y seleccionar el tipo de pedido.
 * Utiliza un controlador compartido para almacenar los pedidos.
 *
 * @author Sergio Sandoval
 */
public class VentanaRegistroPedido extends JFrame {

    private final ControladorPedidos controlador;

    private JTextField txtId;
    private JTextField txtDireccion;
    private JTextField txtDistancia;
    private JComboBox<String> cmbTipo;
    private JButton btnVolver;
    private JButton btnGuardar;

    /**
     * Constructor de la ventana de registro de pedidos.
     * Configura la ventana, los componentes del formulario
     * y recibe el controlador comun del sistema.
     *
     * @param controlador controlador que administra los pedidos del sistema
     */
    public VentanaRegistroPedido(ControladorPedidos controlador) {

        this.controlador = controlador;

        setTitle("SpeedFast - Registrar Pedido");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(5, 2, 10, 10));

        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel lblId = new JLabel("ID:");
        JLabel lblDireccion = new JLabel("Direccion:");
        JLabel lblDistancia = new JLabel("Distancia (km):");
        JLabel lblTipo = new JLabel("Tipo:");

        txtId = new JTextField();
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

        panelFormulario.add(lblId);
        panelFormulario.add(txtId);

        panelFormulario.add(lblDireccion);
        panelFormulario.add(txtDireccion);

        panelFormulario.add(lblDistancia);
        panelFormulario.add(txtDistancia);

        panelFormulario.add(lblTipo);
        panelFormulario.add(cmbTipo);

        panelFormulario.add(btnVolver);
        panelFormulario.add(btnGuardar);

        add(panelFormulario);

        btnVolver.addActionListener(e -> dispose());
        btnGuardar.addActionListener(e -> guardarPedido());
    }

    /**
     * Valida los datos ingresados, crea el tipo de pedido
     * seleccionado y lo almacena mediante el controlador.
     */
    private void guardarPedido() {

        String idTexto = txtId.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String distanciaTexto = txtDistancia.getText().trim();

        if (idTexto.isEmpty()
                || direccion.isEmpty()
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
                pedido = new PedidoComida(
                        id,
                        direccion,
                        distancia
                );
                break;

            case "Encomienda":
                pedido = new PedidoEncomienda(
                        id,
                        direccion,
                        distancia
                );
                break;

            case "Express":
                pedido = new PedidoExpress(
                        id,
                        direccion,
                        distancia
                );
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

        controlador.agregarPedido(pedido);

        JOptionPane.showMessageDialog(
                this,
                "Pedido registrado correctamente.",
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );

        limpiarFormulario();
    }

    /**
     * Limpia los campos del formulario despues
     * de registrar correctamente un pedido.
     */
    private void limpiarFormulario() {

        txtId.setText("");
        txtDireccion.setText("");
        txtDistancia.setText("");
        cmbTipo.setSelectedIndex(0);
        txtId.requestFocus();
    }
}