package com.sistema_reserva.modelo;
import java.util.*;

/** representa una clase reserva */
public class Reserva {

    private int codigoConfirmacion;
    private Date fechaReserva; 
    private String asientoAsignado ;

    /**
     * Constructor de la clase Reserva.
     * 
     * @param codigoConfirmacion    - Codigo de confirmacion de la reserva.
     * @param fechaReserva          - Fecha en que se realizo la reserva.
     * @param asientoAsignado      - Asiento asignado a la reserva.
     */
    
    public Reserva(int codigoConfirmacion, Date fechaReserva, String asientoAsignado) {
        this.codigoConfirmacion = codigoConfirmacion;
        this.fechaReserva = fechaReserva;
        this.asientoAsignado = asientoAsignado;
    }

}
