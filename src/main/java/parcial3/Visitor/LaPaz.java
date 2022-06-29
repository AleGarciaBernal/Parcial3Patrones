package parcial3.Visitor;

public class LaPaz implements IDepartamento {

    private String nombre;
    private int provincias;
    private int cantidadDeHabitantes;
    private String clima;
    private int dineroPorTurismo;

    public LaPaz( int cantidadDeHabitantes,int provincias, String clima, int dineroPorTurismo) {
        this.nombre = "La Paz";
        this.provincias = 20;
        this.cantidadDeHabitantes = cantidadDeHabitantes;
        this.clima = clima;
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public void accept(IVisitor visitor) {
        visitor.visitLaPaz(this);
    }

}
