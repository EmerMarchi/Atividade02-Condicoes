import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = 8;

        if (num % 2 == 0) {
            System.out.println("Par");
        }
        else { System.out.println("Ímpar");}
    }
}
