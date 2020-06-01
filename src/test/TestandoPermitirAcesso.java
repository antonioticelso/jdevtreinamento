package test;

import constante.StatusAluno;
import interfaces.PermitirAcesso;
import model.Aluno;
import model.Disciplina;
import model.FuncaoAutenticacao;
import model.Secretario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestandoPermitirAcesso {
    public static void main(String[] args) {
        String login = JOptionPane.showInputDialog("Informe o login: ");
        String senha = JOptionPane.showInputDialog("Informe a senha: ");

//        FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

//        PermitirAcesso permitirAcesso = new Secretario(login, senha);

        if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
            List<Aluno> alunos = new ArrayList<Aluno>();

//        Lista de chave/valor
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            //            Criacao de lista de aluno e caracteristicas
            for (int qtd = 1; qtd < 5; qtd++) {
                String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " :");
                String idade = JOptionPane.showInputDialog("Idade do aluno: ");
                String dataNascimento = JOptionPane
                        .showInputDialog("Data de nascimento do aluno: ");
                String cpf = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
                String mae = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
                String pai = JOptionPane.showInputDialog("Nome do pai do aluno: ");

//            Criacao de lista de aluno
                final Aluno aluno1 = new Aluno();
                aluno1.setNome(nome);
                aluno1.setIdade(Integer.valueOf(idade));
                aluno1.setDataNascimento(dataNascimento);
                aluno1.setCpf(cpf);
                aluno1.setNomeMae(mae);
                aluno1.setNomePai(pai);

//            Criacao de lista de disciplina
                for (int pos = 1; pos < 5; pos++) {
                    String nomeDisciplina = JOptionPane
                            .showInputDialog("Nome da disciplina " + pos + " do aluno: ");
                    String notaDisciplina = JOptionPane
                            .showInputDialog("Nota da disciplina" + pos + " do aluno: ");
                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(notaDisciplina));
                    aluno1.getDisciplinas().add(disciplina);

                }

//            Varer lista para delecao de aluno
                int escolha = JOptionPane
                        .showConfirmDialog(null, "Deseja remover alguma disciplina? ");
                int posicao = 1;
                while (escolha == 0) {
                    String disciplinaRemover = JOptionPane
                            .showInputDialog("Qual o codigo da disciplina? ");
                    aluno1.getDisciplinas()
                            .remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    escolha = JOptionPane.showConfirmDialog
                            (null, "Continuar remover alguma disciplina? ");

                }
                alunos.add(aluno1);
            }

//        Listas por status

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO);
                }else
                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO);
                } else {
                    maps.get(StatusAluno.REPROVADO);
                }
            }


//        Listas separadas de Alunos
            System.out.println("Lista dos Aprovados");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Aluno: " + aluno.getAlunoAprovado()
                        + aluno.getNome() + " media: " + aluno.getMediaNota());
            }
            System.out.println("Lista em Recuperacao");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Aluno: " + aluno.getAlunoAprovado()
                        + aluno.getNome() + " media: " + aluno.getMediaNota());
            }
            System.out.println("Lista dos Reprovados");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Aluno: " + aluno.getAlunoAprovado()
                        + aluno.getNome() + " media: " + aluno.getMediaNota());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Acesso não permitido.");
            System.out.println("Usuario nao possui acesso. \nO programa sera finalizado.");

        }




    }
}
