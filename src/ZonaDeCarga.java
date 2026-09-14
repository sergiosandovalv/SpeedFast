import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la zona de carga compartida
 * dentro del sistema SpeedFast.
 *
 * Almacena los pedidos pendientes y controla el acceso
 * concurrente de los repartidores mediante sincronizacion.
 *
 * @author Sergio Sandoval
 */
public class ZonaDeCarga {

    private List<Pedido> pedidos;

    /**
     * Constructor de la clase ZonaDeCarga.
     */
    public ZonaDeCarga() {
        pedidos = new ArrayList<>();
    }

    /**
     * Agrega un pedido a la zona de carga de forma sincronizada.
     *
     * @param pedido pedido que se desea agregar
     */
    public synchronized void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);

        System.out.println(
                "Pedido #" + pedido.getIdPedido()
                        + " agregado a la zona de carga."
        );
    }

    /**
     * Retira un pedido de la zona de carga de forma sincronizada,
     * evitando que dos repartidores retiren el mismo pedido.
     *
     * @return pedido retirado o null si no quedan pedidos
     */
    public synchronized Pedido retirarPedido() {

        if (pedidos.isEmpty()) {
            return null;
        }

        return pedidos.remove(0);
    }
}