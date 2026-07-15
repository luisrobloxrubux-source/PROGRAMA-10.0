

class Persona {

    public String nombre;
    public int edad;

    public void imprimirCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println();
    }
}

public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.imprimirCampos();

        persona.nombre = "Alex";
        persona.edad = 20;

        persona.imprimirCampos();
    }
}