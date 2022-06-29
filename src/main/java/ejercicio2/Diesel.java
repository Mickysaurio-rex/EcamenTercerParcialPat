package ejercicio2;

public class Diesel implements IGasolina{
    private int capacidad;

    public Diesel(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void llenarGasolina(int monto) {
        System.out.println("La capacidad es de:" + capacidad );
    }

    @Override
    public void estadoDelCombustible() {
        int monto = (int) (Math.random() * (50 - 1)) + 1;
        if(monto < capacidad) {
            System.out.println("La gasolina esta en: " + monto);
        }else{
            estadoDelCombustible();
        }
    }
}
