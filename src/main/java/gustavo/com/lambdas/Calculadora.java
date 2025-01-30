package gustavo.com.lambdas;

public class Calculadora {
    public static void main(String[] args) {


        Soma soma = new Soma();
        System.out.println("Soma = " + soma.calcular(10,2));

        Subtracao subtracao = new Subtracao();
        System.out.println("Subtracao = " + subtracao.calcular(10,2));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println("Multiplicacao = " + multiplicacao.calcular(10,2));

        Divisao divisao = new Divisao();
        System.out.println("Divisao = " + divisao.calcular(10,2));


       //LAMBDAS

       Calculo soma2 = (x, y) -> x + y;
       System.out.println("Soma = " + soma2.calcular(10,2));

       Calculo subtracao2 = (x, y) -> x - y;
       System.out.println("Subtração = " + subtracao2.calcular(10,2));

       Calculo multiplicacao2 = (x, y) -> x * y;
       System.out.println("Multiplicação = " + multiplicacao2.calcular(10,2));

       Calculo divisao2 = (x, y) -> x / y;
       System.out.println("Divisão = " + divisao2.calcular(10,2));

    }
}
