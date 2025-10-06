package miPrincipal;
import java.util.Scanner;
import java.util.Hashtable;


public class Fibonacci {
    private static long cont; // cuenta el número de llamadas recursivas

    public static void main(String[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es " + fibonacci_iterativo(n));
        System.out.println("El fibonacci de " + n + " es " + fibonacci_recursivo(n));
        //calcular el performance de los fibonacci entre 40 y 50
        Performance p = new Performance();
        int desde =40;
        int hasta = 50;
        double ant = -1;
        for (int  i=desde; i<=hasta ;i++){
            //inicalizar el contador
            cont =-1;
            //comenzamos a tomar el tiempo
            p.start();
            //invocamos a la funcion recursiva
            double f = fibonacci_recursivo(i);
            //detenemos el tiempo
            p.stop();
            System.out.print("f("+i+")= "+f+", "+p.getMillis()+"ms, "+cont+" veces ");
            if(ant>0){
                System.out.println("Incr = "+f/ant);
            }else{
                System.out.println();
            }
            ant = f;
        }


        sc.close();
        */
        //inicializar la tabla
        Hashtable<Integer,Double> t = new Hashtable<Integer, Double>();
        t.put(1,1d);
        t.put(2,1d);
        //el usuario ingresa el valor de n
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿cuántos elementos quiere ver?");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            double f = fibonacci_optimizado(i, t);
            System.out.println("fib("+i+") = "+f);
        }



    }
    public static long fibonacci_recursivo(int n) {
        cont++;

        if(n<=1)
            return n;
        else
        
            return fibonacci_recursivo(n-1) + fibonacci_recursivo(n-2);
    }

    public static long fibonacci_iterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static double fibonacci_optimizado(int x, Hashtable<Integer,Double> t)
    {
        //primero verifica si el resultado ya esta en la table
        Double d = t.get(x);
        //sino se encuientra entoncs lo calculamos
        if (d ==null){
            d=fibonacci_optimizado(x-1, t)+fibonacci_optimizado(x-2,t);
            t.put(x, d);

        }
        return d;
    }
}
