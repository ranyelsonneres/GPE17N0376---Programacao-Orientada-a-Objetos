package colecao;

import java.util.*;

public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pedidos = new LinkedList<>();
		
		//FIFO
		
		//adicionar
		//add
		pedidos.add("Pedido 1");
		
		//offer
		pedidos.offer("Pedido 2");
		pedidos.offer("Pedido 3");
		
		
		
		//
		System.out.println(pedidos);
		
		pedidos.remove(); //pedido 1
		
		System.out.println(pedidos.peek());
		pedidos.remove();
		System.out.println(pedidos.poll());

	}

}
