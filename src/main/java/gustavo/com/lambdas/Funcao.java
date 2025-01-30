package gustavo.com.lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImmpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImmpar.apply(10));

        Function <String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function <String, String> empolgado = valor -> valor + "!!!!";

        Scanner scanner = new Scanner(System.in);

        String resultadoFinal = parOuImmpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(scanner.nextInt());
        System.out.println(resultadoFinal);

        scanner.close();
    }
}
