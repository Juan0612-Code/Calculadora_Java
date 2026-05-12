import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double num1 = parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Opciones del menú
        String[] opciones = {"Suma", "Resta", "Multiplicación", "División", "Promedio"};

        // Mostrar lista desplegable
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una operación:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        String resultado = "";

        if (seleccion != null) {

            switch (seleccion) {

                case "Suma":
                    resultado = "Resultado: " + new Suma(num1, num2).calcular();
                    break;

                case "Resta":
                    resultado = "Resultado: " + new Resta(num1, num2).calcular();
                    break;

                case "Multiplicación":
                    resultado = "Resultado: " + new Multiplicacion(num1, num2).calcular();
                    break;

                case "División":
                    if (num2 == 0) {
                        resultado = "Error: No se puede dividir entre 0";
                    } else {
                        resultado = "Resultado: " + new Division(num1, num2).calcular();
                    }
                    break;

                case "Promedio":
                    resultado = "Resultado: " + new Promedio(num1, num2).calcular();
                    break;
            }

            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    public static double parseDouble(String texto) {
        texto = texto.replace(",", ".");
        return Double.parseDouble(texto);
    }
}