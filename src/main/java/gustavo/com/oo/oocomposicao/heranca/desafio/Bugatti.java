package gustavo.com.oo.oocomposicao.heranca.desafio;

public class Bugatti extends Carro{

    Bugatti(int VELOCIDADE_MAX){
        super(VELOCIDADE_MAX);
        delta = 15;
    }

    @Override
    void acelear() {
       currentSpeed += delta;
    }

    @Override
    void freiar() {
        super.freiar();
    }
}
