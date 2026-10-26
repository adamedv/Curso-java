public class JavaUnicode {
    public static void main(String[] args) {
        // Carácter Unicode para la letra A
        char letra = 'A';
        System.out.println("Cáracter: "+ letra);
        System.out.println("Código Unicode: "+ (int) letra);

        //Caracter Unicode para simbolo de euro
        char simboloEuro = '\u20AC';
        System.out.println("Cáracter: "+ simboloEuro);
        System.out.println("Código Unicode: "+ (int) simboloEuro);

        //Caracter Unicode para un caracter chino
        char caracterChino = '\u4E2D';
        System.out.println("Cáracter: "+ caracterChino);
        System.out.println("Código Unicode: "+ (int) caracterChino);

    }
}
