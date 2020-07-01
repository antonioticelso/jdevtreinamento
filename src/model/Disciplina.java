package model;

import java.util.Objects;

public class Disciplina {
    private String disciplina;
    private double[] nota = new double[4];

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

}


