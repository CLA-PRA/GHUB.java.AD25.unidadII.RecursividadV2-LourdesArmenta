package miPrincipal;
import java.util.Scanner;
public class SumaDigitos {
    public static void main(String argr[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("introduce número entero:");
        int num=entrada.nextInt();
        System.out.println("suma digitos: "+sumaDigitos_iterariva(num));
        System.out.println("suma digitos: "+sumaDigitos_recursiva(num));
        entrada.close();

    }
    public static int sumaDigitos_iterariva(int n){
        int suma = 0;
        while(n>9)
        {
            suma = suma + n%10;
            n = n/10;
        }
        return (suma+n);

    }
    public static int sumaDigitos_recursiva(int n){
        
        if (n<=9)
           return n;
        else
            return sumaDigitos_recursiva(n / 10) + n % 10;
    }
}