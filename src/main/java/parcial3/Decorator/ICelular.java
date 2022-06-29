package parcial3.Decorator;

public interface ICelular {

    void showInfo();
    void operation();

    int getPrecio();
    int getCpunroProcesadores();
    String getAlmacenamiento();

    void setPrecio(int precio);
    void setCpunroProcesadores(int cpunroProcesadores);
    void setAlmacenamiento(String almacenamiento);



}
