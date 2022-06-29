package ejercicio2;

public class CuadraA implements IGasolina{

    private CuadratackElec cuadratackElec;

    public CuadraA(CuadratackElec cuadratackElec) {
        this.cuadratackElec = cuadratackElec;
    }

    @Override
    public void llenarGasolina(int monto) {
        cuadratackElec.cargar(monto);
    }

    @Override
    public void estadoDelCombustible() {
        cuadratackElec.estadoDeElectricidad();
    }
}
