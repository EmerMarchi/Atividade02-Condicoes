import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double idade = 0d;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextDouble();
        if (idade >= 18) {
            System.out.println("É maior de idade!");
        }
        else if ( idade < 18 ) {
            System.out.println("É menor de idade!");
        }
    }
}