package parcial3.Decorator;

public class Carcasa extends Decorator {

    private int precioCarcasa;

    public Carcasa(ICelular personaje, int precioCarcasa) {
        super(personaje);
        this.precioCarcasa = precioCarcasa;
    }

    @Override
    public void operation() {
        System.out.println("");
        super.operation();
        addBehavior();
        super.setPrecio(super.getPrecio()+ precioCarcasa);
    }


    public void addBehavior(){
        System.out.println("-- Colocando Carcasa --");
    }

}
