package exerciciosEmJava;

public class Fibonacci {
    /*
    Faça um algoritmo que imprima os primeiros 50 termos da série de Fibonacci. Considere
que a série de Fibonacci é formada pelos seguintes termos: 1, 1, 2, 3, 5, 8, 13..., onde o
valor de cada termo da sequência é a soma dos dois termos anteriores. Ou seja, o próximo
termo será 21 (13 + 8).
     */

    public static void main(String[] args) {

        int numeroAnterior = 1; // 2
        int numeroPosterior = 1; //  3
        int numeroAtual = 1; // 3



        for (int i = 1; i <= 50; i++) {
            if (i == 1) {
                System.out.println(i);
            }
            System.out.println(numeroAtual);
            numeroAtual = numeroAnterior + numeroPosterior;
            numeroAnterior = numeroPosterior;
            numeroPosterior = numeroAtual;
        }

//        Fibonacci x = new Fibonacci();
//        System.out.println(x.fibbonach(5));
    }

//    public int fibbonach(int value) {
//        if(value <= 1) {
//            return 1;
//        }
//        return fibbonach(value - 2) + fibbonach(value - 1);
//    }



}