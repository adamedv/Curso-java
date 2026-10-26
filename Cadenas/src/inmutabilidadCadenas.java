public class inmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad de cadenas
        String cadena1 = "Hola";
        String cadena1_5 = "Hola";
        String cadena2 = new String("Hola");

        // Obtener la ubicación/hash de memoria único de cada variable
        int memoriaCadena1 = System.identityHashCode(cadena1);
        int memoriaCadena1_5 = System.identityHashCode(cadena1_5);
        int memoriaCadena2 = System.identityHashCode(cadena2);

        // Mostrar en consola (tanto en número entero como en Hexadecimal)
        System.out.println("cadena1 -> Memoria (Decimal): " + memoriaCadena1);
        System.out.println("cadena1 -> Memoria (Hex): " + Integer.toHexString(memoriaCadena1));

        System.out.println("----------------------------------------");

        System.out.println("cadena1_5 -> Memoria (Decimal): " + memoriaCadena1_5);
        System.out.println("cadena1_5 -> Memoria (Hex): " + Integer.toHexString(memoriaCadena1_5));

        System.out.println("----------------------------------------");

        System.out.println("cadena2 -> Memoria (Decimal): " + memoriaCadena2);
        System.out.println("cadena2 -> Memoria (Hex): " + Integer.toHexString(memoriaCadena2));
    }
}
