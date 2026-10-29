public class Persona {

    String nombre;
    String apellido;
    String direccion;
    String telefono;

    void mostarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Adair";
        objeto1.apellido = "Medina";
        objeto1.direccion = "Calle Morelos 1456";
        objeto1.mostarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Irma";
        objeto2.apellido = "Velázquez";
        objeto2.direccion = "Calle Morelos 1456";
        objeto2.mostarPersona();
    }
}