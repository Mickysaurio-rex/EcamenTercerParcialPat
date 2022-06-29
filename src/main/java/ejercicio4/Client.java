package ejercicio4;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();

        proxy.registrar(new Usuario("Andres", 1));
        proxy.registrar(new Usuario("Jose", 2));
        proxy.registrar(new Usuario("Nestor", 3));
        proxy.registrar(new Usuario("Camila", 4));

        proxy.login(new Usuario("Nestor", 3));
        proxy.login(new Usuario("Camila", 4));

    }
}
