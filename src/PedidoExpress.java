/**
 * Clase que representa un pedido express dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * Implementa las capacidades de despacho, cancelacion y rastreo.
 *
 * @author Sergio Sandoval
 */
public class PedidoExpress extends Pedido
        implements Despachable, Cancelable, Rastreable {

    /**
     * Constructor de la clase PedidoExpress.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se realizara la entrega
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Sobrescribe la asignacion automatica de repartidor.
     * Para los pedidos express se busca al repartidor mas cercano
     * con disponibilidad inmediata.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Buscando repartidor mas cercano con disponibilidad inmediata... OK");

        registrarEvento("Repartidor asignado automaticamente para pedido express.");
    }

    /**
     * Sobrescribe la asignacion manual de repartidor.
     * Mantiene la logica propia del pedido express
     * e informa el nombre del repartidor asignado.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Buscando repartidor mas cercano con disponibilidad inmediata... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);

        registrarEvento("Repartidor asignado: " + nombreRepartidor);
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

    /**
     * Ejecuta el despacho del pedido express.
     */
    @Override
    public void despachar() {
        System.out.println("Pedido express despachado correctamente.");
        registrarEvento("Pedido express despachado.");
    }

    /**
     * Ejecuta la cancelacion del pedido express.
     */
    @Override
    public void cancelar() {
        System.out.println("Pedido express cancelado correctamente.");
        registrarEvento("Pedido express cancelado.");
    }

    /**
     * Muestra todos los eventos registrados para el pedido.
     */
    @Override
    public void verHistorial() {
        System.out.println("Historial del PedidoExpress #" + getIdPedido() + ":");

        for (String evento : getHistorial()) {
            System.out.println("- " + evento);
        }
    }
}