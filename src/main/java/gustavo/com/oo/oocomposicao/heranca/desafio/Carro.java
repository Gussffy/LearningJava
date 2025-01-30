package gustavo.com.oo.oocomposicao.heranca.desafio;

public class Carro {

    final int VELOCIADE_MAX;
    int currentSpeed;
    int delta = 5;

    Carro(int velocidadeMax) {
        VELOCIADE_MAX = velocidadeMax;
    }

    void acelear(){
        if (currentSpeed + delta > VELOCIADE_MAX){
            currentSpeed = VELOCIADE_MAX;
        } else {
            currentSpeed += delta;
        }
    }

    void freiar(){
        if(currentSpeed >= 5){
            currentSpeed -= 5;
        }else{
            currentSpeed = 0;
        }
    }
     public String toString(){
        return "[currentSpeed= " + currentSpeed + " KM/H ]";
    }
}
