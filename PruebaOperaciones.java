
class Operaciones {

    public void imprimirTexto(String texto) {
        System.out.println(texto);
    }
}

public class PruebaOperaciones {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

        operaciones.imprimirTexto("Primer Texto");
        operaciones.imprimirTexto("Segundo Texto");
        operaciones.imprimirTexto("Tercer Texto");

    }
}