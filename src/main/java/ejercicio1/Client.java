package ejercicio1;

public class Client {
    public static void main (String[]args){
        LaPaz laPaz = new LaPaz(200,120);
        Cochabamba cochabamba = new Cochabamba(400, 0);
        SantaCruz santaCruz = new SantaCruz(1000, 650);

        Turista turista = new Turista("Miguel", 1000, "123");

        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);

    }
}
