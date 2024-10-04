package com.sistema_reserva.modelo;

import java.util.List;

/**
 * Clase Aerolinea:
 * 
 * @author Exequiel
 */
public class Aerolinea {

    private int idAaerolinea;
    private String nombre;
    private List<Avion> listaAviones;
    private List<Vuelo> listaVuelos;

    /**
     * Constructor de la clase Aerolinea
     * 
     * @param idAaerolinea identificador de la aerolinea
     * @param nombre       nombre de la aerolinea
     * @param listaAviones listado de aviones
     * @param listaVuelos  listado de vuelos
     * @return nueva instancia de la clase Aerolinea
     */
    public Aerolinea(int idAaerolinea, String nombre, List<Avion> listaAviones, List<Vuelo> listaVuelos) {
        this.idAaerolinea = idAaerolinea;
        this.nombre = nombre;
        this.listaAviones = listaAviones;
        this.listaVuelos = listaVuelos;
    }
}
