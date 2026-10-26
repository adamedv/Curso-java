public class masConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Cadena 3 con + = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("Cadena 3 con 'concat' = " + cadena3);

        //Metodo StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado1 = constructorCadenas.toString();
        System.out.println("Cadena 3 con 'StringBuilder' = " + resultado1);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado2= stringBuffer.toString();
        System.out.println("Cadena 3 con 'String Buffer' = " + resultado2);

        //Join
        var resultado3 = String.join(" ",cadena1,cadena2);
        System.out.println("Cadena 3 con 'Join' = " + resultado3);

    }
}
