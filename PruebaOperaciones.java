

class Operaciones {

    public void concatenarTexto(String texto1, String texto2) {
        System.out.println(texto1 + " " + texto2);
    }

    public void imprimirSuma(int entero1, int entero2) {
        int suma = entero1 + entero2;
        System.out.println("Suma: " + suma);
    }
}

public class PruebaOperaciones {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

        operaciones.concatenarTexto("Primero", "Segundo");
        operaciones.concatenarTexto("Tercero", "Cuarto");

        operaciones.imprimirSuma(10, 20);
        operaciones.imprimirSuma(30, 40);
    }
}