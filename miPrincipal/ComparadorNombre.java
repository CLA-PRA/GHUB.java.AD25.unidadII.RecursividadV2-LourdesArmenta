package miPrincipal;

public class ComparadorNombre implements Comparador<Estudiante> {
    @Override
    public int comparar(Estudiante e1, Estudiante e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}