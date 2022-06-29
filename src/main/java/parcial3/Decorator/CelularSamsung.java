package parcial3.Decorator;

public class CelularSamsung implements ICelular {

   // (ram, almacenamiento y cpu) y precio

    private String marca;
    private String almacenamiento;
    private int precio;
    private int cpunroProcesadores;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracion;

    public CelularSamsung(String almacenamiento, int precio,int cpunroProcesadores) {
        this.marca = "Samsung";
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.cpunroProcesadores = cpunroProcesadores;
    }

    @Override
    public void showInfo() {
        System.out.println("Celular Samsung");
        System.out.println("Marca: " + marca);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Precio: " + precio);
        System.out.println("CPU, Nro de procesadores: " + cpunroProcesadores);

    }

    @Override
    public void operation() {
        System.out.println("Celular Samsung> operation -> realizando operacion");
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getCpunroProcesadores() {
        return cpunroProcesadores;
    }

    @Override
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void setCpunroProcesadores(int cpunroProcesadores) {
        this.cpunroProcesadores = cpunroProcesadores;
    }

}
