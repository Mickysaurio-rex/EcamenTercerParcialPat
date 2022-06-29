package ejercicio1;

public class LaPaz implements IDepartamento{
    private String nombre;
    private int numeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public LaPaz(int numeroHabitantes, double dineroPorTurismo) {
        this.nombre = "La Paz";
        this.numeroProvincias = 20;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = "Frio";
        this.dineroPorTurismo = dineroPorTurismo;
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
        System.out.println("******BIENVENIDO A LA PAZ********");
        System.out.println("Provincias: " + numeroProvincias);
        System.out.println("Numero Habitantes: " + numeroHabitantes);
        System.out.println("Clima: " + clima);
        System.out.println("Dinero por turismo antes: " +dineroPorTurismo);
    }
}
