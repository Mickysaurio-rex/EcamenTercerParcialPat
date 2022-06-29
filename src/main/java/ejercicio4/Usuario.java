package ejercicio4;

public class Usuario {
    private String nombre;
    private int numero;

    public Usuario(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void showInfo(){
        System.out.println("********INFORMACION********");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de usuario: " + numero);
        System.out.println();
    }
}
