package exerciciosEmJava;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int anoDeNascimento = teclado.nextInt();
        System.out.println("Digite o ano do seu ingresso na empresa: ");
        int anoDoIngresso = teclado.nextInt();
        int idade = 2022 - anoDeNascimento;
        int tempoNaEmpresa = 2022 - anoDoIngresso;

        if (idade >= 65 || tempoNaEmpresa >= 30 || idade >= 60 && tempoNaEmpresa >= 25) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Nao requerer");
        }
    }
}
