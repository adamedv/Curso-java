package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos persona.Persona ***");
        var persona1 = new Persona();
        persona1.setNombre("Adair");
        persona1.setApellido("Medina");
        persona1.direccion = "Calle Morelos 1456";
        persona1.mostarPersona();

        var persona2 = new Persona();
        persona2.setNombre("Irma");
        persona2.setApellido("Velazquez");
        System.out.println("Atributo operando1: "+ persona2.getNombre());
        System.out.println("Atributo operando2: "+ persona2.getApellido());
        persona2.direccion = "Calle Morelos 1456";
        persona2.mostarPersona();
    }
}
