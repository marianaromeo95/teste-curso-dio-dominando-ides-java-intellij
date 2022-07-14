package exerciciosEmJava;
import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o horario de inicio da partida (1-24): ");
        int horarioDeInicio = teclado.nextInt();
        System.out.println("Digite o horario do fim da partida (1-24): ");
        int horarioFim = teclado.nextInt();
        int total = 0;

        if (horarioDeInicio > horarioFim ) {
           total =  (24 - horarioDeInicio) + horarioFim;
            System.out.println("Total de horas da partida: " + total);
        } else {
            total = horarioFim - horarioDeInicio;
            System.out.println("Total de horas da partida: " +total);
        }
    }
}
