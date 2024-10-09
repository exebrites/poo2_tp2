package clases;

/**
 * Clase que representa un plato en el menú de un restaurante.
 */
public class Plato {

    /** Nombre del plato. */
    private String nombre;

    /** Precio del plato. */
    private double precio;

    /** Categoría del plato. */
    private CategoriaPlato categoria;

    /**
     * Constructor para crear un plato.
     *
     * @param nombre    el nombre del plato
     * @param precio    el precio del plato
     * @param categoria la categoría del plato
     */
    public Plato(String nombre, double precio, CategoriaPlato categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtener el nombre del plato.
     *
     * @return el nombre del plato
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre del plato.
     *
     * @param nombre el nombre del plato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el precio del plato.
     *
     * @return el precio del plato
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establecer el precio del plato.
     *
     * @param precio el precio del plato
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtener la categoría del plato.
     *
     * @return la categoría del plato
     */
    public CategoriaPlato getCategoria() {
        return categoria;
    }

    /**
     * Establecer la categoría del plato.
     *
     * @param categoria la categoría del plato
     */
    public void setCategoria(CategoriaPlato categoria) {
        this.categoria = categoria;
    }
}
