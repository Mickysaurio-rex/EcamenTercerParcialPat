package ejercicio1;

public class Turista implements IPersona{
    private String nombre;
    private double dinero;
    private String ci;

    public Turista(String nombre, double dinero, String ci) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.ci = ci;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public void gastarDinero(LaPaz lapaz) {
        if(dinero > 0) {
            System.out.println("Dinero Actual: " + dinero);
            double monto = (int) (Math.random() * (1 - 100)) + 1;
            if(monto < dinero) {
                setDinero(dinero - monto);
                lapaz.setDineroPorTurismo(lapaz.getDineroPorTurismo() + monto);
                System.out.println("Dinero Despues de descuento: " + dinero);
            }else{
                System.out.println("El dinero no alcanzara");
            }
        }else{
            System.out.println("No cuenta con dinero suficiente");
        }
    }

    @Override
    public void gastarDinero(Cochabamba cochabamba) {
        if(dinero > 0) {
            System.out.println("Dinero Actual: " + dinero);
            double monto = cochabamba.getNumeroHabitantes()*0.1;
            if(monto < dinero) {
                setDinero(dinero - monto);
                cochabamba.setDineroPorTurismo(cochabamba.getDineroPorTurismo() + monto);
                System.out.println("Dinero Despues de descuento: " + dinero);
            }else{
                System.out.println("El dinero no alcanzara");
            }
        }else{
            System.out.println("No cuenta con dinero suficiente");
        }
    }

    @Override
    public void gastarDinero(SantaCruz santaCruz) {
        if(dinero > 0) {
            System.out.println("Dinero Actual: " + dinero);
            double monto = santaCruz.getNumeroProvincias()/2;
            if(monto < dinero) {
                setDinero(dinero - monto);
                santaCruz.setDineroPorTurismo(santaCruz.getDineroPorTurismo() + monto);
                System.out.println("Dinero Despues de descuento: " + dinero);
            }else{
                System.out.println("El dinero no alcanzara");
            }
        }else{
            System.out.println("No cuenta con dinero suficiente");
        }
    }
}
