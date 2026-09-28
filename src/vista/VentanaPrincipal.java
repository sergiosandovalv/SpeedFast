package vista;

import dao.RepartidorDAO;
import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.Repartidor;
import modelo.ZonaDeCarga;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VentanaPrincipal extends JFrame {

    private final ControladorPedidos controlador;

    private JButton btnRegistrarPedido;
    private JButton btnRegistrarRepartidor;
    private JButton btnListarPedidos;
    private JButton btnIniciarEntrega;
    private JButton btnSalir;

    public VentanaPrincipal(ControladorPedidos controlador) {

        this.controlador = controlador;

        setTitle("SpeedFast - Gestion de Pedidos");
        setSize(800, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(5, 1, 10, 10));

        btnRegistrarPedido = new JButton("Registrar pedido");
        btnRegistrarRepartidor = new JButton("Registrar repartidor");
        btnListarPedidos = new JButton("Listar pedidos");
        btnIniciarEntrega =
                new JButton("Asignar repartidor / Iniciar entrega");
        btnSalir = new JButton("Salir de la aplicacion");

        panelPrincipal.add(btnRegistrarPedido);
        panelPrincipal.add(btnRegistrarRepartidor);
        panelPrincipal.add(btnListarPedidos);
        panelPrincipal.add(btnIniciarEntrega);
        panelPrincipal.add(btnSalir);

        add(panelPrincipal);

        btnRegistrarPedido.addActionListener(e -> {
            VentanaRegistroPedido ventanaRegistro =
                    new VentanaRegistroPedido(controlador);
            ventanaRegistro.setVisible(true);
        });

        btnRegistrarRepartidor.addActionListener(e -> {
            VentanaRegistroRepartidor ventanaRepartidor =
                    new VentanaRegistroRepartidor();
            ventanaRepartidor.setVisible(true);
        });

        btnListarPedidos.addActionListener(e -> {
            VentanaListaPedidos ventanaLista =
                    new VentanaListaPedidos(controlador);
            ventanaLista.setVisible(true);
        });

        btnIniciarEntrega.addActionListener(e -> iniciarEntregas());
        btnSalir.addActionListener(e -> salirAplicacion());
    }

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

        RepartidorDAO repartidorDAO = new RepartidorDAO();

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

        for (Repartidor repartidor : repartidores) {
            repartidor.setZonaDeCarga(zonaDeCarga);
        }

        ExecutorService executor =
                Executors.newFixedThreadPool(repartidores.size());

        for (Repartidor repartidor : repartidores) {
            executor.submit(repartidor);
        }

        executor.shutdown();

        JOptionPane.showMessageDialog(
                this,
                "Proceso de entrega iniciado.",
                "SpeedFast",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

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