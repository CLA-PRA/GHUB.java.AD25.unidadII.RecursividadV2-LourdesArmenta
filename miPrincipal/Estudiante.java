package miPrincipal;

public class Estudiante {
    private String numContro;
    private String nombre;
    private String carrera;
    private Fecha fechaNacimiento;
    private int edad;

    //coloca el código faltante


    @Override
    public String toString() {
        return numContro + "," + nombre + "," + carrera + "," + fechaNacimiento.toString() + "," + edad;
    }
}
