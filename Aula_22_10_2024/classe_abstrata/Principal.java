package abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jogo j = new Jogo("Uno", 4);
		Jogo j = new JogoCartas("Uno", 4, "Padrão");
		j.iniciar();
		
		Jogo j2 = new JogoTabuleiro("Xadrez", 2, "Padrão");

	}

}
