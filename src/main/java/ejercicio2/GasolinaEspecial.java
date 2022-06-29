package ejercicio2;

public class GasolinaEspecial implements IGasolina {
    private int capacidad;

    public GasolinaEspecial(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void llenarGasolina(int monto) {
        System.out.println("La capacidad es de:" + capacidad );
    }

    @Override
    public void estadoDelCombustible() {
        int monto = (int) (Math.random() * (100 - 1)) + 1;
        if()
        System.out.println("La gasolina esta en: ");

    }
}
