package ejercicio3;

public class Facebook implements IredSocial{
    private int usuarios;
    private int usuariosA;

    public Facebook(int usuarios, int usuariosA) {
        this.usuarios = usuarios;
        this.usuariosA = usuariosA;
    }

    @Override
    public void showInfo(ISistema sistema) {
        System.out.println("**********INFO FACEBOOK**********");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Usuarios Activos: " + usuariosA);
        System.out.println("\n\n");
    }
}
