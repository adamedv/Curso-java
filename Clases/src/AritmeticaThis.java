public class AritmeticaThis {
    double operando1;
    double operando2;

    //Sobrecarga de constructores
    public AritmeticaThis(){
    }

    //Constructor
    public AritmeticaThis(double operando1, double operando2) {
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this: " + this);
    }
    //Se deben de llamar igual, ayuda el this para hacer
    // referencia a los atributos de la clase
    // y solo se pueden usar dentro la clase

    double suma() {
        return this.operando1 + this.operando2;
    }

    double resta() {
        return this.operando1 - this.operando2;
    }

    double multiplicacion() {
        return this.operando1 * this.operando2;
    }

    double division() {
        if (this.operando2 == 0) {
            return Double.NaN;
        }else {
            return this.operando1 / this.operando2;
        }
    }

    public static void main(String[] args) {
        System.out.println("*** Aritemtica ***");
        var aritmeticaThis1 = new AritmeticaThis(20,40);
        System.out.println(aritmeticaThis1.suma());
        System.out.println(aritmeticaThis1.resta());
        System.out.println(aritmeticaThis1.multiplicacion());
        System.out.println(aritmeticaThis1.division());
        System.out.println("Dirección de memoria objeto 1: " + aritmeticaThis1);

        var aritmeticaThis2 = new AritmeticaThis();
        aritmeticaThis2.operando1 = 5;
        aritmeticaThis2.operando2 = 0;
        System.out.println(aritmeticaThis2.suma());
        System.out.println(aritmeticaThis2.resta());
        System.out.println(aritmeticaThis2.multiplicacion());
        System.out.println(aritmeticaThis2.division());
        System.out.println("Dirección de memoria objeto 2: " + aritmeticaThis2);
    }
}
