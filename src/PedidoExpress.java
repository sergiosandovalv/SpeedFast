/**
 * Clase que representa un pedido express dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * La asignacion considera al repartidor mas cercano con disponibilidad inmediata.
 *
 * @author Sergio Sandoval
 */
public class PedidoExpress extends Pedido {

    /**
     * Constructor de la clase PedidoExpress.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param tipoPedido tipo de pedido solicitado
     */
    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    /**
     * Sobrescribe el metodo general para asignar al repartidor
     * mas cercano con disponibilidad inmediata.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado.");
    }

    /**
     * Sobrescribe la version que recibe el nombre del repartidor.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado.");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
