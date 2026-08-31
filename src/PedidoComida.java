/**
 * Clase que representa un pedido de comida dentro del sistema SpeedFast.
 * Hereda los atributos y comportamientos generales de la clase Pedido.
 * Implementa las capacidades de despacho, cancelacion y rastreo.
 *
 * @author Sergio Sandoval
 */
public class PedidoComida extends Pedido
        implements Despachable, Cancelable, Rastreable {

    /**
     * Constructor de la clase PedidoComida.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se realizara la entrega
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Sobrescribe la asignacion automatica de repartidor.
     * Para los pedidos de comida se verifica la disponibilidad
     * de una mochila termica y se asigna un repartidor disponible.
     */
    @Override
    public void asignarRepartidor() {
        String nombreRepartidor = "Carlos Soto";

        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
        System.out.println("Repartidor asignado automaticamente: " + nombreRepartidor);

        registrarEvento(
                "Repartidor asignado automaticamente: " + nombreRepartidor
        );
    }

    /**
     * Sobrescribe la asignacion manual de repartidor.
     * Mantiene la validacion propia del pedido de comida
     * e informa el nombre del repartidor asignado.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);

        registrarEvento("Repartidor asignado: " + nombreRepartidor);
    }

    /**
     * Calcula el tiempo estimado para un pedido de comida.
     * Se consideran 15 minutos base mas 2 minutos por kilometro.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(15 + (2 * getDistanciaKm()));
    }

    /**
     * Ejecuta el despacho del pedido de comida.
     */
    @Override
    public void despachar() {
        System.out.println("Pedido de comida despachado correctamente.");
        registrarEvento("Pedido de comida despachado.");
    }

    /**
     * Ejecuta la cancelacion del pedido de comida.
     */
    @Override
    public void cancelar() {
        System.out.println("Pedido de comida cancelado correctamente.");
        registrarEvento("Pedido de comida cancelado.");
    }

    /**
     * Muestra todos los eventos registrados para el pedido.
     */
    @Override
    public void verHistorial() {
        System.out.println("Historial del PedidoComida #" + getIdPedido() + ":");

        for (String evento : getHistorial()) {
            System.out.println("- " + evento);
        }
    }
}