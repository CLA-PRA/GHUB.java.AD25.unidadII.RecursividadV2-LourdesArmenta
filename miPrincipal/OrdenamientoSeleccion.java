package miPrincipal;

public class OrdenamientoSeleccion<T> {
    // Método de ordenamiento por selección recursivo genérico
    public void ordenarSeleccionRecursivo(T[] arreglo, Comparador<T> comparador) {
        contadorRecursivo = 0;
        ordenarSeleccionRecursivoAux(arreglo, comparador, 0);
    }

    private void ordenarSeleccionRecursivoAux(T[] arreglo, Comparador<T> comparador, int i) {
        contadorRecursivo++;
        if (i == arreglo.length - 1) {
            return;
        }
        int minimo = i;
        for (int j = i + 1; j < arreglo.length; j++) {
            if (comparador.comparar(arreglo[j], arreglo[minimo]) < 0) {
                minimo = j;
            }
        }
        if (i != minimo) {
            T aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        ordenarSeleccionRecursivoAux(arreglo, comparador, i + 1);
    }
    public static int contadorIterativo = 0;
    public static int contadorRecursivo = 0;

    // Método de ordenamiento por selección genérico
    public void ordenarSeleccion(T[] arreglo, Comparador<T> comparador) {
        contadorIterativo = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            contadorIterativo++;
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (comparador.comparar(arreglo[j], arreglo[minimo]) < 0) {
                    minimo = j;
                }
            }
            if (i != minimo) {
                T aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
        }
    }

    //Métodos de prueba para enteror
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
    public static int[] ordenaSeleccion_iterativa(int[] arreglo) {
        contadorIterativo = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            contadorIterativo++;
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            if (i != minimo) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
        }
        return arreglo;
    }

    public static int[] ordenaSeleccion_recursiva(int[] arreglo, int i) {
        contadorRecursivo++;
        if (i == arreglo.length - 1) {
            return arreglo;
        }
        int minimo = i;
        for (int j = i + 1; j < arreglo.length; j++) {
            if (arreglo[j] < arreglo[minimo]) {
                minimo = j;
            }
        }
        if (i != minimo) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }
        return ordenaSeleccion_recursiva(arreglo, i + 1);
    }
}
