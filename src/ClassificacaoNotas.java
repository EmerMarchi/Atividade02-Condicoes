import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 2;

        if (nota >= 9){
            System.out.println("Exelente!");
            }
        else if (nota >= 7){
            System.out.println("Bom!");
            }
        else if (nota >= 5){
            System.out.println("Satisfatório!");
            }
        else if (nota < 5){
            System.out.println("Insatisfatório!");
            }
        }
}
