

class Alfa {
    public int campoPublic;
    int campoDefault;
    protected int campoProtected;
    private int campoPrivate;

    public Alfa() {
        campoPublic = 0;
        campoDefault = 0;
        campoProtected = 0;
        campoPrivate = 0;
    }
}

class Beta {
    public Beta() {
        Alfa alfa = new Alfa();
        alfa.campoPublic = 0;
        alfa.campoDefault = 0;
        alfa.campoProtected = 0;
        // alfa.campoPrivate = 0; /* No se tiene acceso */
    }
}

class AlfaSub extends Alfa {
    public AlfaSub() {
        Alfa alfa = new Alfa();
        alfa.campoPublic = 0;
        // alfa.campoDefault = 0; /* No se tiene acceso en paquete original */
        // alfa.campoProtected = 0; /* No se tiene acceso en paquete original */
        // alfa.campoPrivate = 0; /* No se tiene acceso */

        campoPublic = 0;
        // campoDefault = 0; /* No se tiene acceso */
        campoProtected = 0;
        // campoPrivate = 0; /* No se tiene acceso */
    }
}

class Gama {
    public Gama() {
        Alfa alfa = new Alfa();
        alfa.campoPublic = 0;
        // alfa.campoDefault = 0; /* No se tiene acceso */
        // alfa.campoProtected = 0; /* No se tiene acceso */
        // alfa.campoPrivate = 0; /* No se tiene acceso */
    }
}

public class Principal {
    public static void main(String[] args) {
        Alfa alfa = new Alfa();
        Beta beta = new Beta();
        AlfaSub sub = new AlfaSub();
        Gama gama = new Gama();
        System.out.println("Código compilado con éxito.");
    }
}
