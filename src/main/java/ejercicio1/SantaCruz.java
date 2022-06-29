package ejercicio1;

public class SantaCruz implements IDepartamento{
    private String nombre;
    private int numeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public SantaCruz(int numeroHabitantes, double dineroPorTurismo) {
        this.nombre = "Santa Cruz";
        this.numeroProvincias = 15;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = "Calido";
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public int getNumeroProvincias() {
        return numeroProvincias;
    }

    public void setNumeroProvincias(int numeroProvincias) {
        this.numeroProvincias = numeroProvincias;
    }

    public double getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(double dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }

    @Override
    public void accept(IPersona visitor) {
        info();
        visitor.gastarDinero(this);
        System.out.println("Dinero por turismo despues: " +dineroPorTurismo);
        System.out.println("\n\n");
    }

    public void info(){
        System.out.println("******BIENVENIDO A SANTA CRUZ********");
        System.out.println("Provincias: " + numeroProvincias);
        System.out.println("Numero Habitantes: " + numeroHabitantes);
        System.out.println("Clima: " + clima);
        System.out.println("Dinero por turismo antes: " +dineroPorTurismo);
    }
}
