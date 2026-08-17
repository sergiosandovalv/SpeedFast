/**
 * Clase que representa un pedido de comida dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * La asignacion de repartidor considera la disponibilidad de mochila termica.
 *
 * @author Sergio Sandoval
 */
public class PedidoComida extends Pedido {

    /**
     * Constructor de la clase PedidoComida.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param tipoPedido tipo de pedido solicitado
     */
    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    /**
     * Sobrescribe el metodo general para validar la asignacion
     * de un repartidor con mochila termica.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
    }

    /**
     * Sobrescribe la version que recibe el nombre del repartidor.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}