package ejercicio3;

public class Client {
    public static void main(String[] args) {
        IredSocial facebook = new Facebook(1000, 100);
        IredSocial twitter = new Twitter(1000, 20);
        IredSocial whatsapp = new WhatsApp(1000, 50);

        Estudiante estudiante1 = new Estudiante("Miguel", "123");
        Estudiante estudiante2 = new Estudiante("Pablo", "1234");
        Estudiante estudiante3 = new Estudiante("Rebe", "12345");

        ISistema colegio = new SistemaColegio("IDS", "100", new Estudiante[]{estudiante1, estudiante2, estudiante3}, "CI, certificado de nacimiento");

        Estudiante estudiante4 = new Estudiante("Gabo", "123");
        Estudiante estudiante5 = new Estudiante("Richy", "143");

        ISistema escuela = new SistemaEscuela("Boliviano Japones", "250", new Estudiante[]{estudiante4, estudiante5}, "CI, certificado de nacimiento");

        Estudiante estudiante6 = new Estudiante("Nestor", "231");
        Estudiante estudiante7 = new Estudiante("Daniel", "123456");

        ISistema universidad = new SistemaUniversidad("UPB", "250", new Estudiante[]{estudiante6, estudiante7}, "CI,certificado de nacimiento");

        facebook.showInfo(escuela);
        twitter.showInfo(colegio);
        whatsapp.showInfo(universidad);
    }
}
