package modelo;

/**
 * Clase que representa a un repartidor dentro del sistema SpeedFast.
 * Cada repartidor funciona como una tarea concurrente y obtiene
 * pedidos desde una zona de carga compartida.
 *
 * @author Sergio Sandoval
 */
public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    /**
     * Constructor de la clase Repartidor.
     *
     * @param nombre nombre del repartidor
     * @param zonaDeCarga zona de carga compartida
     */
    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
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
     * Obtiene la zona de carga utilizada por el repartidor.
     *
     * @return zona de carga compartida
     */
    public ZonaDeCarga getZonaDeCarga() {
        return zonaDeCarga;
    }

    /**
     * Modifica la zona de carga utilizada por el repartidor.
     *
     * @param zonaDeCarga nueva zona de carga
     */
    public void setZonaDeCarga(ZonaDeCarga zonaDeCarga) {
        this.zonaDeCarga = zonaDeCarga;
    }

    /**
     * Procesa pedidos obtenidos desde la zona de carga compartida.
     * Cada pedido cambia su estado a EN_REPARTO, simula el tiempo
     * de entrega y finalmente cambia su estado a ENTREGADO.
     */
    @Override
    public void run() {

        System.out.println(
                "[Repartidor - " + nombre + "] inicia sus entregas."
        );

        while (true) {

            Pedido pedido = zonaDeCarga.retirarPedido();

            if (pedido == null) {
                break;
            }

            pedido.setEstado(EstadoPedido.EN_REPARTO.name());

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Retirando pedido #"
                            + pedido.getIdPedido()
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Estado: "
                            + pedido.getEstado()
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Entregando pedido #"
                            + pedido.getIdPedido()
            );

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println(
                        "[Repartidor - " + nombre
                                + "] fue interrumpido."
                );

                Thread.currentThread().interrupt();
                return;
            }

            pedido.setEstado(EstadoPedido.ENTREGADO.name());

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Pedido #"
                            + pedido.getIdPedido()
                            + " entregado."
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Estado: "
                            + pedido.getEstado()
            );
        }

        System.out.println(
                "[Repartidor - " + nombre
                        + "] termino sus entregas."
        );
    }
}