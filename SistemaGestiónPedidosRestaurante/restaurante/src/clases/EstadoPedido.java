package clases;

/**
 * Enumeración que representa los posibles estados de un pedido.
 * <ul>
 *     <li>{@link #PENDIENTE} - El pedido está pendiente de preparación.</li>
 *     <li>{@link #EN_PREPARACION} - El pedido se encuentra en proceso de preparación.</li>
 *     <li>{@link #SERVIDO} - El pedido ha sido preparado y entregado.</li>
 * </ul>
 */
public enum EstadoPedido {
    
    /** El pedido está pendiente de preparación. */
    PENDIENTE,

    /** El pedido está en proceso de preparación. */
    EN_PREPARACION,

    /** El pedido ha sido preparado y entregado. */
    SERVIDO;
}
