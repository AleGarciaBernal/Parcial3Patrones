package parcial3.Adapter;

import java.util.Random;

public class CuadratrackGasolina implements ICuadrasCombustibles{

    private int capacidad;

    @Override
    public void llenarGasolina(int litros) {
        System.out.println("                                                  ");
        if(litros>0&&litros<=50){
            System.out.println("Seteando la capacidad de la cuadra a: "+litros);
            this.capacidad=litros;
        }else{
            System.out.println("Error: los litros debe ser entre 0 y 50");
        }
    }

    @Override
    public int estadoCombustible() {
        Random random = new Random();
        int number = random.nextInt(51);
        return number;
    }

    public void showCapacidad(){
        System.out.println("La capacidad de la cuadra es: "+this.capacidad);
    }

}
