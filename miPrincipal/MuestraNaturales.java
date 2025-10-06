package miPrincipal;
import java.util.Scanner;
//proposito: mostrar por pantalla n número naturales
//          incluyendo el cero
public class MuestraNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero positivo: ");
        n = sc.nextInt();
        System.out.println("version iterariva:");
        muestraNaturales_iterativa(n);
        System.out.println("version recursiva");
        muestraNaturales_recursiva(n-1);

        
    }
    public static void muestraNaturales_iterativa(int x){
        for(int i = 0; i<x ; i++){
            System.out.println(i);
        }
    }

    public static void muestraNaturales_recursiva(int x){     
        if (x>0)
           muestraNaturales_recursiva(x-1);
        System.out.println(x);

        
    }

    
}
