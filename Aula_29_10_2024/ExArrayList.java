package colecao;

import java.util.*; //todas as classes
import java.util.ArrayList; //classe especifica

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Teste 0"); //adicionar
		nomes.add("Teste 1");
		nomes.add("Teste 2");
		nomes.add("Teste 2");
		
		//nomes.remove("Teste 1"); //remover
		//nomes.remove(0);
		
		//nomes.set(0, "Teste 3");
		
		System.out.println(nomes); //imprimir a lista
		
		//percorrer os elementos
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		
		//foreach.map
		nomes.forEach(nome -> System.out.println(nome));
		
		nomes.clear();
		System.out.println(nomes);

	}

}
