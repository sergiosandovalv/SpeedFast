/**
 * Clase base que representa un pedido dentro del sistema SpeedFast.
 * Contiene los datos generales de un pedido y los metodos utilizados
 * para la asignacion de repartidores.
 *
 * @author Sergio Sandoval
 */
public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    /**
     * Constructor de la clase Pedido.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se entregara el pedido
     * @param tipoPedido tipo de pedido solicitado
     */
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    /**
     * Realiza una asignacion generica de repartidor.
     */
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }

    /**
     * Asigna un repartidor indicando su nombre.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}