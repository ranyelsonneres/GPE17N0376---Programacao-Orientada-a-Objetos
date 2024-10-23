package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioRelogio r = new RadioRelogio();
		
		r.ligar();
		System.out.println("Hora: " + r.horas());
		r.estacao(89.1);
		System.out.println("Estação: " + r.obterEstacao());
		r.desligar();
	}

}
