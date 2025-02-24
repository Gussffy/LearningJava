package gustavo.com.exceptions.personalizadaB;

import gustavo.com.exceptions.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {


        Aluno aluno = null;

        try {
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(aluno);


        System.out.println("Fim :) ");
    }
}
