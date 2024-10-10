package clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cliente de un restaurante.
 */
public class Cliente {

    /** Identificador  del cliente. */
    private int idCliente;

    /** Nombre del cliente. */
    private String nombre;

    /** Lista de pedidos realizados por el cliente. */
    private List<Pedido> pedidos;

    /**
     * Constructor para crear un nuevo cliente.
     *
     * @param idCliente  identificador único del cliente
     * @param nombre  nombre del cliente
     */
    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    /**
     * Agrega un pedido a la lista de pedidos del cliente.
     *
     * @param pedido el pedido a agregar
     */
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Obtener el identificador del cliente.
     *
     * @return el identificador del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }


    /**
     * Obtener el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre del cliente.
     *
     * @param nombre el nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener la lista de pedidos del cliente.
     *
     * @return la lista de pedidos del cliente
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

