package parcial3.Decorator;

public class PocionCuracion extends Decorator {

    public PocionCuracion(ICelular componentBase) {
        super(componentBase);
    }

    @Override
    public void operation() {
        System.out.println("                        ");
        super.operation();
        addBehavior();
        int porcentaje= (int)(super.getPuntosRegeneracion()*(80.0f/100.0f));
        super.setPuntosRegeneracion(porcentaje+super.getPuntosRegeneracion());
    }

    public void addBehavior(){
        System.out.println("                        ");
        System.out.println("Pocion de Curacion ....");
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }


}
