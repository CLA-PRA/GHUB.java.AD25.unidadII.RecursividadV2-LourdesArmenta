    
package miPrincipal;
// Clase genérica para ordenamiento por mezcla
public class OrdenamientoMezcla<T> {
    public static int contadorIterativo = 0;
    public static int contadorRecursivo = 0;

    public static void inicioEnteros(){
        // Ejemplo de mezcla de dos arreglos de enteros con valores más aleatorios
        int[] arregloA = {12, 5, 23, 8};
        int[] arregloB = {17, 3, 19, 10};

        OrdenamientoMezcla<Integer> mezcla = new OrdenamientoMezcla<>();
        // Usar el método iterativo
        int[] resultadoIterativo = mezcla.ordenar_iterativo(arregloA, arregloB);
        System.out.println("Mezcla iterativa de enteros:");
        for (int i = 0; i < resultadoIterativo.length; i++) {
            System.out.print(resultadoIterativo[i] + " ");
        }
        System.out.println();

        System.out.println("Iteraciones (iterativo): " + contadorIterativo);

        // Usar el método recursivo
        int[] resultadoRecursivo = mezcla.ordenar_recursivo(arregloA, arregloB);
        System.out.println("Mezcla recursiva de enteros:");
        for (int i = 0; i < resultadoRecursivo.length; i++) {
            System.out.print(resultadoRecursivo[i] + " ");
        }
        System.out.println();
        System.out.println("Llamadas recursivas: " + contadorRecursivo);
    }

    public static void inicioEstudiante() {
        // Leer los estudiantes desde el archivo
        Estudiante[] estudiantes = Utilidades.leerEstudiantesDeArchivo("datos/estudiantes.txt");

        // Crear una instancia del ordenamiento genérico
        OrdenamientoMezcla<Estudiante> mezcla = new OrdenamientoMezcla<>();

        // Ordenar por edad usando una clase concreta
        mezcla.ordenarMezcla(estudiantes, new ComparadorEdad());

        // Mostrar el resultado ordenado por edad
        System.out.println("Estudiantes ordenados por edad:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

    // Ordenar por nombre usando una clase concreta
    mezcla.ordenarMezcla(estudiantes, new ComparadorNombre());

        // Mostrar el resultado ordenado por nombre
        System.out.println("Estudiantes ordenados por nombre:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
    
    
	public int[] ordenar_iterativo(int[] ArregloA, int[] ArregloB) {
        int i, j, k;
        int[] ArregloC = new int[ArregloA.length + ArregloB.length];

        // Repetir mientras los arreglos A y B tengan elementos que comparar
    contadorIterativo = 0;
    i = 0;
    j = 0;
    k = 0;
        while (i < ArregloA.length && j < ArregloB.length) {
            contadorIterativo++;
            int valorA = ArregloA[i];
            int valorB = ArregloB[j];
            if (valorA < valorB) {
                ArregloC[k] = valorA;
                i++;
            } else {
                ArregloC[k] = valorB;
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de ArregloA, si los hay
        while (i < ArregloA.length) {
            int valorA = ArregloA[i];
            ArregloC[k] = valorA;
            i++;
            k++;
        }

        // Copiar los elementos restantes de ArregloB, si los hay
        while (j < ArregloB.length) {
            int valorB = ArregloB[j];
            ArregloC[k] = valorB;
            j++;
            k++;
        }

        return ArregloC;
    }

	public int[] ordenar_recursivo(int[] ArregloA, int[] ArregloB) {
        int[] ArregloC = new int[ArregloA.length + ArregloB.length];
    ordenar_recursivo_auxiliar(ArregloA, 0, ArregloB, 0, ArregloC, 0);
        return ArregloC;
    }

    private void ordenar_recursivo_auxiliar(int[] ArregloA, int i, int[] ArregloB, int j, int[] ArregloC, int k) {
        contadorRecursivo++;
        // Caso base: si ambos arreglos se han agotado
        if (i == ArregloA.length && j == ArregloB.length) {
            return;
        }

        // Caso base: si solo el arreglo A se ha agotado
        if (i == ArregloA.length) {
            ArregloC[k] = ArregloB[j];
            ordenar_recursivo_auxiliar(ArregloA, i, ArregloB, j + 1, ArregloC, k + 1);
            return;
        }

        // Caso base: si solo el arreglo B se ha agotado
        if (j == ArregloB.length) {
            ArregloC[k] = ArregloA[i];
            ordenar_recursivo_auxiliar(ArregloA, i + 1, ArregloB, j, ArregloC, k + 1);
            return;
        }

        // Comparar los elementos actuales de ambos arreglos y fusionar
        if (ArregloA[i] < ArregloB[j]) {
            ArregloC[k] = ArregloA[i];
            ordenar_recursivo_auxiliar(ArregloA, i + 1, ArregloB, j, ArregloC, k + 1);
        } else {
            ArregloC[k] = ArregloB[j];
            ordenar_recursivo_auxiliar(ArregloA, i, ArregloB, j + 1, ArregloC, k + 1);
        }
    }
    // Ordenamiento por mezcla genérico para arreglos de cualquier tipo T
    public void ordenarMezcla(T[] arreglo, Comparador<T> comparador) {
    if (arreglo == null || arreglo.length < 2) return;
    contadorRecursivo = 0;
    contadorIterativo = 0;
    T[] aux = (T[]) new Object[arreglo.length];
    mezclaRecursiva(arreglo, aux, 0, arreglo.length - 1, comparador);
    }

    private void mezclaRecursiva(T[] arreglo, T[] aux, int inicio, int fin, Comparador<T> comparador) {
    contadorRecursivo++;
    if (inicio >= fin) return;
    int medio = (inicio + fin) / 2;
    mezclaRecursiva(arreglo, aux, inicio, medio, comparador);
    mezclaRecursiva(arreglo, aux, medio + 1, fin, comparador);
    mezclar(arreglo, aux, inicio, medio, fin, comparador);
    }

    private void mezclar(T[] arreglo, T[] aux, int inicio, int medio, int fin, Comparador<T> comparador) {
        for (int k = inicio; k <= fin; k++) {
            aux[k] = arreglo[k];
        }
        int i = inicio, j = medio + 1;
        for (int k = inicio; k <= fin; k++) {
            // Solo contar las comparaciones
            if (i > medio) arreglo[k] = aux[j++];
            else if (j > fin) arreglo[k] = aux[i++];
            else {
                contadorIterativo++;
                if (comparador.comparar(aux[i], aux[j]) <= 0) arreglo[k] = aux[i++];
                else arreglo[k] = aux[j++];
            }
        }
    }
    // Métodos originales para enteros se mantienen

	
		
}
	