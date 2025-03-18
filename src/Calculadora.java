import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite a operação desejada: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int op = scan.nextInt();
        double result = 0;
        if (op == 1) {
            result = num1 + num2;
            System.out.println("Resultado: " + result);
        } else if (op == 2) {
            result = num1 - num2;
            System.out.println("Resultado: " + result);
        } else if (op == 3) {
            result = num1 * num2;
            System.out.println("Resultado: " + result);
        } else if (op == 4) {
            result = num1 / num2;
            System.out.println("Resultado: " + result);
        } else {
            System.out.println("Operação inválida.");
        }
        scan.close();
    }
}
