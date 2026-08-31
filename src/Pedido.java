import java.util.ArrayList;

/**
 * Clase abstracta que representa un pedido dentro del sistema SpeedFast.
 * Contiene los datos y comportamientos generales que comparten
 * todos los tipos de pedidos.
 *
 * @author Sergio Sandoval
 */
public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private ArrayList<String> historial;

    /**
     * Constructor de la clase Pedido.
     *
     * @param idPedido identificador unico del pedido
     * @param direccionEntrega direccion donde se realizara la entrega
     * @param distanciaKm distancia en kilometros para realizar la entrega
     */
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.historial = new ArrayList<>();

        registrarEvento("Pedido creado.");
    }

    /**
     * Obtiene el identificador del pedido.
     *
     * @return identificador del pedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Modifica el identificador del pedido.
     *
     * @param idPedido nuevo identificador del pedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Obtiene la direccion de entrega.
     *
     * @return direccion de entrega
     */
    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Modifica la direccion de entrega.
     *
     * @param direccionEntrega nueva direccion de entrega
     */
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    /**
     * Obtiene la distancia de entrega.
     *
     * @return distancia en kilometros
     */
    public double getDistanciaKm() {
        return distanciaKm;
    }

    /**
     * Modifica la distancia de entrega.
     *
     * @param distanciaKm nueva distancia en kilometros
     */
    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    /**
     * Obtiene el historial asociado al pedido.
     *
     * @return lista de eventos registrados
     */
    public ArrayList<String> getHistorial() {
        return historial;
    }

    /**
     * Registra un nuevo evento en el historial del pedido.
     *
     * @param evento descripcion del evento realizado
     */
    protected void registrarEvento(String evento) {
        historial.add(evento);
    }

    /**
     * Muestra los datos generales del pedido junto con
     * el nombre real de la clase del objeto.
     */
    public void mostrarResumen() {
        System.out.println(getClass().getSimpleName() + " #" + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    /**
     * Asigna automaticamente un repartidor disponible al pedido.
     */
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor disponible...");
        registrarEvento("Repartidor asignado automaticamente.");
    }

    /**
     * Asigna manualmente un repartidor al pedido.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
        registrarEvento("Repartidor asignado: " + nombreRepartidor);
    }

    /**
     * Calcula el tiempo estimado de entrega.
     * Cada subclase debe implementar su propia logica de calculo.
     *
     * @return tiempo estimado de entrega en minutos
     */
    public abstract int calcularTiempoEntrega();
}