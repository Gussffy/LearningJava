package gustavo.com.exceptions;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 23, 10);

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Usuário não pode ser nulo");
        }

        try {
            System.out.println( 7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero");
        }

        System.out.println("Fim :) ");
    }
    public static void imprimirNomeDoAluno (Aluno aluno) {
        System.out.println(aluno);
    }
}
