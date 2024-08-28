package imc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//instanciei o objeto
		CalculadoraIMC calcIMC = new CalculadoraIMC();
		
		System.out.println("Peso em KG: ");
		calcIMC.peso = sc.nextDouble();
		
		System.out.println("Altura (metros): ");
		calcIMC.altura = sc.nextDouble();

		//calcular o iMC
		double imc = calcIMC.calcularIMC();
		
		String interpretacao = calcIMC.interpretarIMC(imc);
		
		System.out.printf("IMC: %.2f\n", imc);
		System.out.println("Classificacao: " + interpretacao);
		
		sc.close();

	}

}
