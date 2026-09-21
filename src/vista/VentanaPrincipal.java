package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.Repartidor;
import modelo.ZonaDeCarga;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Ventana principal del sistema SpeedFast.
 * Permite registrar pedidos, listar los pedidos almacenados,
 * iniciar el proceso de entrega y salir de la aplicacion.
 *
 * @author Sergio Sandoval
 */
public class VentanaPrincipal extends JFrame {

    private final ControladorPedidos controlador;

    private JButton btnRegistrarPedido;
    private JButton btnListarPedidos;
    private JButton btnIniciarEntrega;
    private JButton btnSalir;

    /**
     * Constructor de la ventana principal.
     * Configura la ventana y sus componentes graficos.
     *
     * @param controlador controlador que administra los pedidos del sistema
     */
    public VentanaPrincipal(ControladorPedidos controlador) {

        this.controlador = controlador;

        setTitle("SpeedFast - Gestion de Pedidos");
        setSize(800, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(4, 1, 10, 10));

        btnRegistrarPedido = new JButton("Registrar pedido");
        btnListarPedidos = new JButton("Listar pedidos");
        btnIniciarEntrega =
                new JButton("Asignar repartidor / Iniciar entrega");
        btnSalir = new JButton("Salir de la aplicacion");

        panelPrincipal.add(btnRegistrarPedido);
        panelPrincipal.add(btnListarPedidos);
        panelPrincipal.add(btnIniciarEntrega);
        panelPrincipal.add(btnSalir);

        add(panelPrincipal);

        btnRegistrarPedido.addActionListener(e -> {
            VentanaRegistroPedido ventanaRegistro =
                    new VentanaRegistroPedido(controlador);

            ventanaRegistro.setVisible(true);
        });

        btnListarPedidos.addActionListener(e -> {
            VentanaListaPedidos ventanaLista =
                    new VentanaListaPedidos(controlador);

            ventanaLista.setVisible(true);
        });

        btnIniciarEntrega.addActionListener(e -> iniciarEntregas());

        btnSalir.addActionListener(e -> salirAplicacion());
    }

    /**
     * Inicia el proceso de entrega de los pedidos pendientes.
     * Los pedidos son enviados a una zona de carga compartida
     * y procesados por los repartidores del sistema.
     */
    private void iniciarEntregas() {

        List<Pedido> pedidosPendientes =
                controlador.getPedidosPendientes();

        if (pedidosPendientes.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "No existen pedidos pendientes para entregar.",
                    "Sin pedidos pendientes",
                    JOptionPane.INFORMATION_MESSAGE
            );

            return;
        }

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        for (Pedido pedido : pedidosPendientes) {
            zonaDeCarga.agregarPedido(pedido);
        }

        Repartidor repartidor1 =
                new Repartidor("Daniel", zonaDeCarga);

        Repartidor repartidor2 =
                new Repartidor("Nicole", zonaDeCarga);

        Repartidor repartidor3 =
                new Repartidor("Jaime", zonaDeCarga);

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        executor.submit(repartidor1);
        executor.submit(repartidor2);
        executor.submit(repartidor3);

        executor.shutdown();

        JOptionPane.showMessageDialog(
                this,
                "Proceso de entrega iniciado.",
                "SpeedFast",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Solicita confirmacion antes de cerrar la aplicacion.
     */
    private void salirAplicacion() {

        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea salir de la aplicacion?",
                "Salir de SpeedFast",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}