package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor{

    private List<Usuario> listUsuario = new ArrayList<>();
    private IServidor servidor1;
    private IServidor servidor2;


    public Proxy() {
        servidor1 = new Servidor1("Servidor1");
        servidor2 = new Servidor2("Servidor2");
    }

    @Override
    public void registrar(Usuario usuario) {
        listUsuario.add(usuario);
    }

    @Override
    public void login(Usuario usuario) {
        if(listUsuario.contains(usuario)){
            if(esPrimo(usuario.getNumero())){
                servidor1.login(usuario);
            }else{
                servidor2.login(usuario);
            }
        }else{
            System.out.println("El usuario no existe, primero registrese");
        }


    }

    public boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}