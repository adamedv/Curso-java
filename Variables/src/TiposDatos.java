public class TiposDatos {
    public static void main(String[] args) {
        // Variables primitivas
        byte tipoByte = 127;
        System.out.println("TipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = "+ tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = "+ tipoInt);
        long tipoLong = 9_223_372_036_854_775_807L;
        System.out.println("tipoLong = "+ tipoLong);

        //Punto Flotante
        float tipoFloat = 3.14F; // F o f indicar tipo float
        System.out.println("tipoFloat = "+ tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar double, numeros con punto los toma como double en automatico
        System.out.println("tipoDouble = "+ tipoDouble);

        // Caracter
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("Tipo Char = "+ tipoChar);
        tipoChar = 65;
        System.out.println("Tipo Char = "+ tipoChar);
        tipoChar = '@';
        System.out.println("Tipo Char = "+ tipoChar);

        //Booleano
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = "+ nombre);
        nombre = "Adair Medina";
        System.out.println("nombre = "+nombre);
    }
}
