package gustavo.com.exceptions.personalizadaA;

import gustavo.com.exceptions.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {


        Aluno aluno = new Aluno("Lázia", 20, -7);

        try {
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(aluno);


        System.out.println("Fim :) ");
    }
}
