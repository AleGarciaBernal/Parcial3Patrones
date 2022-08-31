package parcial3.Visitor;

public class Client {

    public static void main(String[] args) {

        Turista turista = new Turista("Julio",3000,614765);

        SantaCruz santaCruz = new SantaCruz(1000000,30, "Calido", 1200);
        LaPaz laPaz = new LaPaz(1000000,20, "Frio", 1500);
        Cochabamba cochabamba = new Cochabamba(10000, 10,"Templado", 500);

        turista.showInfo();
//hola
        //ahola
        santaCruz.accept(turista);
        cochabamba.accept(turista);
        laPaz.accept(turista);
        turista.showInfo();
    }

}
