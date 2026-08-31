/**
 * Interfaz que define el comportamiento de rastreo
 * para los pedidos del sistema SpeedFast.
 *
 * Las clases que implementen esta interfaz deben
 * proporcionar un mecanismo para visualizar
 * el historial asociado a un pedido.
 *
 * @author Sergio Sandoval
 */
public interface Rastreable {

    /**
     * Muestra el historial asociado a un pedido.
     */
    void verHistorial();
}