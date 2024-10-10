package unam.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca.
 *
 * @author camilagomez
 * @author exequielbrites
 * @author luisrapp
 *
 */
public class Biblioteca {
    /**
     * Lista de libros en la biblioteca.
     */
    private List<Libro> listaLibros;

    /**
     * Lista de usuarios registrados en la biblioteca.
     */
    private List<Usuario> listaUsuarios;

    /**
     * Constructor de la clase Biblioteca.
     * Inicializa las listas de libros y usuarios.
     */
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    /**
     * Presta un libro a un usuario.
     *
     * @param libro El libro a prestar.
     * @param usuario El usuario que recibe el libro.
     */
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.estaDisponible() && listaUsuarios.contains(usuario)) {
            libro.cambiarEstado(EstadoLibro.PRESTADO);
            usuario.prestarLibro(libro);
        }
    }

    /**
     * Devuelve un libro prestado por un usuario.
     *
     * @param libro El libro a devolver.
     * @param usuario El usuario que devuelve el libro.
     */
    public void devolverLibro(Libro libro, Usuario usuario) {
        if (listaUsuarios.contains(usuario) && usuario.getLibrosPrestados().contains(libro)) {
            libro.cambiarEstado(EstadoLibro.DISPONIBLE);
            usuario.devolverLibro(libro);
        }
    }

    /**
     * Registra un nuevo usuario en la biblioteca.
     *
     * @param usuario El usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        if (!listaUsuarios.contains(usuario)) {
            listaUsuarios.add(usuario);
        }
    }

    /**
     * Agrega un nuevo libro a la biblioteca.
     *
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        if (!listaLibros.contains(libro)) {
            listaLibros.add(libro);
        }
    }
}