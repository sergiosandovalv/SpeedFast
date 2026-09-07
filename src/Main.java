import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Clase principal del sistema SpeedFast.
 * Simula diferentes tipos de pedidos y demuestra
 * herencia, polimorfismo, abstraccion, interfaces
 * y concurrencia.
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
        System.out.println("PEDIDO 1");
        System.out.println("----------------------------------------");

        pedido1.mostrarResumen();

        System.out.println(
                "Tiempo estimado de entrega: "
                        + pedido1.calcularTiempoEntrega()
                        + " minutos"
        );

        pedido1.asignarRepartidor();

        ((Despachable) pedido1).despachar();

        System.out.println();

        System.out.println("PEDIDO 2");
        System.out.println("----------------------------------------");

        pedido2.mostrarResumen();

        System.out.println(
                "Tiempo estimado de entrega: "
                        + pedido2.calcularTiempoEntrega()
                        + " minutos"
        );

        pedido2.asignarRepartidor("Daniela Tapia");

        ((Despachable) pedido2).despachar();

        System.out.println();

        System.out.println("PEDIDO 3");
        System.out.println("----------------------------------------");

        pedido3.mostrarResumen();

        System.out.println(
                "Tiempo estimado de entrega: "
                        + pedido3.calcularTiempoEntrega()
                        + " minutos"
        );

        pedido3.asignarRepartidor("Luis Diaz");

        ((Cancelable) pedido3).cancelar();

        System.out.println();
        System.out.println("========================================");
        System.out.println("              HISTORIALES");
        System.out.println("========================================");

        System.out.println();
        ((Rastreable) pedido1).verHistorial();

        System.out.println();
        ((Rastreable) pedido2).verHistorial();

        System.out.println();
        ((Rastreable) pedido3).verHistorial();

        System.out.println();
        System.out.println("========================================");
        System.out.println("        PEDIDOS SIMULTANEOS");
        System.out.println("========================================");
        System.out.println();

        List<Pedido> pedidosDaniel = new ArrayList<>();
        pedidosDaniel.add(pedido1);
        pedidosDaniel.add(pedido2);

        List<Pedido> pedidosNicole = new ArrayList<>();
        pedidosNicole.add(pedido3);
        pedidosNicole.add(pedido4);

        List<Pedido> pedidosJaime = new ArrayList<>();
        pedidosJaime.add(pedido5);
        pedidosJaime.add(pedido6);

        Repartidor repartidorDaniel = new Repartidor(
                "Daniel",
                pedidosDaniel
        );

        Repartidor repartidorNicole = new Repartidor(
                "Nicole",
                pedidosNicole
        );

        Repartidor repartidorJaime = new Repartidor(
                "Jaime",
                pedidosJaime
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
        System.out.println("Todos los repartidores finalizaron sus entregas.");
        System.out.println("========================================");
    }
}