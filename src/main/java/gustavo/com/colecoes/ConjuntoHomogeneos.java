package gustavo.com.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneos {
    public static void main(String[] args) {

        SortedSet<String> listAprovados = new TreeSet<>();

        listAprovados.add("Ana");
        listAprovados.add("Pedro");
        listAprovados.add("Rodrigo");
        listAprovados.add("Maria");

        for(String nome: listAprovados){
            System.out.println(nome);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for(Integer num: nums){
            System.out.println(num);
        }

    }
}
