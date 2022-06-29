package parcial3.Visitor;

public class Cochabamba implements IDepartamento {

    private String nombre;
    private int provincias;
    private int cantidadDeHabitantes;
    private String clima;
    private int dineroPorTurismo;

    public Cochabamba(int cantidadDeHabitantes, int provincias, String clima, int dineroPorTurismo) {
        this.nombre = "Cochabamba";
        this.provincias = provincias;
        this.cantidadDeHabitantes = cantidadDeHabitantes;
        this.clima = clima;
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public void accept(IVisitor visitor) {
        visitor.visitCochabamba(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }

    public int getCantidadDeHabitantes() {
        return cantidadDeHabitantes;
    }

    public void setCantidadDeHabitantes(int cantidadDeHabitantes) {
        this.cantidadDeHabitantes = cantidadDeHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(int dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }
}
