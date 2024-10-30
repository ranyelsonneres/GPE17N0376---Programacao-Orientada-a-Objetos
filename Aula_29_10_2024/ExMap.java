package colecao;

import java.util.*; //todas as classes
import java.util.Map;
import java.util.HashMap;


public class ExMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> nomes = new HashMap<>();
		
		//adicionar
		nomes.put(1, "Alice");
		nomes.put(2, "Bob");
		nomes.put(3, "Alice");
		//nomes.put(3, "Alice"); não permite chave duplicada 
		
		//remover
		nomes.remove("Alice");
		
		
		
		System.out.println(nomes);
		

	}

}
