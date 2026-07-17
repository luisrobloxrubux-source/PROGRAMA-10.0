

class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Persona() {
        nombre = "";
        apellidoPaterno = "";
        apellidoMaterno = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String pApellidoPaterno) {
        apellidoPaterno = pApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String pApellidoMaterno) {
        apellidoMaterno = pApellidoMaterno;
    }

} // Fin de la clase Persona

class Cliente extends Persona {

    private int numeroDeCliente;

    public Cliente() {
        setNombre("");
        setApellidoPaterno("");
        setApellidoMaterno("");
        numeroDeCliente = 0;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int pNumeroDeCliente) {
        numeroDeCliente = pNumeroDeCliente;
    }

    public void imprimirCampos() {
        System.out.println(
            "Cliente: nombre = " + getNombre()
            + " apellidoPaterno = " + getApellidoPaterno()
            + " apellidoMaterno = " + getApellidoMaterno()
            + " numeroDeCliente = " + numeroDeCliente
        );
    }

} // Fin de la clase Cliente

public class PruebaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Carlos");
        cliente1.setApellidoPaterno("Cadena");
        cliente1.setApellidoMaterno("Castillo");
        cliente1.setNumeroDeCliente(2001);

        cliente1.imprimirCampos();

    }

}