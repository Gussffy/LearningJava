package gustavo.com.exceptions.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;


    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage (){
        return String.format("O atributo '%s' está vázio ", nomeDoAtributo);
    }
}
