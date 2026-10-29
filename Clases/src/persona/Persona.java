package persona;

public class Persona {

    private String nombre;
    private String apellido;
    String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; //No regresan ningún valor solo lo cambian
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido; //No regresan ningún valor solo lo cambian
    }

    public void mostarPersona(){
        System.out.println("*** Mostrar Persona ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
    }

}