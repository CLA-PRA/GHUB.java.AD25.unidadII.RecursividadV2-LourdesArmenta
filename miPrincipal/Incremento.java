package miPrincipal;

public class Incremento {
    public static void main(String[] args) {
        int n=0;
        n =incrementar(n);
        System.out.println("El valor de n= "+n);       
    }

    public static int incrementar(int a){
        a = a+1;
        return a;

    }
    
}
