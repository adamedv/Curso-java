package aritmetica;

public class Aritmetica {
    private double operando1; //Deben ser encapsulados
    private double operando2;

    //Sobrecarga de constructores
//    public Aritmetica(){
//    }

    //Constructor
    public Aritmetica(double op1, double op2) {
        //System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }

     public double suma() {
        return operando1 + operando2;
    }

    public double resta() {
        return operando1 - operando2;
    }

    public double multiplicacion() {
        return operando1 * operando2;
    }

    public double division() {
        if (operando2 == 0) {
            return Double.NaN;
        }else {
            return operando1 / operando2;
        }
    }

    public double getOperando1() {
        return this.operando1;
    }

    public double setOperando1(double operando1) {
        return this.operando1 = operando1;
    }

    public double getOperando2() {
        return this.operando2;
    }

    public double setOperando2(double operando2) {
        return this.operando2 = operando2;
    }

    public void mostrarResultados() {
        System.out.println("*** Resultados para los operandos: " + operando1 + " y " + operando2 + " ***");
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("División: " + division());
        System.out.println("Atributo operando1: " + getOperando1());
        System.out.println("Atributo operando2: " + getOperando2());
        System.out.println("----------------------------------------");
    }

}
