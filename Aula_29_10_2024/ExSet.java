package colecao;

import java.util.*;

public class ExSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> frutas = new LinkedHashSet<>();
		
		//adicionar
		frutas.add("maça");
		frutas.add("uva");
		frutas.add("maça");
		
		System.out.println(frutas);
		
		//outro conjunto
		Set<String> maisFrutas = new HashSet<>();
		maisFrutas.add("abacaxi");
		maisFrutas.add("laranja");
		System.out.println(maisFrutas);
		
		System.out.println();
		
		frutas.addAll(maisFrutas);
		System.out.println(frutas);
		
		
		
	}

}
