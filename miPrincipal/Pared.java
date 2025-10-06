package miPrincipal;
public class Pared{
    public static void dibujar_pared(int n){
        //solucion iterativa
        /* 
        for(int i=0; i<10; i++){
            System.out.println("**********************");
        }
            */
        
        //solucion recursiva
        if (n>1)
            dibujar_pared(n-1);
        System.out.println("*****");

    }
    public static void main(String[] args){
        int n = 10;
        dibujar_pared(n);
        
    }
}