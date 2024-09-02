import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("É positivo!");
        }
        else if (num < 0){
            System.out.println("É negativo!");
        }
        else{
            System.out.println("É zero");
        }
    }
}
