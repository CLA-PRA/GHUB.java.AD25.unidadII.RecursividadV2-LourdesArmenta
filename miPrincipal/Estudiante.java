package miPrincipal;

public class Estudiante {
    private String numContro;
    private String nombre;
    private String carrera;
    private Fecha fechaNacimiento;
    private int edad;

    public Estudiante(String numContro, String nombre, String carrera, Fecha fechaNacimiento, int edad) {
        this.numContro = numContro;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getNumContro() {
        return numContro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return numContro + "," + nombre + "," + carrera + "," + fechaNacimiento.toString() + "," + edad;
    }
}
