/**
 * Interfaz que define el comportamiento de cancelacion
 * para los pedidos del sistema SpeedFast.
 *
 * Las clases que implementen esta interfaz deben
 * proporcionar su propia logica para cancelar un pedido.
 *
 * @author Sergio Sandoval
 */
public interface Cancelable {

    /**
     * Ejecuta el proceso de cancelacion de un pedido.
     */
    void cancelar();
}