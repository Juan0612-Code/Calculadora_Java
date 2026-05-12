public class Multiplicacion extends Calculadora {

    public Multiplicacion(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return num1 * num2;
    }
}