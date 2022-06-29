package parcial3.Adapter;

import java.util.Random;

public class CuadraElectrica implements ICuadrasElectricas{

    int capacidad;

    @Override
    public void cargar(int volts) {
        System.out.println("                                                  ");
        if(volts>0&&volts<=20&&volts%2==0){
            System.out.println("Seteando la capacidad de la cuadra electrica a: "+volts);
            this.capacidad=volts;
        }else{
            System.out.println("Error: los volts debe ser entre 0 y 20 y debe ser par");
        }
    }

    @Override
    public int estadoDeElectricidad() {
        Random random = new Random();
        int number = random.nextInt(11);
        return number;
    }

    public void showCapacidad(){
        System.out.println("La capacidad de la cuadra es: "+this.capacidad);
    }
}
