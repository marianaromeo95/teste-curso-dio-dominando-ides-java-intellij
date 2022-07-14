package exerciciosEmJava;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas maçãs foram compradas? ");
        int macasCompradas = teclado.nextInt();
        double precoFruta = 0, total = 0;

        if (macasCompradas >= 12) {
            precoFruta = 1;
            total = macasCompradas * precoFruta;

        } else {
            precoFruta = 1.3;
            total = macasCompradas * precoFruta;
        }

        System.out.println("O valor total da compra de macas e: R$" + total);

    }
}


