package exerciciosEmJava;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero = teclado.nextInt();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("Numero e divisivel por 5 e 3.");
        } else {
            System.out.println("Numero nao e divisivel por 5 e 3.");
        }

    }


}
