public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //Sin el uso de var
        String nombre1 = "Adair";
        System.out.println("Nombre 1: "+nombre1);

        // Con var
        var nombre2 = "Emmanuel";
        System.out.println("Nombre 2: "+nombre2);

        //Defininr otras variables usando va
        var edad = 23; //Tipo int
        System.out.println("Edad = "+edad);

        var sueldo = 5000.5F; //Tipo float
        var esCasado = false; //Tipo boolean
        esCasado = true;
        //esCasado = "No" ; No podemos asignar un tipo distinto al que se le dio al inicio

        // Se debe defnir su valor
        //var precio;
        //precio = 10;

        //Se debe poder inferir el tipo de dato
        //var apellido = null ** No se puede


    }
}
