package parcial3.Bridge;

public class Client {
    public static void main(String[] args) {

        Integration facebook = new Facebook();
        Integration twitter = new Twitter();
        Integration whatsapp = new Whatsapp();

        Estudiante e1 = new Estudiante("Juan", 123);
        Estudiante e2 = new Estudiante("Maria", 123);
        Estudiante e3 = new Estudiante("Jose", 123);
        Estudiante e4 = new Estudiante("Miguel", 123);
        Estudiante e5 = new Estudiante("Lalo", 123);


        Inscripcion inscripcionColegio = new InscripcionColegio(facebook, "Colegio Americano",
                100, "7 anios cumplidos");
        Inscripcion inscripcionEscuela = new InscripcionEscuela(twitter, "Escuela Americano",
                100, "3 anios cumplidos");
        Inscripcion inscripcionUniversidad = new InscripcionUniversidad(whatsapp, "UPB",
                100, "Certificado Bachiller");

        inscripcionColegio.inscribir(e1);
        inscripcionColegio.inscribir(e2);
        inscripcionColegio.inscribir(e3);

        inscripcionEscuela.inscribir(e1);
        inscripcionEscuela.inscribir(e2);
        inscripcionEscuela.inscribir(e3);

        inscripcionUniversidad.inscribir(e1);
        inscripcionUniversidad.inscribir(e2);
        inscripcionUniversidad.inscribir(e3);

        inscripcionColegio.showEstudiantes();
        inscripcionEscuela.showDatos();
        inscripcionUniversidad.showDatos();

    }
}
