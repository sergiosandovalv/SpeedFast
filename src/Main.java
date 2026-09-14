import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Clase principal del sistema SpeedFast.
 * Simula pedidos y repartidores trabajando de forma concurrente
 * sobre una zona de carga compartida.
 *
 * @author Sergio Sandoval
 */
public class Main {

    /**
     * Metodo principal del programa.
     *
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(
                1,
                "Av. Italia 456",
                4.5
        );

        Pedido pedido2 = new PedidoEncomienda(
                2,
                "Av. Independencia 123",
                6.0
        );

        Pedido pedido3 = new PedidoExpress(
                3,
                "Av. Apoquindo 1500",
                7.0
        );

        Pedido pedido4 = new PedidoComida(
                4,
                "Av. Providencia 2200",
                5.2
        );

        Pedido pedido5 = new PedidoEncomienda(
                5,
                "Av. Matta 850",
                8.0
        );

        Pedido pedido6 = new PedidoExpress(
                6,
                "Av. Las Condes 9000",
                3.5
        );

        System.out.println("========================================");
        System.out.println("          SISTEMA SPEEDFAST");
        System.out.println("========================================");

        System.out.println();
        System.out.println("      ZONA DE CARGA COMPARTIDA");
        System.out.println("----------------------------------------");

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(pedido1);
        zonaDeCarga.agregarPedido(pedido2);
        zonaDeCarga.agregarPedido(pedido3);
        zonaDeCarga.agregarPedido(pedido4);
        zonaDeCarga.agregarPedido(pedido5);
        zonaDeCarga.agregarPedido(pedido6);

        System.out.println();
        System.out.println("========================================");
        System.out.println("        ENTREGAS CONCURRENTES");
        System.out.println("========================================");
        System.out.println();

        Repartidor repartidorDaniel = new Repartidor(
                "Daniel",
                zonaDeCarga
        );

        Repartidor repartidorNicole = new Repartidor(
                "Nicole",
                zonaDeCarga
        );

        Repartidor repartidorJaime = new Repartidor(
                "Jaime",
                zonaDeCarga
        );

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(repartidorDaniel);
        executor.submit(repartidorNicole);
        executor.submit(repartidorJaime);

        executor.shutdown();

        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }

        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println(
                "Todos los pedidos han sido entregados correctamente"
        );
        System.out.println("========================================");
    }
}