public class ClaseEnvolvente {
    public static void main(String[] args) {
        int numeroint = 42;
        System.out.println("int\n");

        //Convertir a cadena
        String numeroStr= Integer.toString(numeroint);
        System.out.println("Número con cadena: "+ numeroStr);

        //Valor máximo y mínimo
        System.out.println("Valor máximo de int: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de int: "+ Integer.MIN_VALUE);

        //Parsear cadena a entero, de string a int
        int parsedNumero = Integer.parseInt("123");
        System.out.println("Número parseado: "+ parsedNumero + "\n");

        double numerodouble = 3.14159;
        System.out.println("double\n");

        // Convertir a cadena
        String numeroStrdouble = Double.toString(numerodouble);
        System.out.println("Número con cadena: "+ numeroStrdouble);

        //Valor máximo y mínimo
        System.out.println("Valor máximo de double: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de double: "+ Integer.MIN_VALUE);

        //Parsear cadena a entero, de string a int
        double parsedNumerodouble = Double.parseDouble("2.71828");
        System.out.println("Número parseado: "+ parsedNumerodouble + "\n");

        char letra = 'a';
        System.out.println("char\n");

        //Convertir a mayúscula
        char mayuscula = Character.toUpperCase(letra);
        System.out.println("Letra mayúscula: "+ mayuscula);
        char minuscula = Character.toLowerCase(mayuscula);
        System.out.println("Letra minúscula: "+minuscula);

        //Verificar si es una letra
        System.out.println("Es una letra: "+ Character.isLetter(letra));

        //Verificar si es un dígito
        char digito = '1';
        System.out.println("Es " + digito + " un dígito: "+ Character.isDigit(digito));
    }
}
