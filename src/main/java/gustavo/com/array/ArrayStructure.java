package gustavo.com.array;

public class ArrayStructure {

    public void arrayExample() {
        int[] num = new int[5];
        int[] num2 = {1, 2, 3, 4, 5};
        int firstElement = num2[0];
        int arrayLength = num.length;

        for (int i = 0; i < arrayLength; i++) {
            num[i] = i;
        }

        for (int numero : num2) {
            System.out.println(numero);
        }
    }

    public void arrayMultiDimensionalExample() {
        String[][] matriz = new String[3][3];
        String element = matriz[1][2];

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayStructure example = new ArrayStructure();
        example.arrayExample();
        example.arrayMultiDimensionalExample();
    }
}
