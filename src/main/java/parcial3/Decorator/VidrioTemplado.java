package parcial3.Decorator;

public class VidrioTemplado extends Decorator {

    private int precioVidrio;

    public VidrioTemplado(ICelular personaje, int precioVidrio) {
        super(personaje);
        this.precioVidrio = precioVidrio;
    }

    @Override
    public void operation() {
        System.out.println("");
        super.operation();
        addBehavior();
        super.setPrecio(super.getPrecio()+precioVidrio);
    }


    public void addBehavior(){
        System.out.println("-- Colocando Vidrio Templado --");
    }

}
