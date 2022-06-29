package parcial3.Decorator;

public class Client {

    public static void main(String[]args){

        ICelular personaje= new CelularSamsung("Isindur", "Espada", 1);
        personaje.setCpunroProcesadores(10);
        personaje.setPuntosAtaque(10);
        personaje.setPuntosDefensa(10);
        personaje.setPuntosRegeneracion(10);

        personaje.showInfo();

        personaje=new MemoriaExterna(personaje,"Hacha");

        personaje=new Escudo(personaje);

        personaje=new PocionCuracion(personaje);

        personaje.operation();
        personaje.showInfo();


    }
}
