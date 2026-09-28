package vista;

import dao.RepartidorDAO;
import modelo.Repartidor;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana para registrar repartidores
 * en la base de datos de SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class VentanaRegistroRepartidor extends JFrame {

    private JTextField txtNombre;
    private JButton btnGuardar;
    private JButton btnVolver;

    private final RepartidorDAO repartidorDAO;

    public VentanaRegistroRepartidor() {

        repartidorDAO = new RepartidorDAO();

        setTitle("SpeedFast - Registrar Repartidor");
        setSize(400, 180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelFormulario =
                new JPanel(new GridLayout(2, 2, 10, 10));

        panelFormulario.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        txtNombre = new JTextField();
        btnGuardar = new JButton("Guardar");
        btnVolver = new JButton("Volver");

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);
        panelFormulario.add(btnVolver);
        panelFormulario.add(btnGuardar);

        add(panelFormulario);

        btnVolver.addActionListener(e -> dispose());
        btnGuardar.addActionListener(e -> guardarRepartidor());
    }

    private void guardarRepartidor() {

        String nombre = txtNombre.getText().trim();

        if (nombre.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar el nombre del repartidor.",
                    "Datos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        Repartidor repartidor =
                new Repartidor(0, nombre);

        if (repartidorDAO.guardar(repartidor)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Repartidor registrado correctamente.",
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );

            txtNombre.setText("");
            txtNombre.requestFocus();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible registrar el repartidor.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}