package imc;

public class CalculadoraIMC {
	
	//atributos
	double peso;
	double altura;
	
	//metodos
	//calcular IMC
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	//interpretar
	public String interpretarIMC(double imc) {
		if (imc < 18.5) {
			return "Aabaixo do peso";
		} else if (imc < 24.9) {
			return "Peso normal";
		} else if (imc < 29.9) {
			return "Sobrepreso";
		} else {
			return "Obesidade";
		}
	}

}
