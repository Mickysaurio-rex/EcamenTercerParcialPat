package ejercicio2;

public class Client {
    public static void main(String []args){
        IGasolina cuadra1 =  new Gasolina(40);
        IGasolina cuadra2 = new CuadraA(new CuadratackElec(18));

        cuadra1.llenarGasolina(40);
        cuadra2.llenarGasolina(18);
        cuadra1.estadoDelCombustible();
        cuadra2.estadoDelCombustible();
    }
}
