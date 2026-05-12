public class Suma extends Calculadora {

    public Suma(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        return num1 + num2;
    }
}