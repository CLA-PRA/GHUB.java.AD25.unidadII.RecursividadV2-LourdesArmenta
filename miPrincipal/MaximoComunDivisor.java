package miPrincipal;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        int m = 6;
        int n = 124;
        System.out.println("El MCD de " + m + " y " + n + " es " + mcd_iterativa(m, n));
        System.out.println("El MCD de " + m + " y " + n + " es " + mcd_recursiva(m, n));

    }
    public static int mcd_iterativa(int m, int n) {
        int r;
        while(n!=0){
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static int mcd_recursiva(int m, int n) {
        if(n<=m && m%n ==0) //caso base
             return n;
        else if(m<n)
            return mcd_recursiva(n,m);
        else
            return mcd_recursiva(n,m%n);
  
    }
    
}
