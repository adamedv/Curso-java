public class indicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";

        //Recuperar 1er caracter
        var primerCaracter = cadena1.charAt(0); //Recupera "H"
        System.out.println("Primer Caracter = " + primerCaracter);

        //Recuperar ultimo caracter
        var ultimoCaracter = cadena1.charAt(9); //Recupera "H"
        System.out.println("Ultimo Caracter = " + ultimoCaracter);

        //Imprimir letra M
        var letraM = cadena1.charAt(5);
        System.out.println("Letra M = " + letraM);
    }
}
