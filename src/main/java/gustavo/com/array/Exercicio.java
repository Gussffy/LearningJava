package gustavo.com.array;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        //Array Aluno A
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7;
        notasAlunoA[1] = 7;
        notasAlunoA[2] = 7;
        notasAlunoA[3] = 7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total / notasAlunoA.length);


        //Array Aluno B
        double[] notasAlunoB = {7, 7, 7, 7};

        double totalAlunoB = 0;
        System.out.println(Arrays.toString(notasAlunoB));

        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
