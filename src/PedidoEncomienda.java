/**
 * Clase que representa un pedido de encomienda dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * Calcula el tiempo estimado segun la distancia de entrega.
 *
 * @author Sergio Sandoval
 */
public class PedidoEncomienda extends Pedido {

    /**
     * Constructor de la clase PedidoEncomienda.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado para un pedido de encomienda.
     * Se consideran 20 minutos base mas 1.5 minutos por kilometro.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * getDistanciaKm()));
    }
}