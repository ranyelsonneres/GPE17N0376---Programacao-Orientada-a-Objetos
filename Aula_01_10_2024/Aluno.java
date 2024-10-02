package heranca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor professor = new Professor("Ana", 30, "Artes");
		Aluno aluno = new Aluno("João", 18, "Cinema");
		Pessoa pessoa = new Pessoa("Fulano", 10);
		
		professor.idade = 31;
		
		professor.apresentar();
		aluno.apresentar();

		System.out.println(pessoa);
	}

}
