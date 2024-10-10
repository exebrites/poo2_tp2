package unam.poo.modelo;

import java.util.Date;

/**
 * Clase que representa un préstamo de un libro.
 *
 * @author camilagomez
 * @author exequielbrites
 * @author luisrapp
 *
 */
public class Prestamo {
    /**
     * Fecha en la que se realizó el préstamo.
     */
    private Date fechaPrestamo;

    /**
     * Fecha en la que se debe devolver el libro.
     */
    private Date fechaDevolucion;

    /**
     * Libro que se ha prestado.
     */
    private Libro libro;

    /**
     * Usuario que ha tomado el préstamo.
     */
    private Usuario usuario;

    /**
     * Constructor de la clase Prestamo.
     *
     * @param fechaPrestamo La fecha en la que se realizó el préstamo.
     * @param fechaDevolucion La fecha en la que se debe devolver el libro.
     * @param libro El libro que se ha prestado.
     * @param usuario El usuario que ha tomado el préstamo.
     */
    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Usuario usuario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.usuario = usuario;
    }
}