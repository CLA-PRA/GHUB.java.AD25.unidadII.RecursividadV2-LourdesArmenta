package miPrincipal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilidades {
    public static Estudiante[] leerEstudiantesDeArchivo(String rutaArchivo) {
        Estudiante[] estudiantes = new Estudiante[100]; // Asumiendo 100 registros
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null && i < estudiantes.length) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    String numContro = partes[0];
                    String nombre = partes[1];
                    String carrera = partes[2];
                    Fecha fechaNacimiento = new Fecha(partes[3]);
                    int edad = Integer.parseInt(partes[4]);
                    estudiantes[i] = new Estudiante(numContro, nombre, carrera, fechaNacimiento, edad);
                    i++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}
