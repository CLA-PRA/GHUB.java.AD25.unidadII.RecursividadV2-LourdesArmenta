package miPrincipal;
public class PerformanceSeleccionVsMezcla{
    public static void inicio() {
        // ...existing code...

        // Leer los estudiantes una sola vez
        Estudiante[] estudiantesOriginal = Utilidades.leerEstudiantesDeArchivo("datos/estudiantes.txt");

        // Copia para mezcla
        Estudiante[] estudiantesMezcla = new Estudiante[estudiantesOriginal.length];
        for (int i = 0; i < estudiantesOriginal.length; i++) {
            estudiantesMezcla[i] = estudiantesOriginal[i];
        }

        // Copia para selección
        Estudiante[] estudiantesSeleccion = new Estudiante[estudiantesOriginal.length];
        for (int i = 0; i < estudiantesOriginal.length; i++) {
            estudiantesSeleccion[i] = estudiantesOriginal[i];
        }

        // Medir tiempo de mezcla por edad
        OrdenamientoMezcla<Estudiante> mezcla = new OrdenamientoMezcla<>();
        Performance pMezclaEdad = new Performance();
        mezcla.ordenarMezcla(estudiantesMezcla, new ComparadorEdad());
        pMezclaEdad.stop();
        int iteracionesMezclaEdad = OrdenamientoMezcla.contadorIterativo;
        int recursivasMezclaEdad = OrdenamientoMezcla.contadorRecursivo;
        System.out.println("Estudiantes ordenados por edad (mezcla):");
        for (Estudiante e : estudiantesMezcla) {
            System.out.println(e);
        }
        System.out.println("Tiempo mezcla por edad: " + pMezclaEdad.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo mezcla por edad: " + pMezclaEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones mezcla por edad: " + iteracionesMezclaEdad + "\u001B[0m");
        System.out.println("\u001B[31mRecursivas mezcla por edad: " + recursivasMezclaEdad + "\u001B[0m");

        // Medir tiempo de mezcla por nombre
        Performance pMezclaNombre = new Performance();
        mezcla.ordenarMezcla(estudiantesMezcla, new ComparadorNombre());
        pMezclaNombre.stop();
        int iteracionesMezclaNombre = OrdenamientoMezcla.contadorIterativo;
        int recursivasMezclaNombre = OrdenamientoMezcla.contadorRecursivo;
        System.out.println("Estudiantes ordenados por nombre (mezcla):");
        for (Estudiante e : estudiantesMezcla) {
            System.out.println(e);
        }
        System.out.println("Tiempo mezcla por nombre: " + pMezclaNombre.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo mezcla por nombre: " + pMezclaNombre.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones mezcla por nombre: " + iteracionesMezclaNombre + "\u001B[0m");
        System.out.println("\u001B[31mRecursivas mezcla por nombre: " + recursivasMezclaNombre + "\u001B[0m");

        // Medir tiempo de selección por edad
        OrdenamientoSeleccion<Estudiante> seleccion = new OrdenamientoSeleccion<>();
        Performance pSeleccionEdad = new Performance();
        seleccion.ordenarSeleccion(estudiantesSeleccion, new ComparadorEdad());
        pSeleccionEdad.stop();
        int iteracionesEdad = OrdenamientoSeleccion.contadorIterativo;
        System.out.println("Estudiantes ordenados por edad (selección):");
        for (Estudiante e : estudiantesSeleccion) {
            System.out.println(e);
        }
        System.out.println("Tiempo selección por edad: " + pSeleccionEdad.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo selección por edad: " + pSeleccionEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones selección por edad: " + iteracionesEdad + "\u001B[0m");

        // Medir tiempo de selección recursiva por edad
        Estudiante[] estudiantesSeleccionRecEdad = new Estudiante[estudiantesOriginal.length];
        for (int i = 0; i < estudiantesOriginal.length; i++) {
            estudiantesSeleccionRecEdad[i] = estudiantesOriginal[i];
        }
        Performance pSeleccionRecEdad = new Performance();
        seleccion.ordenarSeleccionRecursivo(estudiantesSeleccionRecEdad, new ComparadorEdad());
        pSeleccionRecEdad.stop();
        int recursivasEdad = OrdenamientoSeleccion.contadorRecursivo;
        System.out.println("Estudiantes ordenados por edad (selección recursiva):");
        for (Estudiante e : estudiantesSeleccionRecEdad) {
            System.out.println(e);
        }
        System.out.println("\u001B[31mTiempo selección recursiva por edad: " + pSeleccionRecEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mRecursivas selección por edad: " + recursivasEdad + "\u001B[0m");

        // Medir tiempo de selección por nombre
        Performance pSeleccionNombre = new Performance();
        seleccion.ordenarSeleccion(estudiantesSeleccion, new ComparadorNombre());
        pSeleccionNombre.stop();
        int iteracionesNombre = OrdenamientoSeleccion.contadorIterativo;
        System.out.println("Estudiantes ordenados por nombre (selección):");
        for (Estudiante e : estudiantesSeleccion) {
            System.out.println(e);
        }
        System.out.println("Tiempo selección por nombre: " + pSeleccionNombre.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo selección por nombre: " + pSeleccionNombre.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones selección por nombre: " + iteracionesNombre + "\u001B[0m");

        // Medir tiempo de selección recursiva por nombre
        Estudiante[] estudiantesSeleccionRecNombre = new Estudiante[estudiantesOriginal.length];
        for (int i = 0; i < estudiantesOriginal.length; i++) {
            estudiantesSeleccionRecNombre[i] = estudiantesOriginal[i];
        }
        Performance pSeleccionRecNombre = new Performance();
        seleccion.ordenarSeleccionRecursivo(estudiantesSeleccionRecNombre, new ComparadorNombre());
        pSeleccionRecNombre.stop();
        int recursivasNombre = OrdenamientoSeleccion.contadorRecursivo;
        System.out.println("Estudiantes ordenados por nombre (selección recursiva):");
        for (Estudiante e : estudiantesSeleccionRecNombre) {
            System.out.println(e);
        }
        System.out.println("\u001B[31mTiempo selección recursiva por nombre: " + pSeleccionRecNombre.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mRecursivas selección por nombre: " + recursivasNombre + "\u001B[0m");

        // Mostrar contadores finales en rojo
        System.out.println("\u001B[31m==============================\u001B[0m");
    System.out.println("\u001B[31mContadores finales Mezcla:\u001B[0m");
    System.out.println("\u001B[31mIteraciones Mezcla por edad: " + iteracionesMezclaEdad + "\u001B[0m");
    System.out.println("\u001B[31mIteraciones Mezcla por nombre: " + iteracionesMezclaNombre + "\u001B[0m");
    System.out.println("\u001B[31mRecursivas Mezcla por edad: " + recursivasMezclaEdad + "\u001B[0m");
    System.out.println("\u001B[31mRecursivas Mezcla por nombre: " + recursivasMezclaNombre + "\u001B[0m");
        System.out.println("\u001B[31mContadores finales Selección:\u001B[0m");
    System.out.println("\u001B[31mIteraciones Selección por edad: " + iteracionesEdad + "\u001B[0m");
    System.out.println("\u001B[31mIteraciones Selección por nombre: " + iteracionesNombre + "\u001B[0m");
    System.out.println("\u001B[31mRecursivas Selección por edad: " + recursivasEdad + "\u001B[0m");
    System.out.println("\u001B[31mRecursivas Selección por nombre: " + recursivasNombre + "\u001B[0m");
        System.out.println("\u001B[31m==============================\u001B[0m");
    }

}