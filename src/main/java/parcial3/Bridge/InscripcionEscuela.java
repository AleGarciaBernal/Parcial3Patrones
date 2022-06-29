package parcial3.Bridge;

public class InscripcionEscuela implements Inscripcion{

    Integration redSocial;
    private String nombre;
    private int capacidad;
    private String requisitos;
    private Estudiante[] estudiantes;
    private int posicion;

    public InscripcionEscuela(Integration redSocial, String nombre, int capacidad, String requisitos) {
        this.redSocial = redSocial;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        estudiantes = new Estudiante[3];
    }

    @Override
    public void showDatos() {
        redSocial.publicarInfo();
        System.out.println("Inscripcion Escuela");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Requisitos: " + requisitos);
        System.out.println("Estudiantes inscriptos: ");
        showEstudiantes();
    }

    @Override
    public void inscribir(Estudiante estudiante) {
        estudiantes[posicion]=estudiante;
        posicion++;
    }

    @Override
    public void showEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + (i+1) + ": " + estudiantes[i].getNombre());
        }

    }
}
