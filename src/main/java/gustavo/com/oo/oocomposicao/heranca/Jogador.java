package gustavo.com.oo.oocomposicao.heranca;

public class Jogador {


    int hp = 100;
    int x;
    int y;

    boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.hp -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.hp -= 10;
            return true;
        } else {
            return false;
        }

        return true;
    }

    boolean andar(Direcao direcao){

         switch (direcao){
             case NORTE:
                 y++;
                 break;
             case LESTE:
                 x++;
                 break;
             case SUL:
                 y--;
                 break;
             case OESTE:
                 x--;
                 break;
         }

        return true;
    }

}
