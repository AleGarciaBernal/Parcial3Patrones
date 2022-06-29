package parcial3.Decorator;

public abstract class Decorator implements ICelular {

    private ICelular componentBase;

    public Decorator(ICelular componentBase){
        this.componentBase=componentBase;
    }

    @Override
    public void showInfo() {
        componentBase.showInfo();
    }

    @Override
    public void operation() {
        componentBase.operation();
    }

    @Override
    public int getPrecio() {
        return componentBase.getPrecio();
    }

    @Override
    public int getCpunroProcesadores() {
        return componentBase.getCpunroProcesadores();
    }

    @Override
    public String getAlmacenamiento() {
        return componentBase.getAlmacenamiento();
    }

    @Override
    public void setPrecio(int precio) {
        componentBase.setPrecio(precio);
    }

    @Override
    public void setCpunroProcesadores(int cpunroProcesadores) {
        componentBase.setCpunroProcesadores(cpunroProcesadores);
    }

    @Override
    public void setAlmacenamiento(String almacenamiento) {
        componentBase.setAlmacenamiento(almacenamiento);
    }


}
