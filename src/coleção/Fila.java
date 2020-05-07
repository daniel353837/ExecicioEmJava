package coleção;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// offer e add -> adicionam elementos na fila
		// a diferença ´o comportamento quando a fila esta cheia
		
		fila.add("ana");   
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // se a fila estiver vazia retorna nullo
		System.out.println(fila.peek());
		System.out.println(fila.element()); // se a fila estiver vazia retorna um erro
		System.out.println(fila.element());
		
		
		//fila.sizer();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		
		
		
		
		
		
		
		
	}
}
