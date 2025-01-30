package gustavo.com.lambdas;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        Scanner sc = new Scanner(System.in);

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(sc.nextInt());

        System.out.println(resultado1);

        int resultado2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(sc.nextInt());

        System.out.println(resultado2);
    }
}
