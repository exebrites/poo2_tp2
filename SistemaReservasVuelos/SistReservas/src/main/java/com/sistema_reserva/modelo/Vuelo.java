package com.sistema_reserva.modelo;
import java.sql.Time;
import java.util.*;

/** Representa una clase vuelo */
public class Vuelo {

    private String numeroVuelo;
    private Date fechaSalida;
    private Time horaSalida;
    private Aeropuerto aeropuertoOrigen;
    private Date fechaLLegada;
    private Time horaLLegada;
    private Aeropuerto aeropuertoDestino;
    private List<Reserva> listaReservas;

    /**
     * Constructor de la clase Vuelo.
     * 
     * @param numeroVuelo    numero de vuelo
     * @param fechaSalida    fecha de salida
     * @param horaSalida     hora de salida
     * @param aeropuertoOrigen aeropuerto de origen
     * @param fechaLLegada   fecha de llegada
     * @param horaLLegada    hora de llegada
     * @param aeropuertoDestino aeropuerto de destino
     * @param listaReservas  lista de reservas
     */
    
    public Vuelo(String numeroVuelo, Date fechaSalida, Time horaSalida, Aeropuerto aeropuertoOrigen,
            Date fechaLLegada, Time horaLLegada, Aeropuerto aeropuertoDestino, List<Reserva> listaReservas) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.fechaLLegada = fechaLLegada;
        this.horaLLegada = horaLLegada;
        this.aeropuertoDestino = aeropuertoDestino;
        this.listaReservas = listaReservas;
    }
    /**
     * Agrega una reserva a la lista de reservas para este vuelo.
     * 
     * @param reserva reserva a agregar
     */
    public void agregarReserva(Reserva reserva){
        this.listaReservas.add(reserva);
    }
    /**
     * Quita una reserva de la lista de reservas para este vuelo.
     * 
     * @param reserva reserva a quitar
     */
    public void removerReserva(Reserva reserva){
        this.listaReservas.remove(reserva);
    }
    /**
     * Devuelve la lista de reservas hechas para este vuelo.
     * 
     * @return lista de reservas
     */
    public List<Reserva> obtenerReservas(){
        return this.listaReservas;
    }
}
