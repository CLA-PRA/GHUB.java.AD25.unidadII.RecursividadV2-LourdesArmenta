package miPrincipal;

public class OrdenamientoSeleccion<T> {
    
    public static void inicioEnteros(){
        // Ejemplo de selección de enteros con valores aleatorios
        int[] arreglo = {12, 5, 23, 8, 17, 3, 19, 10};

        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Ordenar de forma iterativa
        int[] resultadoIterativo = ordenaSeleccion_iterativa(arreglo.clone());
        System.out.println("Arreglo ordenado (iterativo):");
        for (int i = 0; i < resultadoIterativo.length; i++) {
            System.out.print(resultadoIterativo[i] + " ");
        }
        System.out.println();

        // Ordenar de forma recursiva
        int[] resultadoRecursivo = ordenaSeleccion_recursiva(arreglo.clone(), 0);
        System.out.println("Arreglo ordenado (recursivo):");
        for (int i = 0; i < resultadoRecursivo.length; i++) {
            System.out.print(resultadoRecursivo[i] + " ");
        }
        System.out.println();
    }

    // Método de prueba para estudiantes
    public static void inicioEstudiantes() {
        Estudiante[] estudiantes = Utilidades.leerEstudiantesDeArchivo("datos/estudiantes.txt");
        OrdenamientoSeleccion<Estudiante> seleccion = new OrdenamientoSeleccion<>();

        // Ordenar por edad usando clase concreta
        seleccion.ordenarSeleccion(estudiantes, new ComparadorEdad());
        System.out.println("Estudiantes ordenados por edad (selección):");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }

        // Ordenar por nombre usando clase concreta
        seleccion.ordenarSeleccion(estudiantes, new ComparadorNombre());
        System.out.println("Estudiantes ordenados por nombre (selección):");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    // Métodos originales para enteros se mantienen para referencia
    

}
