package gustavo.com.oo.oocomposicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gustavo Santos França");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 5.00,7);
        compra1.adicionarItem(new Produto("Notebook", 2500.00),1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10.00,2);
        compra2.adicionarItem(new Produto("Mochila", 150.00),1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());



    }
}
