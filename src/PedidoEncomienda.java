/**
 * Clase que representa un pedido de encomienda dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * La asignacion de repartidor considera la validacion del peso y embalaje.
 *
 * @author Sergio Sandoval
 */
public class PedidoEncomienda extends Pedido {

    /**
     * Constructor de la clase PedidoEncomienda.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param tipoPedido tipo de pedido solicitado
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    /**
     * Sobrescribe el metodo general para validar la asignacion
     * de un repartidor segun el peso y embalaje.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando peso y embalaje... OK");
    }

    /**
     * Sobrescribe la version que recibe el nombre del repartidor.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando peso y embalaje... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}