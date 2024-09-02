import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um temperatura em Celsius: ");
        double temp = sc.nextDouble();
        if (temp > 30) {
            System.out.println("O clima está quente com uma temperatura de " + temp + "ºC");
        }
        else if (temp > 15 && temp <= 30) {
            System.out.println("O clima está agradável com uma temperatura de " + temp + "ºC");
        }
        else if (temp <= 15) {
            System.out.println("O clima está Frio com uma temperatura de " + temp + "ºC");
        }
    }
}
