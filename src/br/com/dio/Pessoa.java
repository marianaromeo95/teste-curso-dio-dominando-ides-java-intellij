package br.com.dio;

public class Pessoa {
    private Integer idade;
    private String nome;

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pessoa mariana = new Pessoa();
        mariana.setIdade(25);
        mariana.setNome("Mariana");

        System.out.println(mariana);
    }
}
