package model;
/**
 * Escenario 2: Método obsoleto con sugerencia de uso alternativo
 * Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
 */
public class Escenario2 {

    /**
     * Método obsoleto que suma dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de los dos números.
     * @deprecated Este método está obsoleto. Use {@link #sumarNuevos(int, int)} en su lugar.
     */
    @Deprecated
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Nuevo método que suma dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de los dos números.
     */
    public static int sumarNuevos(int a, int b) {
        return a + b;
    }
}