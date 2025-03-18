import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite a operação desejada: ");
        System.out.println("'+' - Soma");
        System.out.println("'-' - Subtração");
        System.out.println("'*' - Multiplicação");
        System.out.println("'/' - Divisão");
        char op = scan.next().charAt(0);
        double result = 0;
        if (op == '+') {
            result = num1 + num2;
            System.out.println("Resultado: " + df.format(result));
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Resultado: " + df.format(result));
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Resultado: " + df.format(result));
        } else if (op == '/') {
            result = num1 / num2;
            System.out.println("Resultado: " + df.format(result));
        } else {
            System.out.println("Operação inválida.");
        }
        scan.close();
    }
}
