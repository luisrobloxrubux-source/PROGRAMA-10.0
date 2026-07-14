package c05.p01;

class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int edad;
    int peso;
}

class PruebaPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Ap. Paterno: " + persona1.apellidoPaterno);
        System.out.println("Ap. Materno: " + persona1.apellidoMaterno);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Peso: " + persona1.peso);

        persona1.nombre = "Alex";
        persona1.apellidoPaterno = "Torres";
        persona1.apellidoMaterno = "Flores";
        persona1.edad = 20;
        persona1.peso = 56;

        System.out.println();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Ap. Paterno: " + persona1.apellidoPaterno);
        System.out.println("Ap. Materno: " + persona1.apellidoMaterno);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Peso: " + persona1.peso);
    }
}