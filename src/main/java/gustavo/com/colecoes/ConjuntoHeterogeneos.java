package gustavo.com.colecoes;

import java.util.HashSet;
import java.util.Set;


@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoHeterogeneos {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println(conjunto.remove("teste"));
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains("teste"));
        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //Junção entre dois Conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
