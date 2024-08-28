package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//instanciar o objeto
		Calculadora calc = new Calculadora();
		
		//passar os dados de leitura
		System.out.println("Num1: ");
		calc.num1 = sc.nextDouble();
		
		System.out.println("Num2: ");
		calc.num2 = sc.nextDouble();
		
		System.out.println("Soma: " + calc.soma());
		System.out.println("Subtração: " + calc.subtrair());
		
		sc.close();

	}

}
