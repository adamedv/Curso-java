package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Aritemtica ***");
        //Objeto
        var aritmetica1 = new Aritmetica(20, 40);
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(5);
        aritmetica1.mostrarResultados();

        //Objeto
        var aritmetica2 = new Aritmetica(2, 0);
        aritmetica2.setOperando1(-3);
        aritmetica2.setOperando2(5);
        aritmetica2.mostrarResultados();

    }
}
