package parcial3.Adapter;

public class Client {

    public static void main (String [] args) {

        ICuadrasCombustibles gaso = new CuadratrackGasolina();
        gaso.llenarGasolina(25);
        gaso.showCapacidad();
        System.out.println("Metodo estado del combustible: " + gaso.estadoCombustible());


        ICuadrasCombustibles diesel = new CuadratrackDiesel();
        diesel.llenarGasolina(32);
        diesel.showCapacidad();
        System.out.println("Metodo estado del combustible: " + gaso.estadoCombustible());

        ICuadrasCombustibles especial = new CuadratrackGasolinaEspecial();
        especial.llenarGasolina(10);
        especial.showCapacidad();
        System.out.println("Metodo estado del combustible: "+gaso.estadoCombustible());

        CuadraElectrica c1=new CuadraElectrica();
        CuadraElectrica c2=new CuadraElectrica();

        ICuadrasCombustibles c1adapter=new CuadraElectricaAdapter(c1);
        c1adapter.llenarGasolina(20);
        c1adapter.showCapacidad();
        System.out.println("Metodo estadoDeElectricidad: "+c1adapter.estadoCombustible());

        ICuadrasCombustibles c2adapter=new CuadraElectricaAdapter(c2);
        c2adapter.llenarGasolina(10);
        c2adapter.showCapacidad();
        System.out.println("Metodo estadoDeElectricidad: "+c2adapter.estadoCombustible());


    }

}
