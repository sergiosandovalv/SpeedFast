/**
 * Clase principal del sistema SpeedFast.
 * Simula diferentes tipos de pedidos y demuestra
 * herencia, polimorfismo, abstraccion e interfaces.
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

    }
}