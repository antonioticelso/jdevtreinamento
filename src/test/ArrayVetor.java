package test;

import model.Aluno;
import model.Disciplina;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {

//        String[] valores = new String[4];
//        valores[0] = "antonio";
//        valores[1] = "java";
//        valores[2] = "full stack";
//        valores[3] = "eu";

        double[] notas = {8.8,9.7,7.6,6.8};
        double[] notaslogicas = {7.1,5.7,9.6,7.8};

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Tonhão Prado");
        aluno1.setDataNascimento("14/08/2016");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(notas);

        aluno1.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java com Orientação Objeto");
        disciplina2.setNota(notas);

        aluno1.getDisciplinas().add(disciplina2);

//        *******************************************************************
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Tonhão Prado");
        aluno2.setDataNascimento("14/08/2016");

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Banco de Dados");
        disciplina3.setNota(notas);

        aluno1.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java com Orientação Objeto");
        disciplina4.setNota(notas);

        aluno2.getDisciplinas().add(disciplina4);

//        *******************************************************************

        Aluno[] arrayAlunos = new Aluno[2];

        for (int pos = 0; pos < arrayAlunos.length; pos++) {
            System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());

            for (Disciplina disciplina : arrayAlunos[pos].getDisciplinas()) {
                System.out.println("Nome da Disciplina: " + disciplina.getDisciplina());

                for (int posNota = 0; posNota < disciplina.getNota().length; posNota++) {
                    System.out.println("A nota do " + (posNota + 1) + "º Bimestre é: "
                            + disciplina.getNota()[posNota]);
                }
            }

        }

        arrayAlunos[0] = aluno1;
        arrayAlunos[1] = aluno2;



//        Primeira compilação de nota máxima e minima
//        System.out.println("Nome do Aluno: " + aluno.getNome() + " nascido em: " + aluno.getDataNascimento());
//        System.out.println("********************* Disciplina do Aluno *********************");
//        for (Disciplina disciplina : aluno.getDisciplinas()) {
//            System.out.println("\nDisciplina: " + disciplina.getDisciplina());
//            System.out.println("Notas da disciplina são: ");
//
//            double notaMax = 0.0;
//            double notaMin = 0.0;
//            for (int pos = 0; pos < disciplina.getNota().length; pos ++) {
//                System.out.println("Nota: " + (pos + 1) + " = " + disciplina.getNota()[pos]);
//
//                if (pos == 0) {
//                    notaMax = disciplina.getNota()[pos];
//                    notaMin = disciplina.getNota()[pos];
//                } else {
//                    if (disciplina.getNota()[pos] > notaMax) {
//                        notaMax = disciplina.getNota()[pos];
//                    }
//                    if (disciplina.getNota()[pos] < notaMin) {
//                        notaMin = disciplina.getNota()[pos];
//                    }
//                }
//
//            }
//            System.out.println("A maior nota da disciplica " + disciplina.getDisciplina()
//                    + " = " + notaMax + "\n ");
//
//        }


        //        Primeira forma de trabalhar com o Array
//        String posicoes = JOptionPane.showInputDialog("Quantas notas seram inseridas? ");
//        double notas[] = new double[Integer.parseInt(posicoes)];
//
//        for (int pos = 0; pos < notas.length; pos++) {
//            String valor = JOptionPane.showInputDialog("Informe o valor da " + (pos + 1) + " : ");
//            notas[pos] = Double.valueOf(valor);
//        }
//        for (int pos = 0; pos < notas.length; pos++) {
//            System.out.println("Nota: " + (pos + 1) + " eh: " + notas[pos]);
//        }
    }
}
