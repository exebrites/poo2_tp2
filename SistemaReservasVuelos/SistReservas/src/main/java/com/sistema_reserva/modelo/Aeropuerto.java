package com.sistema_reserva.modelo;

import java.util.List;
/** representa una clase aeropuerto */
public class Aeropuerto {

    private String codigo;
    private String nombre;
    private String ciudad;
    private List<Vuelo> listaVuelosOrigen; // iniciar (?)
    private List<Vuelo> listaVuelosDestino;


    /** 
     * Crea un nuevo aeropuerto
     * 
     * @param codigo codigo que representa este aeropuerto de manera unica
     * @param nombre nombre del aeropuerto
     * @param ciudad ciudad donde se encuentra el aeropuerto
     * @param listaVuelosOrigen lista de vuelos que tienen este aeropuerto como origen
     * @param listaVuelosDestino lista de vuelos que tienen este aeropuerto como destino
    */
    public Aeropuerto(String codigo, String nombre, String ciudad, List<Vuelo> listaVuelosOrigen,
            List<Vuelo> listaVuelosDestino) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.listaVuelosOrigen = listaVuelosOrigen;
        this.listaVuelosDestino = listaVuelosDestino;
    }

    /**
     * Agrega un vuelo a la lista de vuelos con origen en este aeropuerto
     * 
     * @param vuelo vuelo a agregar
     */
    public void agregarVueloOrigen(Vuelo vuelo) {
        this.listaVuelosOrigen.add(vuelo);
    }

    /**
     * Agrega un vuelo a la lista de vuelos con destino en este aeropuerto
     * 
     * @param vuelo vuelo a agregar
     */
    public void agregarVueloDestino(Vuelo vuelo) {
        this.listaVuelosDestino.add(vuelo);
    }

    /**
     * Devuelve la lista de vuelos que tienen este aeropuerto como origen
     * 
     * @return lista de vuelos con origen en este aeropuerto
     */
    public List<Vuelo> obtenerVuelosOrigen() {
        return this.listaVuelosOrigen;
    }

    /**
     * Devuelve la lista de vuelos que tienen este aeropuerto como destino
     * 
     * @return lista de vuelos con destino en este aeropuerto
     */
    public List<Vuelo> obtenerVuelosDestino() {
        return this.listaVuelosDestino;
    }
}
