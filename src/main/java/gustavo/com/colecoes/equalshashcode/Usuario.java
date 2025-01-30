package gustavo.com.colecoes.equalshashcode;

public class Usuario {

    String nome;
    String email;


    // Implementando metodo equals
    @Override
    public boolean equals(Object obj) {

        if ( obj instanceof Usuario ) {
            Usuario usuario = (Usuario) obj;

            boolean nomeIgual = usuario.nome.equals(this.nome);
            boolean emailIgual = usuario.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        return false;
    }

}
