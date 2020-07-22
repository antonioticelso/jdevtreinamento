package test;

import model.Aluno;
import model.Diretor;
import abstracts.Pessoa;
import model.Secretario;

public class TestandoAlunoDiretorSecretario {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Jackyson");

        Diretor diretor = new Diretor();
        diretor.setNome("Bedel");

        Secretario secretario = new Secretario();
        secretario.setNome("Oswaldo");

        teste(aluno);
        teste(diretor);
        teste(secretario);
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais - "
                + pessoa.getNome() + " e o salário é de R$ "
                + pessoa.salario());
    }

}


