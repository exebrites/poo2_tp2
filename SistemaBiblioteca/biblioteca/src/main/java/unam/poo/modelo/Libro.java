package unam.poo.modelo;

/**
 * Clase que representa un libro.
 *
 * @author camilagomez
 * @author exequielbrites
 * @author luisrapp
 *
 */
public class Libro {
    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Autor del libro.
     */
    private String autor;

    /**
     * Número de páginas del libro.
     */
    private int numeroPaginas;

    /**
     * Estado del libro (DISPONIBLE o PRESTADO).
     */
    private EstadoLibro estado;

    /**
     * Constructor de la clase Libro.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param numeroPaginas El número de páginas del libro.
     * @param estado El estado inicial del libro.
     */
    public Libro(String titulo, String autor, int numeroPaginas, EstadoLibro estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;
    }

    /**
     * Cambia el estado del libro.
     *
     * @param estado El nuevo estado del libro.
     */
    public void cambiarEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    /**
     * Verifica si el libro está disponible.
     *
     * @return true si el libro está disponible, false en caso contrario.
     */
    public boolean estaDisponible() {
        return this.estado == EstadoLibro.DISPONIBLE;
    }
}