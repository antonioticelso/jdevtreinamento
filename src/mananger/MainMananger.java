package mananger;

import constante.StatusAluno;
import execao.ExecaoProcessarNota;
import model.Aluno;
import model.Disciplina;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainMananger {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        try {
            lerArquivo();

            String login = JOptionPane.showInputDialog("Informe o login: ");
            String senha = JOptionPane.showInputDialog("Informe a senha: ");

            if (login.equalsIgnoreCase("admin") &&
                    senha.equalsIgnoreCase("admin")) {
                List<Aluno> alunos = new ArrayList<>();

//        Lista de chave/valor
                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

//        Lista de valor
//        List<Aluno> alunosAprovados = new ArrayList<>();
//        List<Aluno> alunosRecuperacao = new ArrayList<>();
//        List<Aluno> alunosReprovados = new ArrayList<>();

//            Criacao de lista de aluno e caracteristicas
                for (int qtd = 1; qtd < 5; qtd++) {
                    String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + " :");
                    String idade = JOptionPane.showInputDialog("Idade do aluno: ");
                    String dataNascimento = JOptionPane
                            .showInputDialog("Data de nascimento do aluno: ");
                    String cpf = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
                    String mae = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
                    String pai = JOptionPane.showInputDialog("Nome do pai do aluno: ");

//        String disciplina1 = JOptionPane.showInputDialog("Nome da disciplina do aluno: ");

//        String n1 = JOptionPane.showInputDialog("Nota 1 do aluno: ");

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
                    } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
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
                System.out.println("Usuario nao possui acesso. \nO programa sera finalizado.");
            }

        } catch (Exception e) {
            StringBuilder saida = new StringBuilder();
            e.printStackTrace();

            System.out.println("Mensagem: " + e.getMessage());

            for (int i = 0; i <= e.getStackTrace().length; i ++) {
                saida.append("Classe de erro: " + e.getStackTrace()[i].getClassName());
                saida.append("Método de erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("Linha de erro: " + e.getStackTrace()[i].getLineNumber());
                saida.append("\n Class: " + e.getClass().getName());

            }
            JOptionPane.showMessageDialog(null, "Erro ao processar notas."
                    + saida.toString());

        } finally {
            JOptionPane.showMessageDialog(null, "Obrigado pela preferência");
        }



////            Gerar lista de aluno com notas e medias
//        for (int pos = 0; pos <= alunos.size(); pos++) {
//            Aluno aluno = alunos.get(pos);
//
////            Substituir alunos
//            if (aluno.getNome().equalsIgnoreCase("alex")) {
//                Aluno trocar = new Aluno();
//                trocar.setNome("Aluno foi trocado");
//
//                Disciplina disciplina = new Disciplina();
//                disciplina.setDisciplina("React Nature");
//                disciplina.setNota(90);
//
//                trocar.getDisciplinas().add(disciplina);
//
//                alunos.set(pos,trocar);
//                aluno = alunos.get(pos);
//            }
//
//            System.out.println("Aluno " + aluno.getNome());
//            System.out.println("Aluno " + aluno.getMediaNota());
//            System.out.println("Aluno " + aluno.getResultado());
//
//            for (int posd = 0; posd <= aluno.getDisciplinas().size(); posd++) {
//                Disciplina disc = aluno.getDisciplinas().get(posd);
//                System.out.println("Materia: " + disc.getDisciplina() + " Nota: " + disc.getNota());
//            }
//            System.out.println("*****************************************************");
//
//        }

//        Busca de aluno
//        for (Aluno aluno : alunos) {
//            String alunoBusca = JOptionPane.showInputDialog("Qual o aluno deseja encontrar? ");
//            if (aluno.getNome().equalsIgnoreCase(alunoBusca)) {
//                alunos.remove(aluno);
//                break;
//            } else {
//                System.out.println("Nome do aluno é " + aluno.getNome());
//                System.out.println("A idade do aluno é " + aluno.getIdade());
//                System.out.println("A data de nascimento do aluno é "
//                        + aluno.getDataNascimento());
//                System.out.println("Média do aluno: " + aluno.getMediaNota());
//                System.out.println("Resultado: "
//                        + (aluno.getResultado()));
//                System.out.println("*****************************************************");
//            }
//
//        }

//        Lista de alunos pos deletar
//        for (Aluno aluno : alunos) {
//            System.out.println("Aluno que sobraram na lista: ");
//            System.out.println(aluno.getNome());
//            System.out.println("Suas materias sao: ");
//
//            for (Disciplina disciplina : aluno.getDisciplinas()) {
//                System.out.println(disciplina.getDisciplina());
////                System.out.println(disciplina.getNota());
//                System.out.println("*********************************************");
//            }
//
//        }

        // *************************************************************** //
//        Inclusão de outro aluno
//        final Aluno aluno2 = new Aluno();
//        aluno2.setNome("Lucas");
//        aluno2.setIdade(28);
//        aluno2.setDataNascimento("22/03/1986");
//        aluno2.setCpf("305.560.222-44");
//        aluno2.setNomeMae("Regina");
//        aluno2.setNomePai("João");
//
//        System.out.println("Nome do aluno é " + aluno2.getNome());
//        System.out.println("A idade do aluno é " + aluno2.getIdade());
//        System.out.println("A data de nascimento do aluno é "
//                    + aluno2.getDataNascimento());

    }

    public static void lerArquivo() throws FileNotFoundException {
            File fil = new File("Lines.txt");
            Scanner scanner = new Scanner(fil);
    }


}


