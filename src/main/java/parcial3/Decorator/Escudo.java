package parcial3.Decorator;

public class Escudo extends Decorator {

    public Escudo(ICelular personaje) {
        super(personaje);
    }

    @Override
    public void operation() {
        System.out.println("                        ");
        super.operation();
        addBehavior();
        int porcentaje= (int)(super.getPuntosDefensa()*(35.0f/100.0f));
        super.setPuntosDefensa(porcentaje+super.getPuntosDefensa());

        porcentaje = (int)(super.getCpunroProcesadores()*(10.0f/100.0f));
        super.setCpunroProcesadores(porcentaje+super.getCpunroProcesadores());
    }

    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("Escudo> nuevo Escudo ....");
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }


}
