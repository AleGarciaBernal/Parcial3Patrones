package parcial3.Adapter;

public class CuadraElectricaAdapter implements ICuadrasCombustibles {

    private ICuadrasElectricas cuadrasElectricas;

    public CuadraElectricaAdapter(ICuadrasElectricas cuadrasElectricas) {
        this.cuadrasElectricas = cuadrasElectricas;
    }


    @Override
    public void llenarGasolina(int litros) {
        cuadrasElectricas.cargar(litros);

    }

    @Override
    public int estadoCombustible() {
        return cuadrasElectricas.estadoDeElectricidad();
    }

    @Override
    public void showCapacidad() {
       cuadrasElectricas.showCapacidad();

    }

}
