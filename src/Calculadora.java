import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primero número:");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Digite '1' para adição\nDigite '2' para subtração\nDigite '3' para multiplicação\nDigite '4' para divisão");
        int operacao = sc.nextInt();
        if (operacao == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (operacao == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (operacao == 3) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (operacao == 4) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}