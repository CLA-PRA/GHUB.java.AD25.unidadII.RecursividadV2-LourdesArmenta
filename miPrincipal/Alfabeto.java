package miPrincipal;
//Demostración de una recursividad Indirecta

public class Alfabeto {
    public static void main(String[] args) {
        metodoA('Z');
        
    }
    public static void metodoA(char c){
        System.out.println(c);
        if(c>'A')
           metodoB(c);
        

    }
    public static void metodoB(char c){
        c--;
        metodoA(c);

    }
    
}
