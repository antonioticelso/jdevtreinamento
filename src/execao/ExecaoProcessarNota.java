package execao;

public class ExecaoProcessarNota extends Exception {

    public ExecaoProcessarNota(String erro) {
        super("Vixxx um erro ao processar as notas dos alunos: " + erro);
    }
}
