

class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Persona() {
        nombre = "";
        apellidoPaterno = "";
        apellidoMaterno = "";
    } // Fin del constructor

    public String getNombre() {
        return nombre;
    } // Fin del método getNombre

    public void setNombre(String pNombre) {
        nombre = pNombre;
    } // Fin del método setNombre

    public String getApellidoPaterno() {
        return apellidoPaterno;
    } // Fin del método getApellidoPaterno

    public void setApellidoPaterno(String pApellidoPaterno) {
        apellidoPaterno = pApellidoPaterno;
    } // Fin del método setApellidoPaterno

    public String getApellidoMaterno() {
        return apellidoMaterno;
    } // Fin del método getApellidoMaterno

    public void setApellidoMaterno(String pApellidoMaterno) {
        apellidoMaterno = pApellidoMaterno;
    } // Fin del método setApellidoMaterno

    public void imprimirCampos() {
        System.out.println(
            "Persona:" +
            "\n\tnombre = " + nombre +
            "\n\tapellidoPaterno = " + apellidoPaterno +
            "\n\tapellidoMaterno = " + apellidoMaterno
        );
    } // Fin del método imprimirCampos

} // Fin de la clase Persona

public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Alberto");
        persona1.setApellidoPaterno("Arenas");
        persona1.setApellidoMaterno("Aguirre");

        persona1.imprimirCampos();

    } // Fin del método main

} // Fin de la clase Principal