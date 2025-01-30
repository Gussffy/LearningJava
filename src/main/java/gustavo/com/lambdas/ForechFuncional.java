package gustavo.com.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForechFuncional {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lia", "Bia", "Gui");

        System.out.println("Foreach Tradicional");
        for (String nomes : aprovados) {
            System.out.println(nomes);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nomes -> System.out.println(nomes + "!!!"));

        System.out.println("\nMethod Reference #01...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nomes -> meuimprimir(nomes));

        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(ForechFuncional::meuimprimir);

    }
    static void meuimprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }
}
