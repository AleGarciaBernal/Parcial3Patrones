package parcial3.Bridge;

import estructuras.templateMethod.structure.Estudiante;

public class InscripcionColegio implements Inscripcion{

    IRedSocial redSocial;

    private String nombre;
    private int capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;

    public InscripcionColegio(IRedSocial redSocial,String nombre, int capacidad,String requisitos) {
        this.redSocial = redSocial;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        estudiantes = new Estudiante[3];

    }


    @Override
    public void showInfo() {

    }
}
