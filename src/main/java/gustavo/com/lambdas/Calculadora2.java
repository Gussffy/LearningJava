package gustavo.com.lambdas;

import java.util.function.BinaryOperator;

public class Calculadora2 {
    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(1.0, 2.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(10.0, 2.0));

        calc = (x, y) -> x / y;
        System.out.println(calc.apply(6.0, 2.0));


    }
}
