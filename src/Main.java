/**
 * Clase principal del sistema SpeedFast.
 * Permite probar el funcionamiento de los distintos tipos de pedidos,
 * aplicando polimorfismo, sobrescritura y sobrecarga de metodos.
 *
 * @author Sergio Sandoval
 */

public class Main {

    /**
     * Metodo principal que inicia la ejecucion del programa.
     *
     * @param args argumentos recibidos por linea de comandos
     */

    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(
                1,
                "Av. Providencia 1234",
                "Comida"
        );

        Pedido pedido2 = new PedidoEncomienda(
                2,
                "Av. Apoquindo 4567",
                "Encomienda"
        );

        Pedido pedido3 = new PedidoExpress(
                3,
                "Av. Las Condes 7890",
                "Express"
        );
        pedido1.asignarRepartidor();

        System.out.println();

        pedido2.asignarRepartidor();

        System.out.println();

        pedido3.asignarRepartidor();

        System.out.println();

        pedido1.asignarRepartidor("Daniel Leiva");

        System.out.println();

        pedido2.asignarRepartidor("Nicole Salinas");

        System.out.println();

        pedido3.asignarRepartidor("Jaime Acuña");

    }


}