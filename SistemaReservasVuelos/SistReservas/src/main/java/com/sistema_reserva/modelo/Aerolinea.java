package com.sistema_reserva.modelo;

import java.util.List;

/**
 * Representa una clase  Aerolinea:
 * 
 * 
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
     * 
     */
    public Aerolinea(int idAaerolinea, String nombre, List<Avion> listaAviones, List<Vuelo> listaVuelos) {
        this.idAaerolinea = idAaerolinea;
        this.nombre = nombre;
        this.listaAviones = listaAviones;
        this.listaVuelos = listaVuelos;
    }

    /**
     * Agrega un avion a la lista de aviones de la aerolinea
     * 
     * @param avion avion a agregar
     */
    public void agregarAvion(Avion avion) {
    
        this.listaAviones.add(avion);
    }

    /**
     * Agrega un vuelo a la lista de vuelos de la aerolinea
     * 
     * @param vuelo vuelo a agregar
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.listaVuelos.add(vuelo);
    }

    /**
     * Devuelve la lista de aviones de la aerolinea
     * 
     * @return lista de aviones
     */
    public List<Avion> obtenerAviones() {
        return this.listaAviones;
    }

    /**
     * Devuelve la lista de vuelos de la aerolinea
     * 
     * @return lista de vuelos
     */
    public List<Vuelo> obtenerVuelos() {
        return this.listaVuelos;
    }
}
