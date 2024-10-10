package model;
/**
* Escenario 3: Método con varios parámetros y retorno
* Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura.
*/

public class Escenario3 {

    /**
     * Calcula el índice de masa corporal (IMC) basado en el peso y la altura.
     *
     * @param peso El peso en kilogramos.
     * @param altura La altura en metros.
     * @return El índice de masa corporal (IMC).
     */
    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        return peso / (altura * altura);
    }

}