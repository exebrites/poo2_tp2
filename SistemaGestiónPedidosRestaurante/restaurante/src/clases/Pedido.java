package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido realizado en un restaurante.
 */
public class Pedido {

    /** Identificador único de un pedido. */
    private int idPedido;

    /** Lista de platos incluidos en el pedido. */
    private List<Plato> platos;

    /** Estado actual del pedido. */
    private EstadoPedido estado;

    /** Hora de creación del pedido. */
    private LocalDateTime horaCreacion;

    /**
     * Constructor para crear un nuevo pedido.
     *
     * @param idPedido identificador del pedido
     * @param horaCreacion hora de creación del pedido
     */
    public Pedido(int idPedido, LocalDateTime horaCreacion) {
        this.idPedido = idPedido;
        this.horaCreacion = horaCreacion;
        this.platos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE; // Estado inicial por defecto
    }

    /**
     * Agregar un plato al pedido.
     *
     * @param plato el plato agregado
     */
    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    /**
     * Cambiar el estado del pedido.
     *
     * @param estado  estado nuevo  del pedido
     */
    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    /**
     * Obtener el identificador del pedido.
     *
     * @return el identificador del pedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Obtener la lista de platos en el pedido.
     *
     * @return la lista de platos en el pedido
     */
    public List<Plato> getPlatos() {
        return platos;
    }

    /**
     * Obtener el estado actual del pedido.
     *
     * @return el estado actual del pedido
     */
    public EstadoPedido getEstado() {
        return estado;
    }

    /**
     * Obtener la hora de creación del pedido.
     *
     * @return la hora de creación del pedido
     */
    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }
}
