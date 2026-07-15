

class Operaciones {

    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int cuadrado(int numero) {
        return numero * numero;
    }
}

public class PruebaOperaciones {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

        int resultado = operaciones.sumar(10, 20);
        System.out.println(resultado);

        System.out.println(operaciones.restar(30, 9));

        System.out.println(operaciones.cuadrado(11));
    }
}