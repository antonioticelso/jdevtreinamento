package model;

public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


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

    public int getIdade() {
        return idade;
    }

    public Aluno setIdade(int idade) {
        this.idade = idade;
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

    public double getNota1() {
        return nota1;
    }

    public Aluno setNota1(double nota1) {
        this.nota1 = nota1;
        return this;
    }

    public double getNota2() {
        return nota2;
    }

    public Aluno setNota2(double nota2) {
        this.nota2 = nota2;
        return this;
    }

    public double getNota3() {
        return nota3;
    }

    public Aluno setNota3(double nota3) {
        this.nota3 = nota3;
        return this;
    }

    public double getNota4() {
        return nota4;
    }

    public Aluno setNota4(double nota4) {
        this.nota4 = nota4;
        return this;
    }

    public double getMediaNota() {
        return ((nota1 + nota2 + nota3 + nota4) /4);
    }

    public boolean getResultado() {
        double media = this.getMediaNota();
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }



}


