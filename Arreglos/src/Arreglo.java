import java.util.Arrays;
import java.util.Scanner;

public class Arreglo {
    //Arreglos
    public static void main(String[] args) {
        var enteros = new int [5]; //Arreglo declarado e inicializado

        //Modificar los elementos
        enteros [0] = 13;
        enteros [1] = 21;
        enteros [4] = 62;

        //Leer los elementos de un arreglo
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 2: " + enteros[1]);
        System.out.println("Valor 5: " + enteros[4]);

        System.out.println(Arrays.toString(enteros));

        for(int i = 0; i < enteros.length; i++){
            System.out.println("Índice " + i + ": " + enteros[i]);
        }

        //Sintaxis simplificada
        var enteros1 = new int []{100,200,300,400,500};
        //Acceder a elementos
        System.out.println("Valor 1: " + enteros1[0]);
        System.out.println("Valor 2: " + enteros1[1]);
        System.out.println("Valor 3: " + enteros1[2]);
        System.out.println("Valor 4: " + enteros1[3]);
        System.out.println("Valor 5: " + enteros1[4]);
        //Imprimir el arreglo, imprime direccion de memoria
        System.out.println("Imprimir el arreglo: " + enteros1);

        for(int n = 0; n < enteros1.length; n++){
            System.out.println("Índice " + n + ": " + enteros1[n]);
        }


        //Introducir valores en un arreglo
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo: ");
        var largo = consola.nextInt();

        var arreglo = new int [largo];

        for(int a = 0; a < largo; a++){
            System.out.printf("Ingresa el valor del índice[%d]: ",a);
            arreglo[a] = Integer.parseInt(consola.next());
        }

        //Imprimir arreglo
        System.out.println("\nImpresión de arreglo: ");
        for(int a = 0; a < arreglo.length; a++){
            System.out.println("Índice " + a + ": " + arreglo[a]);
        }
    }
}
