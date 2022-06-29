package parcial3.Decorator;

public class MemoriaExterna extends Decorator {

    private String memoriaExterna;

    public MemoriaExterna(ICelular personaje, String memoriaExterna) {
        super(personaje);
        this.memoriaExterna = memoriaExterna;
    }

    @Override
    public void operation() {
        System.out.println("");
        super.operation();
        addBehavior();
        super.setAlmacenamiento("Memoria Interna: "+super.getAlmacenamiento()+" "+memoriaExterna);
        super.setPrecio(super.getPrecio()*2);
        int porcentaje= (int)(super.getPuntosAtaque()*(30.0f/100.0f));
        super.setPuntosAtaque(porcentaje+super.getPuntosAtaque());

    }


    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("--Añadiendo memoria externa--");
    }

}
