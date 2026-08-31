/**
 * Interfaz que define el comportamiento de despacho
 * para los pedidos del sistema SpeedFast.
 *
 * Las clases que implementen esta interfaz deben
 * proporcionar su propia logica para despachar un pedido.
 *
 * @author Sergio Sandoval
 */
public interface Despachable {

    /**
     * Ejecuta el proceso de despacho de un pedido.
     */
    void despachar();
}