package gustavo.com.oo.oocomposicao.heranca.desafio;

public class TestDrive {
    public static void main(String[] args) {

        Carro civic = new Civic(50);

        civic.acelear();
        System.out.println("Civic = " + civic);

        civic.acelear();
        System.out.println("Civic = " + civic);

        civic.acelear();
        System.out.println("Civic = " + civic);

        civic.freiar();
        System.out.println("Civic = " + civic);

        Carro bugatti = new Bugatti(200);

        bugatti.acelear();
        System.out.println("Bugatti = " + bugatti);
        bugatti.acelear();

        System.out.println("Bugatti = " + bugatti);
        bugatti.acelear();

        System.out.println("Bugatti = " + bugatti);
        bugatti.freiar();
        
        System.out.println("Bugatti = " + bugatti);

    }
}
