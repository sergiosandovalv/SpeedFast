package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa una entrega
 * realizada en el sistema SpeedFast.
 *
 * @author Sergio Sandoval
 */
public class Entrega {

    private int id;
    private int idPedido;
    private int idRepartidor;
    private LocalDate fecha;
    private LocalTime hora;

    /**
     * Constructor de la clase Entrega.
     *
     * @param idPedido identificador del pedido
     * @param idRepartidor identificador del repartidor
     * @param fecha fecha de la entrega
     * @param hora hora de la entrega
     */
    public Entrega(int idPedido, int idRepartidor,
                   LocalDate fecha, LocalTime hora) {
        this.idPedido = idPedido;
        this.idRepartidor = idRepartidor;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}