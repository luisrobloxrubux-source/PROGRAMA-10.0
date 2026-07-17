

class Operaciones {

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    } // Fin del método sumar

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    } // Fin del método restar

} // Fin de la clase Operaciones

public class PruebaOperaciones {

    public static void main(String[] args) {

        Operaciones obj1 = new Operaciones();

        System.out.println(obj1.sumar(10, 20));
        System.out.println(Operaciones.sumar(10, 20));

        System.out.println(obj1.restar(30, 20));
        System.out.println(Operaciones.restar(30, 20));

    } // Fin del método main

} // Fin de la clase PruebaOperaciones