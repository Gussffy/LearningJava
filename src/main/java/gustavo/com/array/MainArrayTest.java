package gustavo.com.array;

public class MainArrayTest {
    public static void main(String[] args) {

        int[] arrayInt = new int[6];
        String[] arrayString = new String[4];

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        arrayString[0] = "Hello";
        arrayString[1] = "World";
        arrayString[2] = "!!!";

        System.out.println("Array de Inteiros");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Elementos no índice " + i + ": " + arrayInt[i]);
        }

        System.out.println("Array de Strings");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Strings no indice " + i + ": " + arrayString[i]);
        }


    }
}