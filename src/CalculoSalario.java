import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bonus = 0d;
        double imposto = 0d;

        System.out.println("Insira o salário do funcionario:");
        double salario = sc.nextDouble();
        System.out.println("Insira a quantidade de anos trabalhados na empresa:");
        double anos = sc.nextDouble();

        if (anos >= 10){
            bonus = salario * 0.10;
        }
        else if (anos >= 5 && anos < 10){
            bonus = salario * 0.05;
        }
        else if (anos < 5  ){
            bonus = 0;
        }
        if (salario >= 5000){
            imposto = salario * 0.27;
        }
        else if (salario >= 3000 && salario < 5000){
            imposto = salario * 0.18;
        }
        else if (salario < 3000){
            imposto = salario * 0.10;
        }
        System.out.println("Salário bruto =" + salario);
        System.out.println("Bônus = " + bonus);
        System.out.println("Imposto = " + imposto);
        System.out.println("Salário líquido= " + (salario + bonus - imposto));

    }
}
