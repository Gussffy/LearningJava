package gustavo.com.exceptions;

public class Aluno {

    public String nome;
    public int idade;
    public int nota;

    public Aluno(String nome, int idade, int nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + '}';
    }
}
