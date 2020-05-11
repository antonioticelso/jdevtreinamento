package mananger;

import model.Aluno;

import javax.swing.*;

public class MainMananger {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
        String nome = JOptionPane.showInputDialog("Nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Idade do aluno: ");
        String dataNascimento = JOptionPane
                .showInputDialog("Data de nascimento do aluno: ");
        String cpf = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
        String mae = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
        String pai = JOptionPane.showInputDialog("Nome do pai do aluno: ");
        String n1 = JOptionPane.showInputDialog("Nota 1 do aluno: ");
        String n2 = JOptionPane.showInputDialog("Nota 2 do aluno: ");
        String n3 = JOptionPane.showInputDialog("Nota 3 do aluno: ");
        String n4 = JOptionPane.showInputDialog("Nota 4 do aluno: ");


        final Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setNota1(Double.parseDouble(n1));
        aluno1.setNota2(Double.parseDouble(n2));
        aluno1.setNota3(Double.parseDouble(n3));
        aluno1.setNota4(Double.parseDouble(n4));


        System.out.println("Nome do aluno é " + aluno1.getNome());
        System.out.println("A idade do aluno é " + aluno1.getIdade());
        System.out.println("A data de nascimento do aluno é "
                + aluno1.getDataNascimento());
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: "
                + (aluno1.getResultado() ? "Aprovado": "Reprovado"));




        // *************************************************************** //
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


}


