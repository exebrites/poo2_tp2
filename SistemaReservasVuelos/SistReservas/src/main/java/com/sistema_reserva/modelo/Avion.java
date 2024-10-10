package com.sistema_reserva.modelo;

import java.util.List;
/** representa una clase de avion */
public class Avion {

    private int idAvion;
    private String modelo;
    private int capacidadMaxima;
    private List<Vuelo> listaVuelos;

    /**
     * Constructor de la clase Avion
     * 
     * @param idAvion           identificador del avion
     * @param modelo            modelo del avion
     * @param capacidadMaxima   capacidad maxima del avion
     * @param listaVuelos       lista de vuelos asociados a este avion
     */
    
    public Avion(int idAvion, String modelo, int capacidadMaxima, List<Vuelo> listaVuelos) {
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.listaVuelos = listaVuelos;
    }

    /**
     * Asigna un vuelo a este avion, agregandolo a su lista de vuelos
     * 
     * @param vuelo vuelo a asignar
     */

    public void asignarVuelo(Vuelo vuelo){

        this.listaVuelos.add(vuelo);
    }

    /**
     * Devuelve la lista de vuelos asociados a este avion
     * 
     * @return lista de vuelos asociados
     */
    public List<Vuelo> obtenerVuelos(){
        return this.listaVuelos;
    }
}
