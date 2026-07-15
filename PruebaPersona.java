

// 1. Clase Molde
class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private int peso;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setPeso(int peso) { this.peso = peso; }

    public void imprimirCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ap. Paterno: " + apellidoPaterno);
        System.out.println("Ap. Materno: " + apellidoMaterno);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }
}

// 2. Clase de Prueba (Debe llevar "public" y el archivo debe llamarse PruebaPersona.java)
public class PruebaPersona { 
    public static void main(String[] args) { 
        Persona persona1 = new Persona(); 
        
        persona1.imprimirCampos(); 
        System.out.println(); 
        
        persona1.setNombre("Alex"); 
        persona1.setApellidoPaterno("Torres"); 
        persona1.setApellidoMaterno("Flores"); 
        persona1.setEdad(20); 
        persona1.setPeso(56); 
        
        persona1.imprimirCampos(); 
    } 
}
