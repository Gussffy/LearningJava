package gustavo.com.exceptions;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            gerarErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Fim do programa");

    }
    // Exceção NÃO checada
    static void gerarErro1(){
        throw new RuntimeException("Ocorreu o ERRO #01");
    }

    // Exceção checada
    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu o ERRO #02");
    }
}
