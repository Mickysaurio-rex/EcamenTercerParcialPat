package ejercicio2;

public class CuadratackElec implements IElectricas{

    private  int carga;

    public CuadratackElec(int carga) {
        this.carga = carga;
    }

    @Override
    public void cargar(int carga) {
        System.out.println("La carga es de: " + carga);
    }

    @Override
    public void estadoDeElectricidad() {
        int monto = (int) (Math.random() * (50 - 1)) + 1;
        if(monto < carga) {
            System.out.println("La bateria esta en: " + monto);
        }else{
            estadoDeElectricidad();
        }

    }
}
