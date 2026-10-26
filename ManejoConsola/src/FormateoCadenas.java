public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Adair";
        var edad = 23;
        var salaio = 1222.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salaio);
        System.out.println(mensaje);

        //Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",nombre,edad,salaio); //%n salto de línea

        var numeroEmpleado = 12;

        //Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                \tNombre = %s
                \tNo. Emplado = %04d;
                \tEdad = %d
                \tSalario = $%.2f
                """.formatted(nombre,numeroEmpleado,edad,salaio);
        System.out.println(mensaje);

        //Formateo con text block y printf
        System.out.printf("""
                %nDetalle Persona:\s
                \tNombre = %s
                \tNo. Emplado = %04d;
                \tEdad = %d
                \tSalario = $%.2f
                """,nombre,numeroEmpleado,edad,salaio);

    }
}
