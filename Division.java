public class Division extends Calculadora {

    public Division(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular() {
        if (num2 == 0) {
            return 0; // puedes cambiar esto si quieres manejar error
        }
        return num1 / num2;
    }
}