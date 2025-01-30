package gustavo.com.lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> prod.preco * (1 - prod.desconto) >= 2050;

        Produto produto = new Produto("Notebook", 2839.90, 0.70);

        System.out.println(isCaro.test(produto));
    }
}
