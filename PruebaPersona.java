

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        nombre = "(Sin nombre)";
        edad = 0;
    }

    public void imprimirCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
}

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.imprimirCampos();

        persona.setNombre("Alex");
        persona.setEdad(20);
        persona.imprimirCampos();
    }
}
