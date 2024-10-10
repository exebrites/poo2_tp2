package src;

import java.io.IOException;
import model.Escenario1;
import model.Escenario2;
import model.Escenario3;
import model.Escenario4;

/**
 * Clase principal que ejecuta los diferentes escenarios.
 * Los escenarios incluyen operaciones matemáticas y lectura de archivos.
 *
 * @author camilaailen
 * @version 1.0
 */
public class App {
    /**
     * Método principal que ejecuta los métodos de los escenarios.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        //Crear instancias de las clases de escenarios
        Escenario1 escenario1 = new Escenario1();
        Escenario2 escenario2 = new Escenario2();
        Escenario3 escenario3 = new Escenario3();
        Escenario4 escenario4 = new Escenario4();

        //Ejecutar los métodos de los escenarios
        escenario1.dividir(10, 2);
        escenario2.sumar(5, 5);
        escenario2.sumarNuevos(5, 5);
        escenario3.calcularIMC(70, 1.75);

        /**
         * Intenta leer un archivo y maneja posibles excepciones de E/S.
         */
        try {
            // Llama al método leerArchivo del escenario4
            escenario4.leerArchivo("ruta/al/archivo.txt");
        } catch (IOException e) {
            // Maneja la excepción de E/S y muestra un mensaje de error
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    
}
