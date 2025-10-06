package miPrincipal;

public class ComparadorEdad implements Comparador<Estudiante> {
    @Override
    public int comparar(Estudiante e1, Estudiante e2) {
        return Integer.compare(e1.getEdad(), e2.getEdad());
    }
}