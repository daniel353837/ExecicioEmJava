package coleção;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
	 Deque<String> livros = new ArrayDeque<String>();
	 
	 
	 livros.add("O pequeno Principe");
	 livros.push("Don Quixote");
	 livros.push("O Hobbit");
	 
	 System.out.println(livros.peek());
	 System.out.println(livros.element());
	 
	 for(String livro:livros) {
		 System.out.println(livro);
	 }
	 
	 //System.out.println(livros.poll());   // renove da fila se afila estiver vazia retorna nulo
	 //System.out.println(livros.remove());// remove da fila se a fila estiver vazia retorna um erro
	 //System.out.println(livros.pop());  // remove da fila se a fila estiver vazia retorna um erro
	 
	 livros.size(); //mostra o tamanho
	 livros.clear(); // limpa a tela
	// livros.contains(); mostra o conteudo pada pilha
	 
	 
   }
}