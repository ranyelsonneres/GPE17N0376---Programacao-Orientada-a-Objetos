package abstrato;

public abstract class Jogo {
	String nome;
	int nJogadores;
	
	public Jogo(String nome, int nJogadores) {
		this.nome = nome;
		this.nJogadores = nJogadores;
	}
	
	//metodos abstratos
	public abstract void iniciar();
	public abstract void regras();
	
	//metodo concreto
	public String toString() {
		return "Nome: " + nome;
	}
	

}
