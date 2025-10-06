package miPrincipal;
//ejemplo de recursividad indirecta

    public class ParImparRecursivo {
        public static void main(String[] args) {
            int numero = 10;
            if (esPar(numero)) {
                System.out.println(numero + " es par.");
            } else {
                System.out.println(numero + " es impar.");
            }
        }
    
        public static boolean esPar(int n) {
            if (n == 0) {
                return true;
            } else {
                return esImpar(n - 1);
            }
        }
    
        public static boolean esImpar(int n) {
            if (n == 0) {
                return false;
            } else {
                return esPar(n - 1);
            }
        }
        
    }

