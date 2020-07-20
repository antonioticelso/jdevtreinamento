package model;

public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;

    public Aluno() {
//        Construtor do Java por The Full;
    }
    public Aluno (String nomePadrao) {
//        Construtor da Maria;
        nome = nomePadrao;
    }
    public Aluno (String nomePadrao, int idadePadrao) {
//        Construtor da Mariana;
        nome = nomePadrao;
        idade = idadePadrao;
    }

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Aluno setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Aluno setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public Aluno setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
        return this;
    }

    public String getNomePai() {
        return nomePai;
    }

    public Aluno setNomePai(String nomePai) {
        this.nomePai = nomePai;
        return this;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public Aluno setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
        return this;
    }

}
