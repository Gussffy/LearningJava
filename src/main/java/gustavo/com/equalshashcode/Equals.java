package gustavo.com.equalshashcode;

public class Equals {

    public static void main(String[] args) {

        Usuario user1 = new Usuario();
        user1.nome = "Pedro Silva";
        user1.email = "pedro.silva@gmail.com";

        Usuario user2 = new Usuario();
        user2.nome = "Pedro Silva";
        user2.email = "pedro.silva@gmail.com";

        System.out.println( user1==user2);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));
    }
}
