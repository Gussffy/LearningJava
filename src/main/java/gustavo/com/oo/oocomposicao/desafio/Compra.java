package gustavo.com.oo.oocomposicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quant) {
        this.itens.add(new Item(p, quant));
    }
    void adicionarItem(String nome, double preco, int quant) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quant));
    }
    double obterValorTotal() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
