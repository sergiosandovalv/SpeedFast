package main;

import modelo.ControladorPedidos;
import vista.VentanaPrincipal;

import javax.swing.SwingUtilities;

/**
 * Clase principal del sistema SpeedFast.
 * Inicia la interfaz grafica de la aplicacion utilizando Java Swing.
 *
 * @author Sergio Sandoval
 */
public class Main {

    /**
     * Metodo principal que inicia la aplicacion SpeedFast.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ControladorPedidos controlador =
                    new ControladorPedidos();

            VentanaPrincipal ventana =
                    new VentanaPrincipal(controlador);

            ventana.setVisible(true);
        });
    }
}