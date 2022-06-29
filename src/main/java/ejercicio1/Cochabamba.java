package ejercicio1;

public class Cochabamba implements IDepartamento{
    private String nombre;
    private int numeroProvincias;
    private int numeroHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public Cochabamba(int numeroHabitantes, double dineroPorTurismo) {
        this.nombre = "Cochabamba";
        this.numeroProvincias = 35;
        this.numeroHabitantes = numeroHabitantes;
        this.clima = "Templado";
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
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
        System.out.println("******BIENVENIDO COCHABAMBA********");
        System.out.println("Provincias: " + numeroProvincias);
        System.out.println("Numero Habitantes: " + numeroHabitantes);
        System.out.println("Clima: " + clima);
        System.out.println("Dinero por turismo antes: " +dineroPorTurismo);
    }
}
