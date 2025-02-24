package gustavo.com.exceptions.personalizadaB;

import gustavo.com.exceptions.Aluno;

public class Validar {

    private Validar() {}

    public static void aluno (Aluno aluno)
            throws StringVaziaException, NumeroForaIntervaloException,IllegalArgumentException

    {
        if (aluno == null) {
            throw new IllegalArgumentException("o Aluno está nulo");
        }
        if (aluno.getNome() == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }
        if (aluno.getNota() < 0 || aluno.getNota() > 10) {
            throw new NumeroForaIntervaloException("nota");
        }

    }
}
