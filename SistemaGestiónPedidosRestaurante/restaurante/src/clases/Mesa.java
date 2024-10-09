package clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una mesa en un restaurante.
 */
public class Mesa {

    /** Identificador de la mesa. */
    private int idMesa;

    /** Lista de pedidos asignados a la mesa. */
    private List<Pedido> pedidos;

    /**
     * Constructor para crear una nueva mesa.
     *
     * @param idMesa el identificador único de la mesa
     */
    public Mesa(int idMesa) {
        this.idMesa = idMesa;
        this.pedidos = new ArrayList<>();
    }

    /**
     * Asignar un pedido a la mesa.
     *
     * @param pedido el pedido a asignar
     */
    public void asignarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Obtener el identificador de la mesa.
     *
     * @return el identificador de la mesa
     */
    public int getIdMesa() {
        return idMesa;
    }

    /**
     * Establecer el identificador de la mesa.
     *
     * @param idMesa el nuevo identificador de la mesa
     */
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * Obtener la lista de pedidos asignados a la mesa.
     *
     * @return la lista de pedidos asignados a la mesa
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
