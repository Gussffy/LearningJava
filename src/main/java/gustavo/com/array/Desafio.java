package gustavo.com.array;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Quantas Notas:");

        int qtdeNotas = sc.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A média é: " + media+ "!");
        sc.close();
    }

}
