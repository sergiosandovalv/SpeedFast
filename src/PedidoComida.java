/**
 * Representa un pedido de comida dentro del sistema SpeedFast.
 * Calcula el tiempo estimado segun la distancia de entrega.
 *
 * @author Sergio Sandoval
 */
public class PedidoComida extends Pedido {

    /**
     * Constructor de la clase PedidoComida.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado para un pedido de comida.
     * Se consideran 15 minutos base mas 2 minutos por kilometro.
     *
     * @return tiempo estimado de entrega en minutos.
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(15 + (2 * getDistanciaKm()));
   }
}
