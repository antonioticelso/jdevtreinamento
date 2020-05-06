package mananger;

import model.Aluno;

public class MainMananger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Tonhão");
        
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Mariana", 27);

	}

}
