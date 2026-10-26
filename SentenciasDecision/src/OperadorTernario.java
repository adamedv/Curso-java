public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternieio ***");
        var numero = 0;
        var edad = 11;

        // Par o impar
        var resultado = (numero%2 == 0) ? "Es par" : "Es impar";
        System.out.println("El número: " + numero + "\n" + resultado);

        // Mayor de edad
        resultado = (edad>=18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.printf("Con %d %s\n",edad,resultado);

        // Valor positivo, negativo o cero (Ternario anidado)
        resultado = (numero>0) ? "Es positivo" : (numero!=0) ? "Es negativo" : "Es cero" ;
        System.out.printf("El número: %d %s",numero,resultado);
    }
}
