import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double desconto = 0d;

        System.out.println("Digite o valor total da compra: ");
        double valor = sc.nextDouble();
        if (valor >= 500) {
            desconto = valor * 0.20;
        }
        else if (valor >= 200 && valor < 500) {
            desconto = valor * 0.10;
        }
        else if (valor >= 100 && valor < 200) {
            desconto = valor * 0.05;
        }
        else if (valor < 100) {
            desconto = 0;
        }
        System.out.println("Valor total da compra: " + valor);
        System.out.println("Valor do Desconto: " + desconto);
        System.out.println("Valor Liquido: " + (valor - desconto));
    }
}