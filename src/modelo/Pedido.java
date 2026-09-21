package modelo;

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
    private EstadoPedido estado;
    private ArrayList<String> historial;

    /**
     * Constructor de la clase Pedido.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega direccion de entrega del pedido
     * @param distanciaKm distancia de entrega en kilometros
     */
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.estado = EstadoPedido.PENDIENTE;
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
     * Obtiene la distancia de entrega en kilometros.
     *
     * @return distancia de entrega
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
     * Obtiene el estado actual del pedido.
     *
     * @return estado actual del pedido
     */
    public EstadoPedido getEstado() {
        return estado;
    }

    /**
     * Modifica el estado actual del pedido.
     *
     * @param nuevoEstado nuevo estado del pedido
     */
    public void setEstado(String nuevoEstado) {
        this.estado = EstadoPedido.valueOf(nuevoEstado);
    }

    /**
     * Obtiene el historial de eventos del pedido.
     *
     * @return historial de eventos
     */
    public ArrayList<String> getHistorial() {
        return historial;
    }

    /**
     * Registra un evento en el historial del pedido.
     *
     * @param evento evento que se desea registrar
     */
    protected void registrarEvento(String evento) {
        historial.add(evento);
    }

    /**
     * Muestra un resumen con la informacion principal del pedido.
     */
    public void mostrarResumen() {
        System.out.println(getClass().getSimpleName() + " #" + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Estado: " + estado);
    }

    /**
     * Asigna automaticamente un repartidor disponible al pedido.
     */
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor disponible...");
        registrarEvento("Repartidor asignado automaticamente.");
    }

    /**
     * Asigna un repartidor especifico al pedido.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
        registrarEvento("Repartidor asignado: " + nombreRepartidor);
    }

    /**
     * Retorna la informacion principal del pedido en formato de texto.
     *
     * @return informacion del pedido
     */
    @Override
    public String toString() {
        return "Pedido #" + idPedido
                + " - Direccion: " + direccionEntrega
                + " - Estado: " + estado;
    }

    /**
     * Calcula el tiempo estimado de entrega del pedido.
     *
     * @return tiempo estimado de entrega en minutos
     */
    public abstract int calcularTiempoEntrega();
}