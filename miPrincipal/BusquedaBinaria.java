package miPrincipal;
public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19,21,23};
        int valor = 18;
        int resultado = busqueda_secuencial(arreglo, valor);
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posición " + resultado);
        }
        valor = 5;
         resultado = busquedaBinaria_iterativa(arreglo, valor);
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posición " + resultado);
        }
        resultado = busquedaBinaria_recursiva(arreglo, valor, 0, arreglo.length - 1);
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor se encuentra en la posición " + resultado);
        }
    }

    //coloca aqui el metodo busquedaBinaria_iterativa

   //coloca aquí el método busquedaBinaria_recursiva

   //coloca aquí el método busqueda_secuencial
   
    

}