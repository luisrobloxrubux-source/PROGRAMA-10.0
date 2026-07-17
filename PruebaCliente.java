

class Cliente {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numeroDeCliente;

    public Cliente() {
        nombre = "";
        apellidoPaterno = "";
        apellidoMaterno = "";
        numeroDeCliente = 0;
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

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    } // Fin del método getNumeroDeCliente

    public void setNumeroDeCliente(int pNumeroDeCliente) {
        numeroDeCliente = pNumeroDeCliente;
    } // Fin del método setNumeroDeCliente

    public void imprimirCampos() {
        System.out.println(
            "Cliente:" +
            "\n\tnombre = " + nombre +
            "\n\tapellidoPaterno = " + apellidoPaterno +
            "\n\tapellidoMaterno = " + apellidoMaterno +
            "\n\tnumeroDeCliente = " + numeroDeCliente
        );
    } // Fin del método imprimirCampos

} // Fin de la clase Cliente

public class PruebaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Alberto");
        cliente1.setApellidoPaterno("Arenas");
        cliente1.setApellidoMaterno("Aguirre");
        cliente1.setNumeroDeCliente(1001);

        cliente1.imprimirCampos();

    } // Fin del método main

} // Fin de la clase PruebaCliente