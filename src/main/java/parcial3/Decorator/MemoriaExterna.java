package parcial3.Decorator;

public class MemoriaExterna extends Decorator {

    private String memoriaExterna;
    private int precioMemoriaExterna;

    public MemoriaExterna(ICelular personaje, String memoriaExterna, int precioMemoriaExterna) {
        super(personaje);
        this.memoriaExterna = memoriaExterna;
        this.precioMemoriaExterna = precioMemoriaExterna;
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        super.setAlmacenamiento("Memoria Interna: "+super.getAlmacenamiento()+", Memoria Externa: "+memoriaExterna);
        super.setPrecio(super.getPrecio()+precioMemoriaExterna);
    }


    public void addBehavior(){
        System.out.println("--Añadiendo memoria externa--");
    }

}
