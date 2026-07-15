

class Operaciones {

    public void mostrarDatos(int numero) {
        System.out.println("Parámetros: int");
    }

    public void mostrarDatos(String texto) {
        System.out.println("Parámetros: String");
    }

    public void mostrarDatos(int numero, String texto) {
        System.out.println("Parámetros: int, String");
    }

    public void mostrarDatos(String texto, int numero) {
        System.out.println("Parámetros: String, int");
    }
}

public class PruebaOperaciones {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

        operaciones.mostrarDatos(99);
        operaciones.mostrarDatos("Hola");
        operaciones.mostrarDatos(99, "Hola");
        operaciones.mostrarDatos("Hola", 99);
    }
}