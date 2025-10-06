package miPrincipal;
//deberas mostrar losregistros ordenados
public class PerformanceSeleccionVsMezcla{
    public static void inicio() {
        // ...existing code...

        // Leer los estudiantes una sola vez
        Estudiante[] estudiantesOriginal = //coloca el código faltante

        // Copia para mezcla
       

        // Copia para selección
        

        // Medir tiempo de mezcla por edad
        //coloca código faltante
       
        System.out.println("Tiempo mezcla por edad: " + pMezclaEdad.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo mezcla por edad: " + pMezclaEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones mezcla por edad: " + iteracionesMezclaEdad + "\u001B[0m");
        System.out.println("\u001B[31mRecursivas mezcla por edad: " + recursivasMezclaEdad + "\u001B[0m");

        // Medir tiempo de mezcla por nombre
        //coloca código faltante
        System.out.println("Tiempo mezcla por nombre: " + pMezclaNombre.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo mezcla por nombre: " + pMezclaNombre.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones mezcla por nombre: " + iteracionesMezclaNombre + "\u001B[0m");
        System.out.println("\u001B[31mRecursivas mezcla por nombre: " + recursivasMezclaNombre + "\u001B[0m");

        // Medir tiempo de selección por edad
        //coloca el código faltante
        System.out.println("Tiempo selección por edad: " + pSeleccionEdad.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo selección por edad: " + pSeleccionEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones selección por edad: " + iteracionesEdad + "\u001B[0m");

        // Medir tiempo de selección recursiva por edad
        //coloca el código faltante
        System.out.println("\u001B[31mTiempo selección recursiva por edad: " + pSeleccionRecEdad.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mRecursivas selección por edad: " + recursivasEdad + "\u001B[0m");

        // Medir tiempo de selección por nombre
        //coloca el código faltante
        System.out.println("Tiempo selección por nombre: " + pSeleccionNombre.getMillis() + " ms");
        System.out.println("\u001B[31mTiempo selección por nombre: " + pSeleccionNombre.getMillis() + " ms\u001B[0m");
        System.out.println("\u001B[31mIteraciones selección por nombre: " + iteracionesNombre + "\u001B[0m");

        // Medir tiempo de selección recursiva por nombre
        //coloca el código faltante
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