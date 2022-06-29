package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor{
    private String name;
    private List<Usuario>listUsuarios = new ArrayList<>();

    public Servidor2(String name) {
        this.name = name;
    }


    @Override
    public void registrar(Usuario usuario) {

    }

    @Override
    public void login(Usuario usuario) {
        System.out.println("El servidor 2 esta logeando a este usuario");
        listUsuarios.add(usuario);
        }
    }
