package unam.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un usuario de la biblioteca.
 *
 * @author camilagomez
 * @author exequielbrites
 * @author luisrapp
 *
 */
public class Usuario {
    /**
     * ID del usuario.
     */
    private int idUsuario;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Lista de libros prestados por el usuario.
     */
    private List<Libro> librosPrestados;

    /**
     * Constructor de la clase Usuario.
     *
     * @param idUsuario El ID del usuario.
     * @param nombre El nombre del usuario.
     */
    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Presta un libro al usuario.
     *
     * @param libro El libro a prestar.
     */
    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    /**
     * Devuelve un libro prestado por el usuario.
     *
     * @param libro El libro a devolver.
     */
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    /**
     * Obtiene la lista de libros prestados por el usuario.
     *
     * @return librosPrestados La lista de libros prestados por el usuario.
     */
    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}