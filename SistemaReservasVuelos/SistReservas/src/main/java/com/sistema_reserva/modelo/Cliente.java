package com.sistema_reserva.modelo;

import java.util.List;

/**
 * Representa una clase cliente
 */
public class Cliente {

    private int idCliente;
    private String nombre;
    private List<Reserva> listaReservas;

    /**
     * Crea un nuevo cliente
     * 
     * @param idCliente     identificador del cliente
     * @param nombre        nombre del cliente
     * @param listaReservas lista de reservas hechas por este cliente
     */
    public Cliente(int idCliente, String nombre, List<Reserva> listaReservas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.listaReservas = listaReservas;
    }

    /**
     * Reserva un vuelo para este cliente.
     * 
     * @param reserva reserva a realizar
     */
    public void reservarVuelo(Reserva reserva) {
        this.listaReservas.add(reserva);
    }

    /**
     * Devuelve la lista de reservas hechas por este cliente.
     * 
     * @return lista de reservas
     */
    public List<Reserva> obtenerReservas() {
        return this.listaReservas;
    }
}
