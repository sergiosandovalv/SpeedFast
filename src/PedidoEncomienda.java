/**
 * Clase que representa un pedido de encomienda dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * Implementa las capacidades de despacho, cancelacion y rastreo.
 *
 * @author Sergio Sandoval
 */
public class PedidoEncomienda extends Pedido
        implements Despachable, Cancelable, Rastreable {

    /**
     * Constructor de la clase PedidoEncomienda.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se realizara la entrega
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Sobrescribe la asignacion automatica de repartidor.
     * Para los pedidos de encomienda se verifica el peso
     * y las condiciones del embalaje.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando peso y embalaje... OK");

        registrarEvento("Repartidor asignado automaticamente para pedido de encomienda.");
    }

    /**
     * Sobrescribe la asignacion manual de repartidor.
     * Mantiene la validacion propia del pedido de encomienda
     * e informa el nombre del repartidor asignado.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando peso y embalaje... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);

        registrarEvento("Repartidor asignado: " + nombreRepartidor);
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

    /**
     * Ejecuta el despacho del pedido de encomienda.
     */
    @Override
    public void despachar() {
        System.out.println("Pedido de encomienda despachado correctamente.");
        registrarEvento("Pedido de encomienda despachado.");
    }

    /**
     * Ejecuta la cancelacion del pedido de encomienda.
     */
    @Override
    public void cancelar() {
        System.out.println("Pedido de encomienda cancelado correctamente.");
        registrarEvento("Pedido de encomienda cancelado.");
    }

    /**
     * Muestra todos los eventos registrados para el pedido.
     */
    @Override
    public void verHistorial() {
        System.out.println("Historial del PedidoEncomienda #" + getIdPedido() + ":");

        for (String evento : getHistorial()) {
            System.out.println("- " + evento);
        }
    }
}