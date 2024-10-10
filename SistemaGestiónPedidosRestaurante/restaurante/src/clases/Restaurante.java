package clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un restaurante, que contiene mesas y pedidos.
 */
public class Restaurante {

    /** Lista de mesas en el restaurante. */
    private List<Mesa> listaMesas;

    /** Lista de pedidos en el restaurante. */
    private List<Pedido> listaPedidos;

    /**
     * Constructor para crear un nuevo restaurante.
     */
    public Restaurante() {
        this.listaMesas = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
    }

    /**
     * Registra un nuevo pedido en el restaurante.
     *
     * @param pedido el pedido a registrar
     */
    public void registrarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    /**
     * Asigna un pedido a una mesa específica en el restaurante.
     *
     * @param mesa la mesa a la que se le asignará el pedido
     * @param pedido el pedido a asignar a la mesa
     */
    public void asignarMesa(Mesa mesa, Pedido pedido) {
        mesa.asignarPedido(pedido);
        if (!listaMesas.contains(mesa)) {
            listaMesas.add(mesa);
        }
    }

    /**
     * Actualiza el estado de un pedido en el restaurante.
     *
     * @param pedido el pedido cuyo estado se actualizará
     * @param estado el nuevo estado del pedido
     */
    public void actualizarEstadoPedido(Pedido pedido, EstadoPedido estado) {
        pedido.cambiarEstado(estado);
    }

    /**
     * Obtiene la lista de mesas en el restaurante.
     *
     * @return la lista de mesas en el restaurante
     */
    public List<Mesa> getListaMesas() {
        return listaMesas;
    }

    /**
     * Obtiene la lista de pedidos en el restaurante.
     *
     * @return la lista de pedidos en el restaurante
     */
    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}
