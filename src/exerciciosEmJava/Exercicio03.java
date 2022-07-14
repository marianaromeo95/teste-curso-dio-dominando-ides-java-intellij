package exerciciosEmJava;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu salario bruto: ");
        int salarioBruto = teclado.nextInt();
        double salarioLiquido = 0, descontoExtra = 0;
        int extra;

        if (salarioBruto <= 1200) {
            salarioLiquido = salarioBruto * 0.89;
        } else if (salarioBruto > 1200) {
            salarioLiquido = salarioBruto * 0.89;
            extra = salarioBruto - 1200;
            descontoExtra = extra * 0.8;
            salarioLiquido += descontoExtra;
        }

        System.out.println("Meu salario liquido e R$" + salarioLiquido);

    }
}
