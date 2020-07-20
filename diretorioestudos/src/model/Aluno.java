package model;

import abstracts.Pessoa;
import constante.StatusAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private String serieMatricculada;
    private String nomeEscola;
    private String dataMatricula;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

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

    @Override
    public double salario() {
        return 1500.00;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getMediaNota() {
        double somaNotas = 0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();

        }

        return somaNotas / disciplinas.size();
    }

    public String getResultado() {
        double media = this.getMediaNota();
        if (media >= 5) {
            if (media >=7) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    public String getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 5) {
            if (media >=7) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }

}


