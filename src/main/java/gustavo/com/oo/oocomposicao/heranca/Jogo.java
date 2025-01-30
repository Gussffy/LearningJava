package gustavo.com.oo.oocomposicao.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador monstro1 = new Monstro("Goblin");
        monstro1.x = 10;
        monstro1.y = 10;

        Jogador heroi1 = new Heroi ("Steve Rogers");
        heroi1.x = 10;
        heroi1.y = 11;

        System.out.println(monstro1.hp);
        System.out.println(heroi1.hp);

        monstro1.atacar(heroi1);

        System.out.println(monstro1.hp);
        System.out.println(heroi1.hp);

    }
}
