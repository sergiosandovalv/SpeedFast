/**
 * Clase que representa un pedido express dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * Calcula el tiempo estimado segun la distancia de entrega.
 *
 * @author Sergio Sandoval
 */
public class PedidoExpress extends Pedido {

    /**
     * Constructor de la clase PedidoExpress.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado para un pedido express.
     * Se consideran 10 minutos base y 5 minutos adicionales
     * si la distancia supera los 5 kilometros.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;

        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }

        return tiempo;
    }
}