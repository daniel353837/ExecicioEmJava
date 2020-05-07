package coleção;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>(); importa de forma aleatoria
		
		SortedSet<String> lista = new TreeSet<String>(); // segue a ordem de inclusao
		
		lista.add("Daniel");
		lista.add("Rua");
		lista.add("Carro");
		lista.add("TV");
		
		for (String candidato:lista ) {
			System.out.println(candidato);
		}
	
	    Set<Integer> nums = new HashSet<>();
	    nums.add(1);
	    nums.add(2);
	    nums.add(120);
	    nums.add(6);
	    
	    for (int n:nums) {
			System.out.println(n);
		}
	}

}
