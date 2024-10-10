package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Escenario 4: Método que lanza múltiples excepciones
 * Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.
 */
public class Escenario4 {

    /**
     * Lee el contenido de un archivo y lo imprime en la consola.
     *
     * @param rutaArchivo La ruta del archivo a leer.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static void leerArchivo(String rutaArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}