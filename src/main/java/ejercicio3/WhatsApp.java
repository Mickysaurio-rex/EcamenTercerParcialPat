package ejercicio3;

public class WhatsApp implements IredSocial{
    private int usuarios;
    private int usuariosA;

    public WhatsApp(int usuarios, int usuariosA) {
        this.usuarios = usuarios;
        this.usuariosA = usuariosA;
    }

    @Override
    public void showInfo(ISistema sistema) {
        System.out.println("**********WHATSAPP**********");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Usuarios Activos: " + usuariosA);
        System.out.println("\n\n");
    }
}
