package model;
/**
* Escenario 1: Método que lanza una excepción
* Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.
*/

public class Escenario1 {

    /**
     * Divide dos números y lanza una excepción si el divisor es cero.
     *
     * @param numerador El número a ser dividido.
     * @param divisor El número por el cual se divide.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public static double dividir(double numerador, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("El divisor no puede ser cero.");
        }
        return numerador / divisor;
    }
    
    
}