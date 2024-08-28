package veiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o objeto
		Carro meuCarro1 = new Carro();
		Carro meuCarro2 = new Carro();
		
		//utilizar os atributos
		meuCarro1.modelo = "SUV";
		meuCarro1.cor = "Azul";
		meuCarro1.ano = 2020;
		
		meuCarro2.modelo = "Sedan";
		meuCarro2.cor = "Vermelho";
		meuCarro2.ano = 2024;
		meuCarro2.placa = "QKC-1212";
		
		
		meuCarro1.exibirInformacoes();
		meuCarro2.exibirInformacoes();
	}

}
