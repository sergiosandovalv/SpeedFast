package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador encargado de administrar los pedidos
 * registrados en el sistema SpeedFast.
 * Mantiene una lista comun de pedidos para compartir
 * la informacion entre las distintas ventanas.
 *
 * @author Sergio Sandoval
 */
public class ControladorPedidos {

    private final List<Pedido> pedidos;

    /**
     * Constructor del controlador de pedidos.
     * Inicializa la lista que almacenara los pedidos
     * registrados durante la ejecucion del sistema.
     */
    public ControladorPedidos() {
        pedidos = new ArrayList<>();
    }

    /**
     * Agrega un pedido a la lista de pedidos registrados.
     *
     * @param pedido pedido que se desea registrar
     */
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Obtiene la lista de pedidos registrados.
     *
     * @return lista de pedidos registrados
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Obtiene los pedidos que se encuentran pendientes
     * y que pueden ser enviados a la zona de carga.
     *
     * @return lista de pedidos pendientes
     */
    public List<Pedido> getPedidosPendientes() {

        List<Pedido> pedidosPendientes = new ArrayList<>();

        for (Pedido pedido : pedidos) {

            if (pedido.getEstado() == EstadoPedido.PENDIENTE) {
                pedidosPendientes.add(pedido);
            }
        }

        return pedidosPendientes;
    }
}