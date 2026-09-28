package modelo;

import dao.EntregaDAO;
import dao.PedidoDAO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Repartidor implements Runnable {

    private int id;
    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    public Repartidor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ZonaDeCarga getZonaDeCarga() {
        return zonaDeCarga;
    }

    public void setZonaDeCarga(ZonaDeCarga zonaDeCarga) {
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run() {

        PedidoDAO pedidoDAO = new PedidoDAO();
        EntregaDAO entregaDAO = new EntregaDAO();

        System.out.println(
                "[Repartidor - " + nombre + "] inicia sus entregas."
        );

        while (true) {

            Pedido pedido = zonaDeCarga.retirarPedido();

            if (pedido == null) {
                break;
            }

            pedido.setEstado(EstadoPedido.EN_REPARTO.name());

            pedidoDAO.actualizarEstado(
                    pedido.getIdPedido(),
                    EstadoPedido.EN_REPARTO.name()
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Retirando pedido #"
                            + pedido.getIdPedido()
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Estado: "
                            + pedido.getEstado()
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Entregando pedido #"
                            + pedido.getIdPedido()
            );

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println(
                        "[Repartidor - " + nombre
                                + "] fue interrumpido."
                );

                Thread.currentThread().interrupt();
                return;
            }

            pedido.setEstado(EstadoPedido.ENTREGADO.name());

            pedidoDAO.actualizarEstado(
                    pedido.getIdPedido(),
                    EstadoPedido.ENTREGADO.name()
            );

            Entrega entrega = new Entrega(
                    pedido.getIdPedido(),
                    id,
                    LocalDate.now(),
                    LocalTime.now()
            );

            entregaDAO.guardar(entrega);

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Pedido #"
                            + pedido.getIdPedido()
                            + " entregado."
            );

            System.out.println(
                    "[Repartidor - " + nombre
                            + "] Estado: "
                            + pedido.getEstado()
            );
        }

        System.out.println(
                "[Repartidor - " + nombre
                        + "] termino sus entregas."
        );
    }
}