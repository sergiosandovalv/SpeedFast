import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Clase que representa a un repartidor dentro del sistema SpeedFast.
 * Cada repartidor funciona como una tarea concurrente y procesa
 * de forma secuencial los pedidos que tiene asignados.
 *
 * @author Sergio Sandoval
 */
public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidos;

    /**
     * Constructor de la clase Repartidor.
     *
     * @param nombre nombre del repartidor
     * @param pedidos lista de pedidos asignados
     */
    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    /**
     * Obtiene el nombre del repartidor.
     *
     * @return nombre del repartidor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del repartidor.
     *
     * @param nombre nuevo nombre del repartidor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de pedidos asignados.
     *
     * @return lista de pedidos
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Modifica la lista de pedidos asignados.
     *
     * @param pedidos nueva lista de pedidos
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * Ejecuta la entrega secuencial de los pedidos asignados.
     * Cada entrega se simula mediante una pausa aleatoria.
     */
    @Override
    public void run() {

        System.out.println("Repartidor " + nombre + " inicia sus entregas.");

        for (Pedido pedido : pedidos) {

            System.out.println(
                    "Repartidor " + nombre
                            + " procesando pedido #"
                            + pedido.getIdPedido()
            );

            try {
                int tiempoEspera = ThreadLocalRandom.current().nextInt(1000, 3001);
                Thread.sleep(tiempoEspera);

            } catch (InterruptedException e) {
                System.out.println(
                        "Repartidor " + nombre + " fue interrumpido."
                );

                Thread.currentThread().interrupt();
                return;
            }

            System.out.println(
                    "Repartidor " + nombre
                            + " completo el pedido #"
                            + pedido.getIdPedido()
            );
        }

        System.out.println("Repartidor " + nombre + " termino sus entregas.");
    }
}